# Iteration - Widerholungen mit Schleifen 
Viele Aufgaben sind repetitiv. 
- Eine Menge von Objekten bearbeiten/einlesen/ausgeben. 
- In zeitlichen Abständen bestimmte Aufgaben widerholen 

Die Umsetzung solcher Widerholungen nennt man Iteration oder Programmschleife. 

Java kennt drei verschiedene Schleifen-Anweisungen:
- while-Schleife (Eingangstest)
- do-while-Schleife (Ausgangstest)
-for-Schleife (Eingangstest)

## while-Schleife
- Die Bedingung (Expression) muss ein bool'sches Resultat geben. 
- Häufig werden in der Bedingung Variablen genutzt, deren Inhalt innerhalb der Schleife geändert wird.
- Evaluiert die Bedingung beim Eintritt in die Schleife bereits auf false, wird die Schleife **nie** ausgeführt.
```java

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1; // Deklarieren der Zählervariable

        // This while-Schleife läuft so lange bis count nicht mehr <= 5 ist
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // Erhöhen der Zählervariable um
        }

        System.out.println("Loop finished.");
    }
}
```
## do-while-Schleife 
- Unterschied zur while-Schleife ist, dass die Schleife auf jeden Fall **einmal** ausgeführt wird (auch wenn die Bedingung auf false evaluiert). 
```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int count = 1; // Deklarieren der Zählervariable

        // Diese do-while-Schleife läuft mindestens einmal und macht slange weiter bis count nicht mehr <= 5 ist
        do {
            System.out.println("Count: " + count);
            count++; // Erhöhen der Zählervariable um 
        } while (count <= 5);

        System.out.println("Loop finished.");
    }
}
```

do-while-Schleife erweitertes Beidpiel
- So lange würfeln bis alle 3 Würfel 6 Punkte zeigen. 
```java
int tryCount = 0;
int dice1, dice2, dice3;
do {
    dice1 = (int) (Math.random() * 6) + 1;
    dice2 = (int) (Math.random() * 6) + 1;
    dice3 = (int) (Math.random() * 6) + 1;
    tryCount++;
} while (!((dice1 == 6) && (dice2 == 6) && (dice3 == 6)));
System.out.println("Required " + tryCount + " tries."); 
```

## for-Schleife
- Die Anzahl Schleifendurchgänge ist bekannt.
```java
public class ForLoopExample {
    public static void main(String[] args) {
        // Zählt von 1-5
        for (int count = 1; count <= 5; count++) {
            System.out.println("Count: " + count);
        }

        System.out.println("Loop finished.");
    }
}
```
## foreach-Schleife
- Kann bei Collections (Datensammlungen) und Arrays eingesetzt werden.
- Kein explizites Schlüsselwort in Java. 
```java
public class ForEachLoopExample {
    public static void main(String[] args) {
        // Ein Array mit Ganzzahlen
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Iteration durch das Array mit einer for(each)-Schleife
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        System.out.println("Loop finished.");
    }
}
```
