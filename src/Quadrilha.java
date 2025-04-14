import java.util.ArrayList;

public class Quadrilha {
    int quantidade;
    int posicao;
    long voltas;
    int[] receita;
    ArrayList<Integer> quadrilhas;
    ArrayList<Long> registroDeVoltas;

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
            long repeticao = arrayParaLong();
            if (jaRepetiu(repeticao)) return voltas;
            else {
                registroDeVoltas.add(repeticao);
                System.out.println(registroDeVoltas);
                ArrayList<Integer> temp = new ArrayList<>(quadrilhas);
                for (int i = 0; i < quantidade; i++) {
                    quadrilhas.set(i, temp.get(receita[i]));
                }
                    voltas++;
                    System.out.println(quadrilhas);
                    dancar();
                }
                return voltas;
        }

        private long arrayParaLong(){
            long temp = 0;
            for (int valor : quadrilhas){
                temp = temp*10 + valor;
            }
            return temp;
        }

        private boolean jaRepetiu(long repeticao){
          for (long valor : registroDeVoltas){
              if (valor == repeticao) return true;
          }
          return false;
        }
}

