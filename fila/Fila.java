package fila;
import node.Node;

public class Fila {
    public Node inicio;
    public Node ultimo;

    public Fila(){
        inicio = null;
        ultimo = null;
    }

    public void insere(int elemento){
        Node no = new Node();
        no.setInformacao(elemento);

        if (inicio == null){
            inicio = no;
            ultimo = no;
        }
        else {
            ultimo.setProximo(no);
            ultimo = no;
        }
        System.out.println("Inserindo " + elemento + " no nó atual de endereco " + ultimo);
    }

    public Integer remove(){
        if (vazia()){
            System.out.println("Lista Vazia");
            return null;
        }
        Integer valor = inicio.getInformacao();
        System.out.println("Removendo " + valor + " do endereco " + inicio);
        inicio = inicio.getProximo();

        if (vazia()){
            ultimo = null;
        }
        return valor;
    }

    public void imprime(){
        for (Node atual = inicio; atual != null; atual = atual.getProximo()){
            System.out.print(atual.getInformacao()+ " -> ");
        } System.out.println("Null");
    }

    public boolean vazia(){ return inicio == null; }
}
