public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Relatos de um gato viajante", 54.84, "Hiro Arikawa", 256, false);
        Camisa camisa = new Camisa("Camisa Polo", 59.90, "Azul", "M", "Algodão");

        System.out.println("=== Livro ===");
        livro.exibirInfo();

        System.out.println("\n=== Camisa ===");
        camisa.exibirInfo();
    }
}
