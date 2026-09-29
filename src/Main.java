public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Walter", 1000);
        v.cambiarEstrategia(new ComisionPersonalizada());
        v.mostrarDetalle();
    }
}