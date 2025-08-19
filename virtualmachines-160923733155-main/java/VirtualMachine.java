package com._160923733155.virtualmachines.model;

/**
 * Virtual Machine Data Model
 * 
 * @author abdul ahad
 * @studentId 160923733155
 * @version 1.0
 */
public class VirtualMachine {
    private String id;
    private String title;
    private String description;
    private String status;
    private String createdBy = "abdul ahad"; // Author identifier
    private String projectId = "160923733155"; // Project identifier

    public VirtualMachine() {}

    public VirtualMachine(String id, String title, String description, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdBy = "abdul ahad";
        this.projectId = "160923733155";
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "VirtualMachine{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}