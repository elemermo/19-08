public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", 3, 12.5);
        Gato gato = new Gato("Mimi", 2, 4.2);
        Passaro passaro = new Passaro("Piu", 1, 0.5);

        System.out.println("=== CACHORRO ===");
        cachorro.apresentar();
        cachorro.emitirSom();

        System.out.println("\n=== GATO ===");
        gato.apresentar();
        gato.emitirSom();

        System.out.println("\n=== PÁSSARO ===");
        passaro.apresentar();
        passaro.emitirSom();
    }
}