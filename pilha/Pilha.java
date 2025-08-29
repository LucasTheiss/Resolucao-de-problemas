package pilha;

import node.Node;

public class Pilha {
    private Node topo;

    public Pilha(){
        this.topo = null;
    }

    public void insere(int informacao){
        topo = new Node(informacao, topo);
        System.out.println("Inserindo " + informacao + " no nó atual de endereço " + topo);
    }

    public Integer remove(){
        if (vazia()){
            System.out.println("Lista vazia");
            return null;
        }
        int valor = topo.getInformacao();
        System.out.println("Removendo " + valor + " do endereço " + topo);
        topo = topo.getProximo();
        return valor;
    }

    public void imprime(){
        for (Node atual = topo; atual != null; atual = atual.getProximo()) {
            System.out.print(atual.getInformacao()+ " -> ");
        } System.out.println("Null");
    }

    public boolean vazia(){ return topo == null; }
}
