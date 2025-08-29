package fila;

public class Testes {
    public static void main(String[] args){
        Fila Fila = new Fila();

        Fila.inserir(1);
        Fila.remover();
        Fila.remover();

        Fila.inserir(1);
        Fila.inserir(2);
        Fila.inserir(3);
        Fila.inserir(4);
        Fila.inserir(5);
        Fila.remover();
        Fila.remover();

        Fila.imprime();
    }
}
