package com.example.demo5.Pojo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    @NotEmpty
    @Min(value = 5,message = "id should be 3 or more character")
    private String user_id;

    @NotEmpty
    @Min(value = 3,message = "username should be 3 or more character")
    private String username;

    @NotEmpty
    @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
    private String password;

    @NotEmpty
    @Email
    private String email;


   @NotEmpty
   @Pattern(regexp = "\\b(Admin|Customer)\\b",message = "roll must be Admin or Customer")
    private String role;

    @NotEmpty
    @Positive
    private String balance;



}
