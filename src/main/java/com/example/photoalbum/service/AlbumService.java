package com.example.photoalbum.service;

import com.example.photoalbum.dto.AlbumDto;
import com.example.photoalbum.entity.Album;
import com.example.photoalbum.mapper.AlbumMapper;
import com.example.photoalbum.repository.AlbumRepository;
import com.example.photoalbum.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;
    private final PhotoRepository photoRepository;


    /**
     * 사진 저장하기
     */
    public AlbumDto createAlbum(AlbumDto albumDto) {
        Album album = AlbumMapper.convertToEntity(albumDto);
        this.albumRepository.save(album);
        return
    }

    /**
     * 앨범 아이디로 앨범 - 조회하기
     */
    public AlbumDto findById(Long albumId) {
        Optional<Album> res = albumRepository.findById(albumId);
        if (res.isPresent()) {
            AlbumDto albumDto = AlbumMapper.convertToDto(res.get());
            albumDto.setCount(photoRepository.countByAlbumId(albumId));
            return albumDto;
        } else {
            throw new EntityNotFoundException(String.format("앨범 아이디 %d로 조회되지 않았습니다", albumId));
        }
    }







} // album service