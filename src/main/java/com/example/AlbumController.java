package com.example;

import org.springframework.web.bind.annotation.*;

/**
 * Created by danielbutts on 2/23/17.
 */

@RestController
@RequestMapping("/store")
public class AlbumController {

    public final AlbumRepository repository;

    public AlbumController(AlbumRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/albums")
    public Album[] getAlbums(@RequestBody Album[] albums) {
        this.repository.findAlbums();
        return albums;
    }

    @PostMapping("/add")
    public Album addAlbum(@RequestBody Album album) {
        this.repository.save(album);
        return album;
    }

}
