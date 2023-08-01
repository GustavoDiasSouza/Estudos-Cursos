package org.example;

import org.example.build.BuilderVertice;
import org.example.dijkstra.Dijkstra;
import org.example.model.Vertice;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Integer ENTRADA_DE_VERTICES_MAXIMA = 20;
    public static final Integer DISTANCIA_MAXIMA = 29;


    public static void main(String[] args) {
        BuilderVertice builderVertice = new BuilderVertice();
        System.out.print("Digite o número de vertices, no máximo 20: ");
        int numeroDeVerticesEscolhido = entradaDeNumero(ENTRADA_DE_VERTICES_MAXIMA);
        List<Vertice> lista = builderVertice.buildVertices( numeroDeVerticesEscolhido ).getListaDeVerticesCriada();

        for(Vertice vertice : lista){
            System.out.println(vertice);
        }

        System.out.println("# Algoritimos #");
        System.out.println("0 - Dijkstra");
        System.out.println("1 - Kruskal");
        System.out.println("2 - Prim");
        System.out.print("Escolha:");

        switch (entradaDeNumero(3)){

            case 1:
                System.out.println("\n\nEXECUTANDO DIJKSTRA");
                System.out.println("Digite 2 pontos, um de saida e outro de chegada:");
                Dijkstra dijkstra = new Dijkstra();
                dijkstra.ligarDoisPontos(
                        entradaDeNumero(numeroDeVerticesEscolhido),
                        entradaDeNumero(numeroDeVerticesEscolhido),
                        lista
                );
                break;
            case 2:
                break;
            case 3:
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