package com.tchester.videostream.controllers.mappers;

import com.tchester.videostream.controllers.dto.DirectoryDTO;
import com.tchester.videostream.models.Directory;

import java.util.List;
import java.util.stream.Collectors;

public class DirectoryMapper {


    public static Directory toModel(final DirectoryDTO directoryDTO) {
        final Directory.DirectoryBuilder builder = Directory.builder();
        builder.name(directoryDTO.getName());
        builder.path(directoryDTO.getPath());
        return builder.build();
    }

    public static DirectoryDTO toDto(final Directory directory) {
        final DirectoryDTO.DirectoryDTOBuilder builder = DirectoryDTO.builder();
        builder.id(directory.getId());
        builder.name(directory.getName());
        builder.path(directory.getPath());
        return builder.build();
    }

    public static List<DirectoryDTO> toDto(List<Directory> directories) {
        return directories.stream().map(DirectoryMapper::toDto).collect(Collectors.toList());
    }
}
