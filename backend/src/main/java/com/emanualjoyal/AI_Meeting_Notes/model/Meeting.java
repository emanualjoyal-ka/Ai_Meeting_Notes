package com.emanualjoyal.AI_Meeting_Notes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "meeting")
@Data
@EqualsAndHashCode(callSuper = true)
public class Meeting extends BaseEntity{

    private String userId;
    private String organizationId;

    private String title;

    @Field("meeting_date")
    private String meetingDate;

    private List<String> participants;

    private String rawNotes;

    //OpenAI
    private String aiSummary;
    private List<String> keyDecisions;
    private List<String>actionItems;

    //status
    private String status="DRAFT"; //DRAFT,PROCESSED,ARCHIVED

    public Meeting(){
        super();
    }

    public Boolean isAiProcessed(){
        return aiSummary !=null && !aiSummary.isEmpty();
    }

}
