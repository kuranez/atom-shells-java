public class Atom {

    //Eigenschaften
    // Phase 1: Zunächst nur 
    // Name, Protonenzahl, Elektronenzahl

    private String name;
    private int protonNumber;
    private int electronCount;

    //Konstruktor
    public Atom(String name, int protonNumber, int electronCount) {
        this.name = name;
        this.protonNumber = protonNumber;
        this.electronCount = electronCount;
    }

    //Methoden
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

}