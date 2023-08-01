package org.example;

import org.example.Prim.Prim;
import org.example.build.BuilderVertice;
import org.example.dijkstra.Dijkstra;
import org.example.build.model.Vertice;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Integer ENTRADA_DE_VERTICES_MAXIMA = 20;
    public static final Integer DISTANCIA_MAXIMA = 99;
    public static List<Vertice> listaFinal;


    public static void main(String[] args) {
        BuilderVertice builderVertice = new BuilderVertice();
        System.out.print("Digite o número de vertices, no máximo 20: ");
        int numeroDeVerticesEscolhido = entradaDeNumero(ENTRADA_DE_VERTICES_MAXIMA);
        listaFinal = builderVertice.buildVertices( numeroDeVerticesEscolhido ).getListaDeVerticesCriada();

        for(Vertice vertice : listaFinal){
            System.out.println(vertice);
        }

        System.out.println("# Algoritimos #");
        System.out.println("0 - Dijkstra");
        System.out.println("1 - Kruskal");
        System.out.println("2 - Prim");
        System.out.print("Escolha:");

        switch (entradaDeNumero(3)){

            case 0:
                System.out.println("\n\nExecutando Dijkstra");
                System.out.println("Digite 2 pontos, um de saida e outro de chegada:");
                Dijkstra dijkstra = new Dijkstra();
                dijkstra.ligarDoisPontos(
                        entradaDeNumero(numeroDeVerticesEscolhido),
                        entradaDeNumero(numeroDeVerticesEscolhido),
                        listaFinal
                );
                break;
            case 1:
                break;
            case 2:
                System.out.println("\n\nExecutando Prim");
                System.out.print("Minimo desejado:");
                Prim prim = new Prim();
                prim.arvoreGeradoraMinima(listaFinal.get(0), entradaDeNumero(numeroDeVerticesEscolhido));
                break;
        }
    }



    public static Integer entradaDeNumero(final int numeroMaximo){
        Scanner input = new Scanner(System.in);
        int numero;

        do {
            // Descartar a entrada atual, pois não é um inteiro válido.
            while (!input.hasNextInt()) {
                input.next();
                System.out.print("Entrada inválida. Digite novamente:");
            }

            numero = input.nextInt();

            if (numero <= 0) {
                System.out.print("Número inválido. Digite novamente:");
            }

        } while (numero <= 0 || numero >= numeroMaximo );

        return numero;
    }
}