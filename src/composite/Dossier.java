package composite;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Composant {
    private List<Composant> composants = new ArrayList<>();

    public Dossier(String nom) {
        super(nom);
    }

    public void ajouter(Composant composant) {
        composant.niveau = this.niveau + 1;
        // Met à jour récursivement le niveau des enfants si c'est un dossier
        if (composant instanceof Dossier) {
            updateNiveauEnfants((Dossier) composant, composant.niveau);
        }
        composants.add(composant);
    }

    private void updateNiveauEnfants(Dossier dossier, int parentNiveau) {
        for (Composant c : dossier.getComposants()) {
            c.niveau = parentNiveau + 1;
            if (c instanceof Dossier) {
                updateNiveauEnfants((Dossier) c, c.niveau);
            }
        }
    }

    public void supprimer(Composant composant) {
        composants.remove(composant);
    }

    public List<Composant> getComposants() {
        return composants;
    }

    @Override
    public void afficher() {
        System.out.println(getIndentation() + "+ Dossier : " + nom);
        for (Composant c : composants) {
            c.afficher();
        }
    }
}
