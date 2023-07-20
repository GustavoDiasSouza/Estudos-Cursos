package org.example;

import org.example.build.Builder;
import org.example.dijkstra.Dijkstra;
import org.example.model.Vertice;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Integer ENTRADA_DE_VERTICES_MAXIMA = 20;
    public static final Integer DISTANCIA_MAXIMA = 29;


    public static void main(String[] args) {
        Builder builder = new Builder();
        System.out.print("Digite o número de vertices, no máximo 20: ");
        int numeroDeVerticesEscolhido = entradaDeNumero(ENTRADA_DE_VERTICES_MAXIMA);
        List<Vertice> lista = builder.buildVertices( numeroDeVerticesEscolhido ).getListaDeVerticesCriada();

        for(Vertice vertice : lista){
            System.out.println(vertice);
        }

        System.out.println("\n\nEXECUTANDO DIJKSTRA");
        System.out.println("Digite 2 pontos, um de saida e outro de chegada:");
        Dijkstra dijkstra = new Dijkstra();

        dijkstra.ligarDoisPontos(
                entradaDeNumero(numeroDeVerticesEscolhido),
                entradaDeNumero(numeroDeVerticesEscolhido),
                lista
        );

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