package com.tchester.videostream.controllers;

import com.tchester.videostream.controllers.builders.ResponseStreamBuilder;
import com.tchester.videostream.models.StreamedContent;
import com.tchester.videostream.services.StreamService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/stream")
@Setter
@AllArgsConstructor
public class StreamController {

    private StreamService streamService;

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> streamVideo(@RequestHeader(value = "Range", required = false) String httpRangeList,
                                              @PathVariable("fileType") UUID id) {
        final StreamedContent content = streamService.streamFile(id);
        return new ResponseStreamBuilder()
                .setStreamedContent(content)
                .build();
    }

}
