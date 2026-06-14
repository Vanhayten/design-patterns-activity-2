package composite;

public class Fichier extends Composant {
    public Fichier(String nom) {
        super(nom);
    }

    @Override
    public void afficher() {
        System.out.println(getIndentation() + "- Fichier : " + nom);
    }
}
