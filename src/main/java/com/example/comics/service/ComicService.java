package com.example.comics.service;
import com.example.comics.model.Comic;
import com.example.comics.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicService {
    @Autowired
    private ComicRepository comicRepository;

    public List<Comic> getComic(){
        return comicRepository.obtenerComic();
    }

    public Comic saveComic(Comic comic){
        return comicRepository.guardar(comic);
    }

    public Comic updateComic(Comic comic){
        return comicRepository.actualizar(comic);
    }

    public Comic getComicId(int id){
        return comicRepository.buscarPorId(id);
    }

    public String deleteComic(int id){
        comicRepository.eliminar(id);
        return "producto eliminado";
    }
}
