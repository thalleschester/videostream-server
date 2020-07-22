package com.tchester.videostream.controllers.dto;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class PathDTO {

    private final UUID id;
    private final String name;
    private final String path;

}
