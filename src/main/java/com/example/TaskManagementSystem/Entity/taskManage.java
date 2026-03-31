package com.example.TaskManagementSystem.Entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table( name = "task_Manage" )


public class taskManage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Boolean status;

    public taskManage(Long id, String tit, Boolean sta) {
        this.id = id;
        this.title = tit;
        this.status = sta;
    }

    public taskManage() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
