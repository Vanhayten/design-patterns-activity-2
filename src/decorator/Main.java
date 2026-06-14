package decorator;

public class Main {
    public static void main(String[] args) {
        Boisson b1 = new Espresso();
        System.out.println("Boisson: " + b1.getDescription() + " | Prix: " + b1.cout());

        Boisson b2 = new Deca();
        b2 = new Chocolat(b2);
        b2 = new Caramel(b2);
        System.out.println("Boisson: " + b2.getDescription() + " | Prix: " + b2.cout());
        
        Boisson b3 = new Espresso();
        b3 = new Chocolat(b3);
        b3 = new Chocolat(b3); // double dose de chocolat
        b3 = new Caramel(b3);
        System.out.println("Boisson: " + b3.getDescription() + " | Prix: " + b3.cout());
    }
}
