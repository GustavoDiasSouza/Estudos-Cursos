package org.example.model;

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
