package decorator;

public class Chocolat extends DecorateurBoisson {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 2.5;
    }
}
