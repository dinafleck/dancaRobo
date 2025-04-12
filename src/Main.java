
public class Main {
    public static void main(String[] args) {
        Quadrilha teste1 = new Quadrilha(7);
        teste1.adicionaQuadrilha();

        System.out.println(teste1.quadrilhas);

        teste1.dancar();
        System.out.println(teste1.quadrilhas);

    }
}