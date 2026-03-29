package com.example.comics.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Comic {
    private int id, fechaPublicacion;
    private String titulo, autor, isbn, editorial;
}
