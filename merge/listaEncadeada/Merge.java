package merge.listaEncadeada;

import fila.Fila;
import node.Node;

public class Merge {
    public Fila fila1;
    public Fila fila2;

    public Merge(){
        this.fila1 = null;
        this.fila2 = null;
    }

    public Merge(Fila fila1, Fila fila2){
        this.fila1 = fila1;
        this.fila2 = fila2;
    }

    public void definirFilas(Fila fila1, Fila fila2){
        this.fila1 = fila1;
        this.fila2 = fila2;
    }

    public Fila mesclar(){
        Fila filaResultado = new Fila();

        while (!fila1.vazia() && !fila2.vazia()){
            if (fila1.inicio.getInformacao() < fila2.inicio.getInformacao()){
                filaResultado.inserir(fila1.remover());
            } else {
                filaResultado.inserir(fila2.remover());
            }
        }

        // verificacao para evitar erros de null pointer
        if (filaResultado.vazia()){
            filaResultado = fila2.vazia() ? fila1 : fila2;
        } else {
            // caso sobre algum elemento em alguma fila, aponta o ultimo do fila resultado para o inicio da fila com elementos faltantes
            filaResultado.ultimo.setProximo(fila1.vazia() ? fila2.inicio : fila1.inicio);
        }
        // zera as listas por padronizacao
        fila1 = null;
        fila2 = null;

        return filaResultado;
    }
}
