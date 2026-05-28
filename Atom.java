// Atom.java
// Klasse zur Darstellung eines Atoms im Bohr'schen Atommodell

import java.util.ArrayList; 
// Importieren der ArrayList-Klasse für die Verwaltung der Schalen im Atom

public class Atom {

    //Eigenschaften
    // Phase 1: Zunächst nur 
    // Name, Protonenzahl, Elektronenzahl

    private String name;
    private int protonNumber;
    private int electronCount;

    private ArrayList<Shell> shells; // Liste der Schalen im Atom
    
    //Konstruktor
    public Atom(String name, int protonNumber, int electronCount) {
        this.name = name;
        this.protonNumber = protonNumber;
        this.electronCount = electronCount;
        this.shells = new ArrayList<>();
                shells.add(new Shell(1));
                shells.add(new Shell(2));
                shells.add(new Shell(3));
        // Elektronen auf die Schalen verteilen
        getConfiguration();
    }

    //Methoden

    // Methode zur Verteilung der Elektronen auf die Schalen
    public void getConfiguration() {
        int remainingElectrons = electronCount;
        for (Shell shell : shells) {
            while (remainingElectrons > 0 && shell.getCurrentElectrons() < shell.getMaxElectrons()) {
                shell.addElectron();
                remainingElectrons--;
            }
        }
    }

    // Liefert die Elektronenkonfiguration als Text für die Anzeige im GUI
    public String getConfigurationText() {
        StringBuilder configurationText = new StringBuilder();

        for (Shell shell : shells) {
            configurationText
                .append("n=")
                .append(shell.getN())
                .append(" : ")
                .append(shell.getCurrentElectrons())
                .append("/")
                .append(shell.getMaxElectrons())
                .append(" Elektronen")
                .append(System.lineSeparator());
        }

        return configurationText.toString().trim();
    }

    // Methode zur Ausgabe der Elektronenkonfiguration des Atoms
    public void printConfiguration() {
        System.out.println(getConfigurationText());
    }

    // Methode zur Berechnung der Energie eines Elektrons in einer bestimmten Schale
    public double calculateEnergyLevel(int Z, int n) {
        // Wasserstoffähnliche Kerne: Z = 1, 2, 8, ...
        // Für Wasserstoff: Z = 1, für Helium: Z = 2, für Sauerstoff: Z = 8
        // Bohrmodell: E_n = -13.6 eV * Z^2 / n^2, wobei n die Hauptquantenzahl ist
        return -13.6 * Z * Z / (n * n); 
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getProtonNumber() {
        return protonNumber;
    }

    public int getElectronCount() {
        return electronCount;
    }

    public ArrayList<Shell> getShells() {
    return shells;
    }

}