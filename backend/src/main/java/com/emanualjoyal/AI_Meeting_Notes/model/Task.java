package com.emanualjoyal.AI_Meeting_Notes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Data
@EqualsAndHashCode(callSuper = true)
public class Task extends BaseEntity{

    private String userId;
    private String organizationId;
    private String meetingId;

    private String title;
    private String description;
    private String assignedTo;
    private String priority;
    private String status="PENDING"; //PENDING,IN-PROGRESS,COMPLETED

    private String dueDate;

    public Task(){
        super();
    }
}
