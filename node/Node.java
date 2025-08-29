package node;

public class Node {
    private Integer informacao;
    private Node proximo;

    public Node() {
        this.informacao = null;
        this.proximo = null;
    }

    public Node(int informacao, Node proximo){
        this.informacao = informacao;
        this.proximo = proximo;
    }

    public Integer getInformacao() {
        return informacao;
    }

    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}