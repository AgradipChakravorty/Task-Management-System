package com.example.TaskManagementSystem.Controller;

import com.example.TaskManagementSystem.Entity.taskManage;
import com.example.TaskManagementSystem.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // CREATE task
    @PostMapping
    public taskManage createTask(@RequestBody taskManage task) {
        return taskService.saveTask(task);
    }

    // READ ALL tasks
    @GetMapping
    public List<taskManage> getAllTasks() {
        return taskService.getAllTasks();
    }

    // READ tasks BY ID
    @GetMapping("/{id}")
    public taskManage getTask(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    //UPDATE tasks by id
    @PutMapping("/{id}")
    public taskManage updateTask(@PathVariable Long id, @RequestBody taskManage task) {
        return taskService.updateTask(id, task);
    }

    //DELETE by id
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id);
    }

}
