package com.tchester.videostream.controllers;

import com.tchester.videostream.controllers.dto.DirectoryDTO;
import com.tchester.videostream.controllers.mappers.DirectoryMapper;
import com.tchester.videostream.models.Directory;
import com.tchester.videostream.services.DirectoryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/directories")
@RequiredArgsConstructor
public class DirectoryController {

    private final DirectoryService directoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DirectoryDTO create(@RequestBody DirectoryDTO directoryDTO){
        final Directory inputDirectory = DirectoryMapper.toModel(directoryDTO);
        final Directory savedDirectory = directoryService.create(inputDirectory);
        return DirectoryMapper.toDto(savedDirectory);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DirectoryDTO> list(){
        final List<Directory> directories = directoryService.findAll();
        return DirectoryMapper.toDto(directories);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public DirectoryDTO getById(@PathVariable UUID id){
        final Directory directory = directoryService.findById(id);
        return DirectoryMapper.toDto(directory);
    }

}
