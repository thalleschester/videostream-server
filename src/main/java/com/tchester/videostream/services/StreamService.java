package com.tchester.videostream.services;

import com.tchester.videostream.models.StreamedContent;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StreamService {

    public StreamedContent streamFile(UUID id) {
        return new StreamedContent();
    }

}
