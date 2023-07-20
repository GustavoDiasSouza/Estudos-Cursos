package org.example.build;

import lombok.Getter;
import org.example.model.Aresta;
import org.example.model.Vertice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.example.Main.DISTANCIA_MAXIMA;


@Getter
public class Builder {

    private final Random random = new Random();
    private final List<Vertice> listaDeVerticesCriada = new ArrayList<>();

    public Builder buildVertices(final int maximoDeNodeEscolhido){

        for (int i = 0; i < maximoDeNodeEscolhido; i++){
            Vertice vertice = new Vertice();
            vertice.setPosicao(i+1);
            listaDeVerticesCriada.add(vertice);
        }

        buildArestas();

        return this;
    }

    private void buildArestas(){

        for ( Vertice vertice : listaDeVerticesCriada ){
            verificarSePodeTerUmaConexao(vertice);

        }

    }


    private void verificarSePodeTerUmaConexao(Vertice vertice){

        for ( Vertice possivelConexao: listaDeVerticesCriada ){
//            if (possivelConexao.getPosicao() > vertice.getPosicao() && random.nextInt(2) != 0){
            if ( possivelConexao.getPosicao() > vertice.getPosicao() ){
                Aresta aresta = new Aresta(possivelConexao, random.nextInt(DISTANCIA_MAXIMA)+1);
                vertice.getConexoes().add(aresta);
            }

        }
    }


}
