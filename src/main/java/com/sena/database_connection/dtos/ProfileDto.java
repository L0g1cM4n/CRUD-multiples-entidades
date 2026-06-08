package com.sena.database_connection.dtos;

import lombok.Data;

@Data
public class ProfileDto {

    private String username;

    private String description;

    private Long userId;
}