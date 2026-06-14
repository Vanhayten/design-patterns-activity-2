package composite;

public class Main {
    public static void main(String[] args) {
        Dossier racine = new Dossier("Racine");
        
        Dossier dossier1 = new Dossier("Dossier 1");
        Dossier dossier2 = new Dossier("Dossier 2");
        Dossier sousDossier1 = new Dossier("Sous-Dossier 1.1");

        Fichier f1 = new Fichier("Fichier 11.txt");
        Fichier f2 = new Fichier("Fichier 12.pdf");
        Fichier f3 = new Fichier("Fichier 21.docx");
        Fichier f4 = new Fichier("Fichier SD 1.1.png");

        sousDossier1.ajouter(f4);

        dossier1.ajouter(f1);
        dossier1.ajouter(f2);
        dossier1.ajouter(sousDossier1);

        dossier2.ajouter(f3);

        racine.ajouter(dossier1);
        racine.ajouter(dossier2);
        racine.ajouter(new Fichier("Fichier Racine.txt"));

        System.out.println("Arborescence du système de fichiers :");
        racine.afficher();
    }
}
