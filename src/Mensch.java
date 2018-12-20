public class Mensch extends Säugetier //implementieren, erben/erweitert Säugetier
{
    public Mensch(String name, int alter, String geschlecht) // erben, Konstrukor
    {
        super(name, alter, geschlecht); // super weil es nicht in der selben Klasse ist
    }

    @Override //überschreiben in diesem Fall astrakte Klasse, normal nix drinnen, jetzt steht was drinnen, Hinweis das die Methode von anderer Klasse ist
    public String printAll() // soll alle Attribute ausgeben
    {
        return String.format (getName() + "#" + getAlter() + "#" + getGeschlecht() + "#"); // gibt alle Attribute getrennt zurück, # vorgegeben
    } // . format für Zwischenzeichen, kann man direkt in die String hineinspeichern
}
