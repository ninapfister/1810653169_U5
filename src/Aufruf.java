public class Aufruf
{
    public static void main (String[]args) // main Methode
    {
        Mensch a = new Mensch("Nina", 21, "weiblich"); //neue Instanz Typ Mensch mit Werten, vorher schon definiert
        System.out.println(a.printAll()); // Methode ausführen
    }
}
