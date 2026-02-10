package com.emanualjoyal.AI_Meeting_Notes.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MeetingResponse {
    private String id;
    private String title;
    private String meetingDate;
    private List<String> participants;
    private String rawNotes;
    private String aiSummary;
    private List<String> keyDecisions;
    private List<String> actionItems;
    private String status;
    private LocalDateTime createdAt;

    public MeetingResponse(String id, String title, String meetingDate,
                           List<String> participants, String rawNotes,
                           String aiSummary, List<String> keyDecisions,
                           List<String> actionItems, String status,
                           LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.meetingDate = meetingDate;
        this.participants = participants;
        this.rawNotes = rawNotes;
        this.aiSummary = aiSummary;
        this.keyDecisions = keyDecisions;
        this.actionItems = actionItems;
        this.status = status;
        this.createdAt = createdAt;
    }

}
