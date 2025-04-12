import java.util.ArrayList;

public class Quadrilha {
   int quantidade;
    int posicao;
    ArrayList<Integer> quadrilhas;

    public Quadrilha(int quantidade) {
            this.quantidade = quantidade;
            this.quadrilhas = new ArrayList<>();
        }

        public void adicionaQuadrilha() {
            if (posicao > quantidade-1) return;
            quadrilhas.add(posicao);
            posicao++;
            adicionaQuadrilha();
        }

        public void dancar(){
            quadrilhas.clone();
        }
}

