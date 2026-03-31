package com.example.TaskManagementSystem.Service;

import com.example.TaskManagementSystem.Entity.taskManage;
import com.example.TaskManagementSystem.Repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepo tr;

    //creates tasks
    public taskManage saveTask(taskManage t1)
    {
        return tr.save(t1);
    }

    // reads all tasks
    public List<taskManage> getAllTasks() {
        return tr.findAll();
    }

    //reads a specific task
    public taskManage getTaskById(Long id)
    {
        taskManage t2=  tr.findById(id).orElse(null);
        if(t2==null)
            throw new RuntimeException("Task not found with id: " + id);
        return t2;
    }

    //update task by id
    public taskManage updateTask(Long id, taskManage updatedTask) {

        taskManage existingTask = tr.findById(id).orElse(null);

        if (existingTask != null) {
            existingTask.setTitle(updatedTask.getTitle());
            existingTask.setStatus(updatedTask.getStatus());

            return tr.save(existingTask);
        }

        return null;
    }

    //delete task by id
    public String deleteTask(Long id) {

        if (tr.existsById(id))
        {
            tr.deleteById(id);
            return "Task deleted successfully";
        }
        return "Task not found";
    }
}

