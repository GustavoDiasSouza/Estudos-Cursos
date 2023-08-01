package org.example.prim;

import org.example.build.model.Aresta;
import org.example.build.model.Vertice;

import java.util.ArrayList;
import java.util.List;

import static org.example.Main.listaDeVertice;

public class Prim {

    private final List<Vertice> minimoDeVertice = new ArrayList<>();
    private int total;

    public void arvoreGeradoraMinima(Vertice verticeDeComeco, int minimo){
        total = minimo;
        for (int i = 0; i < minimo; i++) {
            pegarArestaDeMenorPeso(verticeDeComeco);
        }

        for (Vertice vertice : minimoDeVertice){
            System.out.println(vertice.toString());
        }
    }

    private void pegarArestaDeMenorPeso(Vertice vertice){
        Aresta arestaDeMenorPeso = null;

        if (vertice == null){
            return;
        }

//        System.out.println("Olhando para:"+vertice);
//        System.out.println(minimoDeVertice.size());

        for (Aresta aresta : vertice.getArestas()){
            if (arestaDeMenorPeso == null || arestaDeMenorPeso.getPeso() > aresta.getPeso()){
                arestaDeMenorPeso = aresta;
            }
        }

        if (total == minimoDeVertice.size()+1){
            incluirNoMinimoNecessario(vertice, null );
        } else if ( arestaDeMenorPeso != null && total > minimoDeVertice.size()){
            incluirNoMinimoNecessario(vertice, arestaDeMenorPeso);

            if ( !arestaDeMenorPeso.getDestino().getArestas().isEmpty() ){
                pegarArestaDeMenorPeso(arestaDeMenorPeso.getDestino());
            } else {
                pegarArestaDeMenorPeso(filtrarLista());
            }
        }
    }

    private void incluirNoMinimoNecessario(Vertice vertice, Aresta arestaDeMenorPeso){

        Vertice verticeAux = new Vertice();
        verticeAux.setPosicao(vertice.getPosicao());
        verticeAux.getArestas().clear();
        verticeAux.getArestas().add(arestaDeMenorPeso);
        minimoDeVertice.add(verticeAux);
    }


    private Vertice filtrarLista(){
        List<Vertice> listaAux = new ArrayList<>(listaDeVertice);
        for (Vertice vertice : minimoDeVertice){
            listaAux.removeIf(vertice1 -> vertice1.getPosicao().equals(vertice.getPosicao()));
        }

        if (listaAux.isEmpty()){
            return null;
        }
        return listaAux.get(0);
    }
}
