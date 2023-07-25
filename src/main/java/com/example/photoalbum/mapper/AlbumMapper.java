package com.example.photoalbum.mapper;

import com.example.photoalbum.dto.AlbumDto;
import com.example.photoalbum.entity.Album;

public class AlbumMapper {

    /**
     * 1. id
     * 2. albumName
     * 3. createdAt
     * 4. Member
     * 5. Photos
     */


    // DTO --> Entity
    public static Album convertToEntity(AlbumDto dto) {
        Album album = new Album();
        album.setId(dto.getAlbumId());
        album.setAlbumName(dto.getAlbumName());
        album.setCreatedAt(dto.getCreatedAt());
        return album;
    }

    // Entity --> DTO
    public static AlbumDto convertToDto(Album album) {
        AlbumDto albumDto = new AlbumDto();
        albumDto.setAlbumId(album.getId());
        albumDto.setAlbumName(album.getAlbumName());
        albumDto.setCreatedAt(album.getCreatedAt());
        return albumDto;
    }

} // album mapper