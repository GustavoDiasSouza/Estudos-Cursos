package org.example.dijkstra;


import org.example.build.model.Aresta;
import org.example.build.model.Vertice;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {



    public void ligarDoisPontos(final int localDeSaida, final int localDeChegada, List<Vertice> listaDeVertice){
        List<Vertice> caminho = new ArrayList<>();

        Vertice verticeDeSaida = listaDeVertice.get(localDeSaida-1);
        Vertice verticeDeChegada = listaDeVertice.get(localDeChegada-1);

        resetarMarcadores(verticeDeSaida, listaDeVertice);

        System.out.println("Vertice de saida: "+ verticeDeSaida.toString());
        System.out.println("Vertice de chegada: "+ verticeDeChegada.toString()+ "\n");

        avaliarRotas(verticeDeSaida);
        caminho = encontrarMelhorRota(verticeDeChegada, verticeDeSaida, caminho);

        for(Vertice vertice : listaDeVertice){
            System.out.println(vertice);
        }

        System.out.println("------------");

        StringBuilder stringBuilder = new StringBuilder();
        for(Vertice vertice : caminho){
            stringBuilder.append(vertice.getPosicao()).append(">--");
        }
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }

    private List<Vertice> encontrarMelhorRota(Vertice verticeDeChegada, Vertice verticeDeSaida, List<Vertice> caminho){
        if (verticeDeSaida == verticeDeChegada || verticeDeChegada == null ){
            caminho.add(verticeDeSaida);
            return caminho;
        }

        caminho.add(verticeDeChegada);

        return encontrarMelhorRota(verticeDeChegada.getMarcador().getMelhorVertice(), verticeDeSaida, caminho);
    }

    private void avaliarRotas(Vertice verticeDeSaida){

        for (Aresta aresta: verticeDeSaida.getArestas()){

            if ( verificarSeJaPassou(verticeDeSaida, aresta.getDestino().getPosicao()) ){

                verticeDeSaida.getMarcador().passandoPor(aresta.getDestino().getPosicao());

                int distancia = aresta.getPeso() + verticeDeSaida.getMarcador().getDistancia();

                if (distancia < aresta.getDestino().getMarcador().getDistancia()){
                    aresta.getDestino().getMarcador().setMelhorVertice(verticeDeSaida);
                    aresta.getDestino().getMarcador().setDistancia(distancia);
                }

                avaliarRotas(aresta.getDestino());
            }
        }
    }


    private void resetarMarcadores(Vertice verticeDeSaida, List<Vertice> list){
        for (Vertice vertice : list){
            vertice.getMarcador().getPosicoesJaValidadas().clear();
            vertice.getMarcador().setDistancia(Integer.MAX_VALUE);
        }

        verticeDeSaida.getMarcador().setDistancia(0);
    }

    private boolean verificarSeJaPassou(Vertice vertice, Integer destino){
        for ( Integer posicoesJaValidadas : vertice.getMarcador().getPosicoesJaValidadas()){
            if (posicoesJaValidadas.equals(destino) ){
                return false;
            }
        }
        return true;
    }
}