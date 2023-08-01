package org.example.build.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Marcador {


    private Vertice melhorVertice;
    private Integer distancia;
    private List<Integer> posicoesJaValidadas = new ArrayList<>();


    public void passandoPor(Integer vertice){
        posicoesJaValidadas.add(vertice);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Marcador{");
        if(melhorVertice != null){
            stringBuilder.append(" melhorVertice=").append(melhorVertice.getPosicao());
            stringBuilder.append(", distancia=").append(distancia);
            stringBuilder.append(", ").append(posicoesJaValidadas.toString());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
