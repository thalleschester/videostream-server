package com.tchester.videostream.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class FileDTO {

    private UUID id;
    private String name;
    private String description;
    private String cover;
    private String thumb;

}
