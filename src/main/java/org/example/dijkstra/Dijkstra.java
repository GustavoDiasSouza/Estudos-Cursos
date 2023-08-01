package org.example.dijkstra;


import org.example.model.Aresta;
import org.example.model.Vertice;

import java.util.List;

public class Dijkstra {



    public void ligarDoisPontos(final int localDeSaida, final int localDeChegada, List<Vertice> listaDeVertice){
        Vertice verticeDeSaida = listaDeVertice.get(localDeSaida-1);
        Vertice verticeDeChegada = listaDeVertice.get(localDeChegada-1);

        resetarMarcadores(verticeDeSaida, listaDeVertice);

        System.out.println("Vertice de saida: "+ verticeDeSaida.toString());
        System.out.println("Vertice de chegada: "+ verticeDeChegada.toString()+ "\n");

        avaliarRota(verticeDeSaida, verticeDeChegada);

        for(Vertice vertice : listaDeVertice){
            System.out.println(vertice);
        }

    }

    private void avaliarRota(Vertice verticeDeSaida, Vertice verticeDeChegada){

        for (Aresta aresta: verticeDeSaida.getConexoes()){

            if ( verificarSeJaPassou(verticeDeSaida, aresta.getDestino().getPosicao()) ){
//                aresta.getDestino().getMarcador().passandoPor(verticeDeSaida.getPosicao());
                verticeDeSaida.getMarcador().passandoPor(aresta.getDestino().getPosicao());

                int distancia = aresta.getPeso() + verticeDeSaida.getMarcador().getDistancia();

                if (distancia < aresta.getDestino().getMarcador().getDistancia()){
                    aresta.getDestino().getMarcador().setMelhorVertice(verticeDeSaida);
                    aresta.getDestino().getMarcador().setDistancia(distancia);
                }

                if ( aresta.getDestino() != verticeDeChegada){
                    avaliarRota(aresta.getDestino(), verticeDeChegada);
                }
            }
        }
    }


    private void resetarMarcadores(Vertice verticeDeSaida, List<Vertice> list){
        for (Vertice vertice : list){
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