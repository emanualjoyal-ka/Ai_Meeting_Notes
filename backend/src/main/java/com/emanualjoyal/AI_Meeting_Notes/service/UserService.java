package com.emanualjoyal.AI_Meeting_Notes.service;

import com.emanualjoyal.AI_Meeting_Notes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



}
