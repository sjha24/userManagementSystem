package com.saurav.userManagementSystem.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @NotEmpty
    private String userID;
    @NotBlank
    private String userName;
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$")//"1995-04-01"
    private String DateOfBirth;
    @Email
    private String Email;
    @Pattern(regexp = "\\d{12}")
    private String phoneNumber;
    private LocalDate Date;
    private LocalTime time;
}
