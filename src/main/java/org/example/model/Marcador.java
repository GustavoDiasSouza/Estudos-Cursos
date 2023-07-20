package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Marcador {
    private Vertice melhorVertice;
    private Integer distancia;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Marcador{");
        if(melhorVertice != null){
            stringBuilder.append(" melhorVertice=").append(melhorVertice.getPosicao());
            stringBuilder.append(", distancia=").append(distancia);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
