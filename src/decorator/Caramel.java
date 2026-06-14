package decorator;

public class Caramel extends DecorateurBoisson {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 3.0;
    }
}
