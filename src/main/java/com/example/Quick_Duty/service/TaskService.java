package com.example.Quick_Duty.service;

import com.example.Quick_Duty.dto.TaskDTO;
import com.example.Quick_Duty.entity.Task;

import java.util.List;

public interface TaskService {
    void saveTask(TaskDTO task);
    void updateTask(TaskDTO task);
    void deleteTask(Long id);
    List<TaskDTO> getAllTasks();
    void findTask(Long id);
}
