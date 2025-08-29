package filaVetor;

public class Fila {
    public int ultimo;
    public int inicio;
    public int tamanho;
    public int capacidade;
    public int[] array;

    public Fila(){
        ultimo = -1;
        inicio = -1;
        tamanho = 5;
        capacidade = 0;
        array = new int[tamanho];
    }

    public Fila(int tamanho){
        ultimo = -1;
        inicio = -1;
        capacidade = 0;
        this.tamanho = tamanho;
        array = new int[this.tamanho];
    }

    public void insere(int elemento){
        if (cheia()){
            System.out.println("A fila esta cheia");
            return;
        }

        if (vazia()){
            ultimo++;
            inicio++;
        }

        else if (ultimo == tamanho - 1){
            ultimo = 0;
        } else {
            ultimo++;
        }
        capacidade++;

        array[ultimo] = elemento;
        System.out.println("Adicionando " + elemento + " ao index " + ultimo);
    }

    public Integer remove(){
        if (vazia()){
            System.out.println("Lista vazia");
            return null;
        }

        int valor = array[inicio];
        System.out.println("Removendo o elemento: " + valor + " no index " + inicio);
        inicio = (inicio + 1) % tamanho;

        capacidade--;

        if (vazia()){
            inicio = -1;
            ultimo = -1;
        }
        return valor;
    }

    public void imprime(){
        for(int i = 0; i < capacidade; i++) {
            int index = (inicio + i) % tamanho;
            System.out.println((i+1) + " = " + array[index]);
        }
    }

    public boolean cheia(){ return capacidade == tamanho; }
    public boolean vazia(){ return capacidade == 0; }
}
