package com.app.controller.dto;

import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.util.List;
@Validated
public record AuthCreateRoleRequest(
        @Size(max = 3, message = "No user can possess more than three roles.")
        List<String> roleListName) {
}
