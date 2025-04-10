package com.example.Quick_Duty.service;

import com.example.Quick_Duty.dto.TaskDTO;
import com.example.Quick_Duty.entity.Task;
import com.example.Quick_Duty.exceptions.TaskAlradyExsistException;
import com.example.Quick_Duty.exceptions.TaskNotFoundException;
import com.example.Quick_Duty.repostory.TaskRepostory;
import com.example.Quick_Duty.util.Conveter;
import com.example.Quick_Duty.util.Map;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepostory taskRepostory;
    private final Map map;
    private final Conveter conveter;

    @Override
    public void saveTask(TaskDTO task) {
        if(taskRepostory.existsById(task.getId())) throw new TaskAlradyExsistException("Task already exists");
        taskRepostory.save(map.toTask(task));
    }

    @Override
    public void updateTask(TaskDTO task) {
        Task foundTask = taskRepostory.findById(task.getId()).orElseThrow(() -> new TaskNotFoundException("Task not found"));
        Task updatedTask = map.toTask(task);
        conveter.convertTask(foundTask,updatedTask);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepostory.findById(id).orElseThrow(() -> new TaskNotFoundException("Task not found"));
        taskRepostory.deleteById(id);
    }

    @Override
    public List<TaskDTO> getAllTasks() {
        return List.of();
    }

    @Override
    public void findTask(Long id) {

    }
}
