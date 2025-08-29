package merge.listaEncadeada;

import fila.Fila;

public class Merge {
    public Fila fila1;
    public Fila fila2;

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

        while(!fila2.vazia()){
            filaResultado.inserir(fila2.remover());
        }

        while(!fila1.vazia()){
            filaResultado.inserir(fila1.remover());
        }

        // zera as listas por padronizacao
        fila1 = null;
        fila2 = null;

        return filaResultado;
    }
}
