package com.tchester.videostream.services;

import com.tchester.videostream.models.Directory;
import com.tchester.videostream.repositories.DirectoryRepository;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Setter
@AllArgsConstructor
public class DirectoryService {

    private DirectoryRepository repository;

    public Directory create(final Directory directory) {
        return repository.save(directory);
    }

    public Directory findById(final UUID id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Directory not found!"));
    }

    public List<Directory> findAll() {
        return repository.findAll();
    }
}
