package org.example.build.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class Aresta {

    private Vertice destino;
    private Integer peso;


    @Override
    public String toString() {
        return "Aresta{" +
                "destino=" + destino.getPosicao() +
                ", peso=" + peso +
                '}';
    }
}
