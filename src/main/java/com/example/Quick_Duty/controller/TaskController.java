package com.example.Quick_Duty.controller;

import com.example.Quick_Duty.dto.TaskDTO;
import com.example.Quick_Duty.entity.Task;
import com.example.Quick_Duty.exceptions.TaskAlradyExsistException;
import com.example.Quick_Duty.exceptions.TaskNotFoundException;
import com.example.Quick_Duty.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/health")
    public String health() {
        return "Task Service is healthy";
    }

    @PostMapping
    public ResponseEntity<?> saveTask(@RequestBody TaskDTO taskDTO) {
        try{
            taskService.saveTask(taskDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (TaskAlradyExsistException e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<?> updateTask(@RequestBody TaskDTO taskDTO) {
        try {
            taskService.updateTask(taskDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (TaskNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        try {
            taskService.deleteTask(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (TaskNotFoundException e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
