package org.example.build;

import lombok.Getter;
import org.example.model.Aresta;
import org.example.model.Vertice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.example.Main.DISTANCIA_MAXIMA;
import static org.example.Main.entradaDeNumero;


@Getter
public class BuilderVertice {

    private final Random random = new Random();
    private final List<Vertice> listaDeVerticesCriada = new ArrayList<>();

    public BuilderVertice buildVertices(final int maximoDeNodeEscolhido){

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
            if (possivelConexao.getPosicao() > vertice.getPosicao()
//                    && random.nextInt(2) != 0
                    && !verificarSeJaTemEssaConexao(possivelConexao, vertice)
            ){
                conectarVertices(possivelConexao, vertice);
            }

        }
    }

    private boolean verificarSeJaTemEssaConexao(Vertice possivelConexao, Vertice vertice){
        for ( Aresta arestasExistente : possivelConexao.getConexoes()){
            if ( arestasExistente.getDestino() ==  vertice ){
                return true;
            }
        }
        return false;
    }

    private void conectarVertices(Vertice primeiroVertice, Vertice segundoVertice){
        System.out.print("Peso para a aresta do "+segundoVertice.getPosicao()+" até "+primeiroVertice.getPosicao()+":");
//        int pesoDaAresta = random.nextInt(DISTANCIA_MAXIMA)+1;
        int pesoDaAresta = entradaDeNumero(DISTANCIA_MAXIMA);

        Aresta aresta = new Aresta(primeiroVertice, pesoDaAresta );
        segundoVertice.getConexoes().add(aresta);
    }


}
