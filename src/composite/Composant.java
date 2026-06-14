package composite;

public abstract class Composant {
    protected String nom;
    protected int niveau;

    public Composant(String nom) {
        this.nom = nom;
    }

    public abstract void afficher();
    
    public String getIndentation() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            str.append("\t");
        }
        return str.toString();
    }
}
