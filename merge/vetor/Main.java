package merge.vetor;
import fila.Fila;

public class Main {
    public static void main(String[] args) {
        Fila fila1 = new Fila();
        Fila fila2 = new Fila();

        fila1.inserir(1);
        fila1.inserir(3);
        fila1.inserir(5);
        fila1.inserir(8);

        fila2.inserir(2);
        fila2.inserir(3);
        fila2.inserir(6);
        fila2.inserir(7);

        System.out.println("\n\nMerge\n\n");

        Merge mergedFila = new Merge(fila1, fila2);

        Fila resultado = mergedFila.mesclar();

        resultado.imprime();
    }
}
