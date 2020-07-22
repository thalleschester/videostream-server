package com.tchester.videostream.controllers.dto;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class FileDTO {

    private final UUID id;
    private final String name;
    private final String description;
    private final String cover;
    private final String thumb;

}
