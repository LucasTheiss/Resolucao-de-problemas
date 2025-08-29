package pilha;

import node.Node;

public class Pilha {
    private Node topo;

    public Pilha(){
        this.topo = null;
    }

    public void inserir (int informacao){
        topo = new Node(informacao, topo);
        System.out.println("Inserindo " + informacao + " no nó atual de endereço " + topo);
    }

    public void remover(){
        if (vazia()){
            System.out.println("Lista vazia");
            return;
        }
        System.out.println("Removendo " + topo.getInformacao() + " do endereço " + topo);
        topo = topo.getProximo();
    }

    public void imprime(){
        for (Node atual = topo; atual != null; atual = atual.getProximo()) {
            System.out.print(atual.getInformacao()+ " -> ");
        } System.out.println("Null");
    }

    public boolean vazia(){ return topo == null; }
}
