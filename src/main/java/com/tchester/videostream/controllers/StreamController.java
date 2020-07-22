package com.tchester.videostream.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stream")
@RequiredArgsConstructor
public class StreamController {


    @GetMapping("/{id}")
    public ResponseEntity<byte[]> streamVideo(@RequestHeader(value = "Range", required = false) String httpRangeList,
                                              @PathVariable("fileType") String id) {
        return null;
    }

}
