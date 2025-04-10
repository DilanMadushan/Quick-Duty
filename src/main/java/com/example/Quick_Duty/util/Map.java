package com.example.Quick_Duty.util;

import com.example.Quick_Duty.dto.TaskDTO;
import com.example.Quick_Duty.entity.Task;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
public class Map {
    private final ModelMapper modelMapper;

    public Task toTask(TaskDTO taskDTO) {
        return modelMapper.map(taskDTO, Task.class);
    }

    public TaskDTO toTaskDTO(Task task) {
        return modelMapper.map(task, TaskDTO.class);
    }
}
