// Main.java 
// Hauptprogramm, das die Atom-Objekte erstellt 
// und das GUI-Fenster mit dem AtomPanel anzeigt

import javax.swing.JFrame; 
// Importieren der JFrame-Klasse für die Erstellung des Hauptfensters

public class Main {

    public static void main(String[] args) {

        Atom oxygen =
            new Atom("Sauerstoff", 8,   8);

        oxygen.getConfiguration();

        JFrame frame =
            new JFrame("Schalenmodell von " + oxygen.getName());

        frame.setSize(800, 800);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        // Add AtomPanel to the frame
        frame.add(new AtomPanelRenderer(oxygen));

        frame.setVisible(true);
    }
}