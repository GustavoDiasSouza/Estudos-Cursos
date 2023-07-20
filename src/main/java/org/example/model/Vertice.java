package org.example.model;

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
    private List<Aresta> conexoes = new ArrayList<>();




}
