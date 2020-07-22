package com.tchester.videostream.controllers;

import com.tchester.videostream.controllers.dto.FileDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/paths/{pathId}/files")
public class FileController {

    @GetMapping
    public List<FileDTO> path(@PathVariable UUID pathId){
        return new ArrayList<>();
    }

}
