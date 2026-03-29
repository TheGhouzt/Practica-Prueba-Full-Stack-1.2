package com.example.comics.repository;
import com.example.comics.model.Comic;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ComicRepository {
    private List<Comic> listaComic = new ArrayList<>();

    public List<Comic> obtenerComic(){
        return listaComic;
    }

    public Comic buscarPorId(int id){
        for (Comic comic : listaComic){
            if (comic.getId() == id){
                return comic;
            }
        }
        return null;
    }

    public Comic buscarPorIsbn(String isbn){
        for (Comic comic : listaComic){
            if (comic.getIsbn().equals(isbn)){
                return comic;
            }
        }
        return null;
    }

    public Comic guardar(Comic com){
        listaComic.add(com);
            return com;
    }

    public Comic actualizar(Comic com){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i<listaComic.size(); i++){
            if(listaComic.get(i).getId() == com.getId()){
                id = com.getId();
                idPosicion = i;
            }
        }

        Comic comic1 = new Comic();
        comic1.setId(id);
        comic1.setTitulo(com.getTitulo());
        comic1.setAutor(com.getAutor());
        comic1.setFechaPublicacion(com.getFechaPublicacion());
        comic1.setEditorial(com.getEditorial());
        comic1.setIsbn(com.getIsbn());

        listaComic.set(idPosicion, comic1);
        return comic1;
    }

    public void eliminar(int id){
        Comic comic = buscarPorId(id);
        if (comic != null){
            listaComic.remove(comic);
        }
    }
}
