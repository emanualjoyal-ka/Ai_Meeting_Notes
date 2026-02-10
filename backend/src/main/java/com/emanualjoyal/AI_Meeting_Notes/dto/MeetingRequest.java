package com.emanualjoyal.AI_Meeting_Notes.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class MeetingRequest {
    @NotBlank(message = "Title is required")
    private String title;

    private String meetingDate;
    private List<String> participants;

    @NotBlank(message = "Notes are required")
    private String rawNotes;
}
