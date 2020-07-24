package com.tchester.videostream.repositories;

import com.tchester.videostream.models.Directory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DirectoryRepository extends JpaRepository<Directory, UUID> {
}
