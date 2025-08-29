package pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha();

        System.out.println("Digite os itens da pilha (digite '0' para parar):");
        int item;
        while (true) {
            item = scanner.nextInt();
            if (item == 0) {
                break;
            }
            pilha.inserir(item);
        }
        System.out.println("pilha Encadeada:");
        pilha.imprime();
    }
}