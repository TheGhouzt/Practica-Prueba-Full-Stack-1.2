package com.example.comics.controller;
import com.example.comics.service.ComicService;
import com.example.comics.model.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comic")
public class ComicController {
    @Autowired
    private ComicService comicService;

    @GetMapping
    public List<Comic> listarComics(){
        return comicService.getComic();
    }

    @PostMapping
    public Comic agregarComic(@RequestBody Comic comic){
        return comicService.saveComic(comic);
    }

    @GetMapping("{id}")
    public Comic buscarComic(@PathVariable int id){
        return comicService.getComicId(id);
    }

    @PutMapping("{id}")
    public Comic actualizarComic(@PathVariable int id, @RequestBody Comic comic){
        return comicService.updateComic(comic);
    }

    @DeleteMapping("{id}")
    public String eliminarComic(@PathVariable int id){
        return comicService.deleteComic(id);
    }
}
