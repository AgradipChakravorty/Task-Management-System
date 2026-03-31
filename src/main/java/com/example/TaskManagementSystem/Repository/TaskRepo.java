package com.example.TaskManagementSystem.Repository;

import com.example.TaskManagementSystem.Entity.taskManage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<taskManage,Long> {
}
