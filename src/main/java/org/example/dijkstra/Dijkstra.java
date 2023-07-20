package org.example.dijkstra;


import org.example.model.Aresta;
import org.example.model.Vertice;

import java.util.List;

public class Dijkstra {



    public void ligarDoisPontos(final int localDeSaida, final int localDeChegada, List<Vertice> listaDeVertice){
        Vertice verticeDeSaida = listaDeVertice.get(localDeSaida-1);
        Vertice verticeDeChegada = listaDeVertice.get(localDeChegada-1);

        resetarDistancias(verticeDeSaida, listaDeVertice);


        System.out.println("Vertice de saida"+ verticeDeSaida.toString());
        System.out.println("Vertice de chegada"+ verticeDeChegada.toString());

        encontrarMelhorRota(verticeDeSaida, verticeDeChegada);

        for(Vertice vertice : listaDeVertice){
            System.out.println(vertice);
        }

    }


    private void encontrarMelhorRota(Vertice verticeDeSaida, Vertice verticeDeChegada){
        for (Aresta aresta: verticeDeSaida.getConexoes()){
            int distancia = aresta.getPeso()+verticeDeSaida.getMarcador().getDistancia();

            if (distancia < aresta.getDestino().getMarcador().getDistancia()){
                aresta.getDestino().getMarcador().setMelhorVertice(verticeDeSaida);
                aresta.getDestino().getMarcador().setDistancia(distancia);
            }
            encontrarMelhorRota(aresta.getDestino(), verticeDeChegada);
        }


    }



    private void resetarDistancias(Vertice verticeDeSaida, List<Vertice> list){
        for (Vertice vertice : list){
            vertice.getMarcador().setDistancia(Integer.MAX_VALUE);
        }

        verticeDeSaida.getMarcador().setDistancia(0);
    }

}
