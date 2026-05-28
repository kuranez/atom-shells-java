# Display in Java erzeugen

## Grundsätze

- Was erzeugt werden soll in eigene Renderer-Klasse!
- Bildschirmerzeugung in Main.java.


## Imports für JFrame und 2D-Grafik

In `Main.java` 

```java
import javax.swing.JFrame;
``` 

In `Renderer.java`

```java
import javax.swing.JPanel; // Für die Erstellung eines benutzerdefinierten Panels
import java.awt.Graphics; // Für die grafische Darstellung auf dem Panel
import java.awt.Graphics2D; // Für erweiterte grafische Funktionen
import java.awt.Color; // Für die Verwendung von Farben in der Darstellung
import java.awt.Font; // Für die Verwendung von Schriftarten in der Darstellung
import java.util.Locale; // Für die Formatierung von Zahlen in der deutschen Lokalisierung
``` 

## Template für Main.java

```java
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame frame =
            new JFrame("Atom");

        frame.setSize(800, 800);

        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        frame.add(new AtomPanel());

        frame.setVisible(true);
    }
}
```