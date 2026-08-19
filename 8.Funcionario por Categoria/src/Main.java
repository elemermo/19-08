public class Main {
    public static void main(String[] args) {

        Desenvolvedor desenvolvedor =
                new Desenvolvedor("João", 3000);

        Analista analista =
                new Analista("Maria", 3000);

        Estagiario estagiario =
                new Estagiario("Pedro", 1200);


        System.out.println("Salário do Desenvolvedor: R$ "
                + desenvolvedor.calcularSalario());

        System.out.println("Salário do Analista: R$ "
                + analista.calcularSalario());

        System.out.println("Salário do Estagiário: R$ "
                + estagiario.calcularSalario());
    }
}