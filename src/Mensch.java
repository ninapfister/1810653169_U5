public class Mensch extends Säugetier //implementieren, erben
{
    public Mensch(String name, int alter, String geschlecht) // erben, Konstrukor
    {
        super(name, alter, geschlecht); // super weil es nicht in der selben Klasse ist
    }

    @Override //überschreibt astrakte Klasse, normal nix drinnen, jetzt steht was drinnen
    public String printAll() // soll alle Attribute ausgeben
    {
        return String.format (getName() + "#" + getAlter() + "#" + getGeschlecht() + "#"); // gibt alle Attribute getrennt zurück, # vorgegeben
    } // . format für Zwischenzeichen, kann man direkt in die String hineinspeichern
}
