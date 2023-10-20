
public class App {

    static Arvore criarArvore() {
        Arvore galho = new Arvore();

        galho.add(6);
        galho.add(4);
        galho.add(8);
        galho.add(3);
        galho.add(5);
        galho.add(7);
        galho.add(9);
        galho.add(10);
        galho.add(13);
        galho.add(15);
        galho.add(14);

        return galho;
    


    }

   

  
    public static void main(String[] args) {
        var arvore = criarArvore();
        arvore.atravessar(arvore.raiz, "");        
        System.out.println(arvore);
    }
}
