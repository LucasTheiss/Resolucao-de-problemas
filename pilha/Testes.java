package pilha;

public class Testes {
    public static void main(String[] args){
        Pilha pilha = new Pilha();

        pilha.inserir(1);
        pilha.remover();
        pilha.remover();

        pilha.inserir(1);
        pilha.inserir(2);
        pilha.inserir(3);
        pilha.inserir(4);
        pilha.inserir(5);
        pilha.remover();
        pilha.remover();

        pilha.imprime();
    }
}
