package com.emanualjoyal.AI_Meeting_Notes.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String role;

    public UserDTO(String id,String email,String firstName,String lastName,String role){
        this.id=id;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
        this.role=role;

    }
}
