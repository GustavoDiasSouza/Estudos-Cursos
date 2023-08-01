package org.example.build;

import lombok.Getter;
import org.example.build.model.Aresta;
import org.example.build.model.Vertice;

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

//              Condições extras
//              && random.nextInt(2) != 0

    private void verificarSePodeTerUmaConexao(Vertice vertice){
        System.out.println("1 - Sim | 2 - Não");
        for ( Vertice possivelConexao: listaDeVerticesCriada ){
            if ( possivelConexao.getPosicao() > vertice.getPosicao() && !verificarSeJaTemEssaConexao(possivelConexao, vertice)){
                System.out.print("Vertice "+vertice.getPosicao()+" esta conectado com "+possivelConexao.getPosicao()+"? ");
                if (entradaDeNumero(2) == 1){
                    conectarVertices(possivelConexao, vertice);
                }
            }

        }
    }

    private boolean verificarSeJaTemEssaConexao(Vertice possivelConexao, Vertice vertice){
        for ( Aresta arestasExistente : possivelConexao.getArestas()){
            if ( arestasExistente.getDestino() ==  vertice ){
                return true;
            }
        }
        return false;
    }

    private void conectarVertices(Vertice primeiroVertice, Vertice segundoVertice){
        System.out.print("Peso desta aresta: ");
//        int pesoDaAresta = random.nextInt(DISTANCIA_MAXIMA)+1;
        int pesoDaAresta = entradaDeNumero(DISTANCIA_MAXIMA);

        Aresta aresta = new Aresta(primeiroVertice, pesoDaAresta );
        segundoVertice.getArestas().add(aresta);
    }


}
