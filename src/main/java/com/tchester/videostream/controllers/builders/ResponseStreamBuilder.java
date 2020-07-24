package com.tchester.videostream.controllers.builders;

import com.tchester.videostream.models.StreamedContent;
import org.springframework.http.ResponseEntity;

public class ResponseStreamBuilder {

    private StreamedContent streamedContent;

    public ResponseStreamBuilder setStreamedContent(final StreamedContent streamedContent){
        this.streamedContent = streamedContent;
        return this;
    }

    public ResponseEntity<byte[]> build(){
        return null;
    }
}
