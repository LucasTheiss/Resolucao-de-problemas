package pilha;

public class Testes {
    public static void main(String[] args){
        Pilha pilha = new Pilha();

        pilha.insere(1);
        pilha.remove();
        pilha.remove();

        pilha.insere(1);
        pilha.insere(2);
        pilha.insere(3);
        pilha.insere(4);
        pilha.insere(5);
        pilha.remove();
        pilha.remove();

        pilha.imprime();
    }
}
