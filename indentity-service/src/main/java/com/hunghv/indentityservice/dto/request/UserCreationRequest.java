package com.hunghv.indentityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    String username;
    @Size(min = 8, message = "ARGS_INVALID")
    String password;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
}