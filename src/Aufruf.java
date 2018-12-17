public class Aufruf
{
    public static void main (String[]args) // main Methode
    {
        Mensch a = new Mensch("Nina", 21, "weiblich"); //neue Instanz Typ Mensch mit Werten, vorher schon definiert
        System.out.println(a.printAll()); // Methode ausführen

        // Aufgabe 2

        Mensch2 b = new Mensch2("Nina", "Pfister", 21); // neue Instanz vom Typ Mensch mit Werten
        b.Status(); // Methode Status, mit b. greife ich auf Mensch b zu
        Student c = new Student("Nina", "Pfister", 21, 1810653169, "Web Business & Technology");
        c.Status(); // Methode Status, mit c. greife ich auf Student c zu
        // gleiche Methode in zwei verschiedenen Kontexten, Polymorphismus
    }
}
