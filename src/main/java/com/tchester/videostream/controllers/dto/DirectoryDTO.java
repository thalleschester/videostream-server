package com.tchester.videostream.controllers.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Builder
@RequiredArgsConstructor
public class DirectoryDTO {

    private final Long id;
    private final String name;
    private final String path;

}
