// Shell.java
// Klasse zur Darstellung einer Schale im Atommodell

public class Shell {
    
    // Eigenschaften der Schale
    int n; // Hauptquantenzahl
    int maxElectrons; // maximale Elektronenzahl in der Schale
    int currentElectrons; // aktuelle Elektronenzahl in der Schale

    // Konstruktor zum erzeugen einer Schale mit der Hauptquantenzahl n
    public Shell(int n) {
        this.n = n; // Hauptquantenzahl
        this.maxElectrons = 2 * n * n; // Formel für maximale Elektronenzahl in der Schale
        this.currentElectrons = 0; // Anfangs keine Elektronen in der Schale    
    }

    // Methode zum Hinzufügen von Elektronen zur Schale
    public void addElectron() {
        if (currentElectrons < maxElectrons) {
            currentElectrons++;
        } else {
            System.out.println("Die Schale " + n + " ist bereits voll.");
        }
    }

    // Getter-Methoden
    public int getN() {
        return n;   
    }

    public int getCurrentElectrons() {
        return currentElectrons;
    }

    public int getMaxElectrons() {
        return maxElectrons;
    }

}
