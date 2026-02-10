package com.emanualjoyal.AI_Meeting_Notes.repository;

import com.emanualjoyal.AI_Meeting_Notes.model.Meeting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends MongoRepository<Meeting,String> {
    List<Meeting> findByUserId(String userId);

    List<Meeting> findByUserIdAndStatus(String userId,String status);

    List<Meeting> findByOrganizationId(String organizationId);
}
