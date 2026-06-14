package decorator;

public class Deca extends Boisson {
    public Deca() {
        description = "Décaféiné";
    }

    @Override
    public double cout() {
        return 10.0;
    }
}
