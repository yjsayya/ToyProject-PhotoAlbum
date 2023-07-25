package com.example.photoalbum.controller;

import com.example.photoalbum.dto.AlbumDto;
import com.example.photoalbum.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping("/albums/{albumId}")
    public ResponseEntity<AlbumDto> getAlbum(@PathVariable("albumId") final long albumId) {
        AlbumDto albumDto = albumService.findById(albumId);
        return new ResponseEntity<>(albumDto, HttpStatus.OK);
    }

    @PostMapping("/albums")
    public ResponseEntity<AlbumDto> createAlbum(@RequestBody final AlbumDto albumDto) {

    }


} // album controlelr