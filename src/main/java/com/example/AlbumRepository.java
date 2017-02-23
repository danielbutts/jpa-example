package com.example;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by danielbutts on 2/23/17.
 */
public interface AlbumRepository extends CrudRepository<Album, Long> {

    Album findAlbums();

}
