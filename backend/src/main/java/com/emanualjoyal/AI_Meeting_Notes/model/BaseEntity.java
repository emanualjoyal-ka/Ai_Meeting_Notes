package com.emanualjoyal.AI_Meeting_Notes.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseEntity {
    @Id
    private String id;

    @CreatedDate
    @Field("created_at")
    private LocalDateTime createdAt;

    @Field("is_deleted")
    private Boolean isDeleted=false;
}
