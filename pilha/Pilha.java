package pilha;

public class Pilha {

    private Elemento topo;
    private int tamanho;

    public Pilha() {
        this.tamanho = 0;
    }

    public Pilha(Elemento topo) {
        this.topo = topo;
        this.tamanho = 0;
    }

    public Elemento getTopo() {
        return topo;
    }

    public void setTopo(Elemento topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void empilhar(Pessoa p) {
        if (this.topo == null) {
            this.topo = new Elemento(p);
        } else {
            Elemento e = this.topo;
            this.topo = new Elemento(p);
            this.topo.setProximo(e);
        }
        this.tamanho++;
    }

    public String desempilhar() {
        if (this.topo == null) {
            return "Não há nada para desempilhar.";
        } else {
            Elemento e = this.topo;
            this.topo = e.getProximo();
            this.tamanho--;
            return e.getPessoa().toString();
        }
    }

    public boolean vazia() {
        if (this.tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void listar() {
        if (this.tamanho == 0) {
            System.out.println("A pilha está vazia.");
        } else {
            Elemento e = this.topo;
            System.out.println(e);
            while (e.getProximo() != null) {
                System.out.println(e.getProximo().getPessoa().toString());
                e = e.getProximo();
            }
        }
    }
}
