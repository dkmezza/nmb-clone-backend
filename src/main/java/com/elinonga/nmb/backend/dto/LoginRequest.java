package com.elinonga.nmb.backend.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String phoneNumber;
    private String pin;
}
