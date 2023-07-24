package com.example.photoalbum.service;

import com.example.photoalbum.entity.Album;
import com.example.photoalbum.repository.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;

    public void save(Album album) {
        albumRepository.save(album);
    }
    public Album getAlbum(Long albumId) {
        Optional<Album> res = albumRepository.findById(albumId);
        if (res.isPresent()) {
            return res.get();
        } else {
            throw new EntityNotFoundException(String.format("앨범 아이디 %d로 조회되지 않습니다.", albumId));
        }
    }



} // album service