package org.example;

import org.example.prim.Prim;
import org.example.build.BuilderVertice;
import org.example.dijkstra.Dijkstra;
import org.example.build.model.Vertice;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Integer ENTRADA_DE_VERTICES_MAXIMA = 20;
    public static final Integer DISTANCIA_MAXIMA = 99;
    public static List<Vertice> listaDeVertice;


    public static void main(String[] args) {
        BuilderVertice builderVertice = new BuilderVertice();
        int numeroDeVerticesEscolhido;

        mensageiro(1);
        numeroDeVerticesEscolhido = entradaDeNumero(ENTRADA_DE_VERTICES_MAXIMA);
        listaDeVertice = builderVertice.buildVertices( numeroDeVerticesEscolhido ).getListaDeVerticesCriada();

        for(Vertice vertice : listaDeVertice){
            System.out.println(vertice);
        }

        mensageiro(2);
        switch (entradaDeNumero(3)) {
            case 1 -> {
                mensageiro(3);
                Dijkstra dijkstra = new Dijkstra();
                dijkstra.ligarDoisPontos(
                        entradaDeNumero(numeroDeVerticesEscolhido),
                        entradaDeNumero(numeroDeVerticesEscolhido)
                );
            }
            case 2 -> {
            }
            case 3 -> {
                mensageiro(4);
                Prim prim = new Prim();
                prim.arvoreGeradoraMinima(listaDeVertice.get(0), entradaDeNumero(numeroDeVerticesEscolhido));
            }
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

        } while (numero <= 0 || numero > numeroMaximo );

        return numero;
    }


    private static void mensageiro(int opcao){
        switch (opcao) {
            case 1 -> System.out.print("Digite o número de vertices, no máximo 20: ");
            case 2 -> {
                System.out.println("# Algoritimos #");
                System.out.println("1 - Dijkstra");
                System.out.println("2 - Kruskal");
                System.out.println("3 - Prim");
                System.out.print("Escolha:");
            }
            case 3 -> {
                System.out.println("\n\nExecutando Dijkstra");
                System.out.println("Digite 2 pontos, um de saida e outro de chegada:");
            }
            case 4 -> {
                System.out.println("\n\nExecutando Prim");
                System.out.print("Minimo desejado:");
            }
        }

    }
}