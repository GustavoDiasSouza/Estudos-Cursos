package org.example.build.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vertice {

    private Integer posicao;
    private Marcador marcador = new Marcador();
    private List<Aresta> arestas = new ArrayList<>();



}
