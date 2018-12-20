import javax.swing.*;

public class Aufruf
{
    public static void main (String[]args) // main Methode
    {
        Mensch a = new Mensch("Nina", 21, "weiblich"); //neue Instanz Typ Mensch mit Werten, vorher schon definiert
        System.out.println(a.printAll()); // Methode ausführen

        // Aufgabe 2

        Mensch2 b = new Mensch2("Nina", "Pfister", 21); // neue Instanz vom Typ Mensch mit Werten
        b.status(); // Methode Status, mit b. greife ich auf Mensch b zu
        Student c = new Student("Nina", "Pfister", 21, 1810653169, "Web Business & Technology");
        c.status(); // Methode Status, mit c. greife ich auf Student c zu
        // gleiche Methode in zwei verschiedenen Kontexten, Polymorphismus, wenn zwei Klassen selben Methodennamen verwenden, Mensch2 Superklasse, Student erbt von Student, erbt auch Status Methode, dann überschreibe ich
        // kann zwei verschiedene Sachen mit der gleichen Methode ausgeben, jede Klasse die erbt kann die Status Methode überschreiben und für sich anpasssen

        //Aufgabe 4
        String d = JOptionPane.showInputDialog("Gib etwas ein!"); // 3 Variablen vom Typ String mit Inhalten befüllen, InputDialog
        String e = JOptionPane.showInputDialog("Gib etwas ein!");
        String f = JOptionPane.showInputDialog("Gib etwas ein!");

        if (d.equals(e)) // mit Methode equals werden Stings verglichen, == vergleicht Referenzen (Verweis auf Objekt) keine Werte, if weil man vergleichen will, wenn, wenn dann, wenn dann, dann
        { // könnten unterschiedliche Werte haben aber gleich Referenz, equals prüft inhalt - == prüft Referenz z.B. ob a = b, ob sie auf gleichen Speicherbereich zeigen

            System.out.println("Zwei Variablen wurden gleich befüllt!"); //soll ausgeben das zwei Variablen gleich befüllt wurden
        }
        else if (d.equals(f)) // anderer Vergleich
        {
            System.out.println("Zwei Variablen wurden gleich befüllt!");
        }
        else if (e.equals(f)) // anderer Vergleich
        {
            System.out.println("Zwei Variablen wurden gleich befüllt!");
        }
        else {
            System.out.println("Keine der Variablen ist gleich!"); // wenn keine der Variablen gleich befüllt wurde, dann soll es das ausgeben
        }
    }
}
