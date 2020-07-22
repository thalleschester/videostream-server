package com.tchester.videostream.controllers;

import com.tchester.videostream.controllers.dto.PathDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paths")
public class PathController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody PathDTO path){
        System.out.println(path);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PathDTO> get(){
        return new ArrayList<>();
    }

}
