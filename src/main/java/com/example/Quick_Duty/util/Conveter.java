package com.example.Quick_Duty.util;

import com.example.Quick_Duty.entity.Task;
import org.springframework.stereotype.Component;


@Component
public class Conveter {
    public Task convertTask(Task foundTask,Task updatedTask) {
        foundTask.setTitle(updatedTask.getTitle());
        foundTask.setDescription(updatedTask.getDescription());
        foundTask.setStatus(updatedTask.getStatus());
        foundTask.setCreatedAt(updatedTask.getCreatedAt());
        return foundTask;
    }
}
