package fila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();

        System.out.println("Digite os itens da fila (digite '0' para parar):");
        int item;
        while (true) {
            item = scanner.nextInt();
            if (item == 0) {
                break;
            }
            fila.inserir(item);
        }
        System.out.println("Fila Encadeada:");
        fila.imprime();
    }
}