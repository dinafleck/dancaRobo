import java.util.ArrayList;

public class Quadrilha {
    int quantidade;
    int posicao;
    long voltas;
    int[] receita;
    ArrayList<Integer> quadrilhas;
    ArrayList<String> registroDeVoltas;

    public Quadrilha(int quantidade, int[] receita) {
            this.quantidade = quantidade;
            this.receita = receita;
            this.quadrilhas = new ArrayList<>();
            this.registroDeVoltas = new ArrayList<>();
        }

        public void adicionaQuadrilha() {
            if (posicao > quantidade-1) return;
            quadrilhas.add(posicao);
            posicao++;
            adicionaQuadrilha();
        }

        public long dancar(){

            while (!jaRepetiu(arrayParaString())) {
                registroDeVoltas.add(arrayParaString());
                ArrayList<Integer> temp = new ArrayList<>(quadrilhas);
                for (int i = 0; i < quantidade; i++) {
                    quadrilhas.set(i, temp.get(receita[i]));
                }
                voltas++;
                System.out.println(voltas);
                System.out.println(quadrilhas);
                }
            return voltas;
            }

        private String arrayParaString(){
            StringBuilder temp = new StringBuilder();
            for (int valor : quadrilhas){
                temp.append(valor);
            }
            return temp.toString();
        }

        private boolean jaRepetiu(String repeticao){
          for (String valor : registroDeVoltas){
              if (valor.equals(repeticao)) return true;
          }
          return false;
        }
}

