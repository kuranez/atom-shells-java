public class Main {
    public static void main(String[] args) {
        
        // System.out.println("Test!");

        Atom hydrogen = new Atom(
            "Wasserstoff (H)", 
            1, 
            1 
        );

        Atom helium = new Atom(
            "Helium (He+)", 
            2, 
            2 
            // maximale Elektronenzahl in der ersten Schale ist 2, aber Helium hat insgesamt 2 Elektronen
        );

        Atom oxygen = new Atom(
            "Sauerstoff (O7+)", 
            8, 
            8 
            // maximale Elektronenzahl in der ersten Schale ist 2, aber Sauerstoff hat insgesamt 8 Elektronen
        );

        double energy = 
            hydrogen.calculateEnergyLevel(1, 1);
            //Formel ist nur für wasserstoffähnliche Kerne gültig, daher verwenden wir n=1 für die erste Schale

        System.out.println(
            hydrogen.getName()
            + " : Energie in der ersten Schale : " + energy + " eV"
            );

        double heliumEnergy = 
        // Berechnung der Energie für Helium in der ersten Schale
        // Z = 2 für Helium, n = 1 für die erste Schale
        // Helium hat 2 Protonen, daher Z = 2
        // Energie gilt aber nur für wasserstoffähnliche Kerne, daher verwenden wir n=1 für die erste Schale
            helium.calculateEnergyLevel(2, 1);

        System.out.println(
            helium.getName()
            + " : Energie in der ersten Schale : " + heliumEnergy + " eV"
            );

        double oxygenEnergy = 
        // Berechnung der Energie für Sauerstoff in der ersten Schale
        // Z = 8 für Sauerstoff, n = 1 für die erste Schale
            oxygen.calculateEnergyLevel(8, 1);

        System.out.println(
            oxygen.getName()
            + " : Energie in der ersten Schale : " + oxygenEnergy + " eV"
            );

    }

}