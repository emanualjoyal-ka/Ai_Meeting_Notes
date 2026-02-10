package com.emanualjoyal.AI_Meeting_Notes.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class User extends BaseEntity {
    @Indexed(unique=true)
    private String email;

    private String password;

    private String firstName;
    private String lastName;

    private String role="USER";

    private String organizationId;

    public User(){
        super();
    }

    public User(String email,String password,String firstName,String lastName){
        this();
        this.email=email;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
