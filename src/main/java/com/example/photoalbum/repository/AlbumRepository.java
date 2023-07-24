package com.example.photoalbum.repository;

import com.example.photoalbum.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,Long> {

    List<Album> findByAlbumName(String name);

} // album repository