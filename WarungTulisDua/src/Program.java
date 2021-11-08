public class Program {
    public static void main(String[] args) {
    Toko pulpen;
        pulpen = new Toko();
        pulpen.name = "Bolpoin";

    pulpen.stock = 10;

    pulpen.setStock(10);
        System.out.println(pulpen.getStock());
    }
}
