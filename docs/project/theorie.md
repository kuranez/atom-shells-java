# Schalenmodell - Implementierung in Java - Theorie

## Welche Eigenschaften hat das Atom?

**Phase 1** zunächst nur:

 - Name
 - Protonenzahl
 - Elektronenzahl

## Was will ich im 1. Schritt berechnen?

**Energieniveaus!**

Mit Hilfe folgender Formel (Bohrmodell):

$E_n = -\frac{13.6\,\mathrm{eV}}{n^2}$

In Code sieht das wie folgt aus:

```
-13.6 / (n * n)
```

## Erweiterung auf andere Atome

Skalierung mit $Z^2$ für wasserstoffähnliche Kerne.

```
-13.6 (Z * Z) / (n * n)
```

**-13.6 eV** : Grundenergie von Wasserstoff <br>
**Z** : Atomzahl <br>
**n** : Anzahl von Elektronen

## Implementierung von Schalen

### Vorher

```text
Atom kennt nur:
- Protonenzahl
- Energieberechnung
```

### Nachher

```text
Atom besitzt:
- mehrere Shell-Objekte
- Elektronenkonfiguration
```

### Architekturgrundsatz

**`Atom.java`** enthält:

```text
Physik + Daten
```

**`AtomPanelRenderer.java`** enthält:

```text
Grafische Darstellung
```

---

**Author** : kuranez
