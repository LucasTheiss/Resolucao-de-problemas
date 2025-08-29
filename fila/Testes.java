package fila;

public class Testes {
    public static void main(String[] args){
        Fila Fila = new Fila();

        Fila.insere(1);
        Fila.remove();
        Fila.remove();

        Fila.insere(1);
        Fila.insere(2);
        Fila.insere(3);
        Fila.insere(4);
        Fila.insere(5);
        Fila.remove();
        Fila.remove();

        Fila.imprime();
    }
}
