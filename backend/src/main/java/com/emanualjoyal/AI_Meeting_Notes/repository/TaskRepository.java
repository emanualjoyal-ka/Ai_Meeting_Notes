package com.emanualjoyal.AI_Meeting_Notes.repository;

import com.emanualjoyal.AI_Meeting_Notes.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task,String> {

    List<Task> findByUserId(String userId);
    List<Task> findByMeetingId(String meetingId);
    List<Task> findByAssignedTo(String assignedTo);
    List<Task> findByUserIdAndStatus(String userId,String status);

}
