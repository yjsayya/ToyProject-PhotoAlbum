package com.example.photoalbum.repository;

import com.example.photoalbum.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {

    int countByAlbumId(Long AlbumId);

} // photo repository