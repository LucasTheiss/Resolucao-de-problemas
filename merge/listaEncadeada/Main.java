package merge.listaEncadeada;
import fila.Fila;

public class Main {
    public static void main(String[] args) {
        Fila fila1 = new Fila();
        Fila fila2 = new Fila();

        fila1.insere(1);
        fila1.insere(3);
        fila1.insere(5);
        fila1.insere(8);

        fila2.insere(2);
        fila2.insere(3);
        fila2.insere(6);
        fila2.insere(7);

        System.out.println("\n\nMerge\n\n");

        Merge mergedFila = new Merge(fila1, fila2);

        Fila resultado = mergedFila.mesclar();

        resultado.imprime();
    }
}
