public class Main {
    public static void main(String[] args) {
        
        // System.out.println("Test!");

        // Erstellen von Atom-Objekten

        Atom hydrogen = new Atom(
            "Wasserstoff (H)", 
            1, 
            1 
        );

        Atom helium = new Atom(
            "Helium (He+)", 
            2, 
            2 
        );

        Atom lithium = new Atom(
            "Lithium (Li2+)", 
            3, 
            3 
        );

        Atom beryllium = new Atom(
            "Beryllium (Be3+)", 
            4, 
            4 
        );

        Atom oxygen = new Atom(
            "Sauerstoff (O7+)", 
            8, 
            8 
            // maximale Elektronenzahl in der ersten Schale ist 2, aber Sauerstoff hat insgesamt 8 Elektronen
        );

        //Berechnung der Energie für die erste Schale (n = 1) und Ausgabe der Ergebnisse
        double energy = 
            hydrogen.calculateEnergyLevel(1, 1);

        System.out.println(
            hydrogen.getName()
            + " : Energie in der ersten Schale : " + energy + " eV"
            );

        double heliumEnergy = 
        // Berechnung der Energie für Helium in der ersten Schale
        // Helium hat 2 Protonen, daher Z = 2
        // Hauptquantenzahl n = 1 für die erste Schale
            helium.calculateEnergyLevel(2, 1);

        System.out.println(
            helium.getName()
            + " : Energie in der ersten Schale : " + heliumEnergy + " eV"
            );
        
        double lithiumEnergy = 
            lithium.calculateEnergyLevel(3, 1);
        
        System.out.println(
            lithium.getName()
            + " : Energie in der ersten Schale : " + lithiumEnergy + " eV"
            );
        
        double berylliumEnergy = 
            beryllium.calculateEnergyLevel(4, 1);
        
        System.out.println(
            beryllium.getName()
            + " : Energie in der ersten Schale : " + berylliumEnergy + " eV"
            );

        double oxygenEnergy = 
            oxygen.calculateEnergyLevel(8, 1);

        System.out.println(
            oxygen.getName()
            + " : Energie in der ersten Schale : " + oxygenEnergy + " eV"
            );
    }

}