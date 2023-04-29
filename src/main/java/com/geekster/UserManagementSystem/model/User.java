package com.geekster.UserManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    private int userId;

    @NotBlank
    private String username;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String dob;

    @NotBlank
    @Pattern(regexp ="[A-Za-z]+[0-9]+@[A-Za-z]+.[A-Za-z]+")
    private String email;

    @Size(min = 10,max =12)
    private String phoneNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;

    private LocalTime  time=LocalTime.now();
}
