package org.example.dijkstra;


import org.example.model.Vertice;

import java.util.List;

public class Dijkstra {



    public void ligarDoisPontos(final int localDeSaida, final int localDeChegada, List<Vertice> listaDeVertice){
        Vertice verticeDeSaida = listaDeVertice.get(localDeSaida-1);
        Vertice verticeDeChegada = listaDeVertice.get(localDeChegada-1);


        System.out.println("Vertice de saida"+ verticeDeSaida.toString());
        System.out.println("Vertice de chegada"+ verticeDeChegada.toString());
    }
}
