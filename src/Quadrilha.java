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
            String repeticao = arrayParaString();
            if (jaRepetiu(repeticao)) return voltas;
            else {
                registroDeVoltas.add(repeticao);
                ArrayList<Integer> temp = new ArrayList<>(quadrilhas);
                for (int i = 0; i < quantidade; i++) {
                    quadrilhas.set(i, temp.get(receita[i]));
                }
                    voltas++;
                    System.out.println(voltas);
                    System.out.println(repeticao);
                    System.out.println(quadrilhas);
                    dancar();
                }
                return voltas;
        }

        private String arrayParaString(){
            String temp = "";
            for (int valor : quadrilhas){
                temp = temp + valor;
            }
            return temp;
        }

        private boolean jaRepetiu(String repeticao){
          for (String valor : registroDeVoltas){
              if (valor.equals(repeticao)) return true;
          }
          return false;
        }
}

