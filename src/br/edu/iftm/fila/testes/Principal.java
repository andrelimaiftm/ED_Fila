package br.edu.iftm.fila.testes;

import br.edu.iftm.fila.estruturadados.Fila;

public class Principal {
    public static void main(String[] args) throws Exception {
        //int -> Integer
        //float -> Float
        //double -> Double
        Fila<String> fila = new Fila<>();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.enfileirar("E");
        System.out.println("A Fila está vazia? " + fila.estaVazia());
        System.out.printf("O tamanho da fila é %s \n", fila.tamanho());
        System.out.println(fila);
        System.out.println("O primeiro elemento é: " + fila.espiar());
        System.out.println("O valor desenfileirado foi: " + fila.desenfileirar());
        System.out.println(fila);
        fila.enfileirar("F");
        System.out.println(fila);


    }
}
