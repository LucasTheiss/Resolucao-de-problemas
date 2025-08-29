package merge.vetor;

import filaVetor.Fila;

public class Merge {
    public Fila fila1;
    public Fila fila2;
    public int tamanho;

    public Merge(Fila fila1, Fila fila2){
        this.fila1 = fila1;
        this.fila2 = fila2;
        tamanho = fila1.capacidade + fila2.capacidade;
    }

    public void definirFilas(Fila fila1, Fila fila2){
        this.fila1 = fila1;
        this.fila2 = fila2;
        this.tamanho = fila1.capacidade + fila2.capacidade;
    }

    public Fila mesclar(){
        Fila filaResultado = new Fila(tamanho);

        while (!fila1.vazia() && !fila2.vazia()){
            if (fila1.array[fila1.inicio] < fila2.array[fila2.inicio]){
                filaResultado.inserir(fila1.remover());
            } else {
                filaResultado.inserir(fila2.remover());
            }
        }

        // verificacao para evitar erros de null pointer
        while (!fila1.vazia()) {
            filaResultado.inserir(fila1.remover());
        }

        while (!fila2.vazia()) {
            filaResultado.inserir(fila2.remover());
        }

        // zera as listas por padronizacao
        fila1 = null;
        fila2 = null;

        return filaResultado;
    }
}
