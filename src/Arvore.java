public class Arvore {
    
    No raiz;

    private No addRecursiva(No atual, int valor){
        if(atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esquerdo = addRecursiva(atual.esquerdo, valor);
         
        } else if (valor > atual.valor) {
            atual.direito = addRecursiva(atual.direito, valor);
        } else {
            return atual;
        }
        return atual;
    }

    public void add (int valor){
        raiz = addRecursiva(raiz, valor);
    }

    private boolean estaNoRecursiva(No atual, int valor) {
        if (atual == null) {
            return false;
        }
        if (valor == atual.valor){
            return true;
        }
        return valor < atual.valor
        ? estaNoRecursiva(atual.esquerdo, valor)
        : estaNoRecursiva(atual.direito, valor);
    }

    public boolean estaNo (int valor) {
        return estaNoRecursiva(raiz, valor);
    }
    public void atravessar(No no, String tab) {
        if(no == null){
            return;
        }
        atravessar(no.esquerdo, tab+" .");
        System.out.println(tab+no.valor);
        atravessar(no.direito, tab+" .");

    }
}
