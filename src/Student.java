public class Student extends Mensch2 // erbt von Mensch2
{
    private int matrikelnummer; // Atribute
    private String studiengang;

    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang) // Konstruktor Student
    {
        super(vorname, nachname, alter); // super weil es nicht in der selben Klasse ist
        this.matrikelnummer=matrikelnummer; // mit this greift man auf das Attribut zu, .matrikelnummer bestimmt diese genau, Wertzuweisung
        this.studiengang=studiengang; // neue Sachen dazu
    }
    // getter und setter, brauch ich, könnte es auch mit this zugreifen aber dann nur in dieser Klasse

    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang()
    {
        return studiengang;
    }

    public void setStudiengang(String studiengang)
    {
        this.studiengang = studiengang;
    }

    @Override //überschreibt abstrakte Klasse
    public void Status() // Methode
    {
        System.out.println(getVorname() + " " + getNachname() + " ist ein Student und ist " + getAlter() + " Jahre alt und studiert "
                + getStudiengang() + ". Die Martrikelnummer lautet: " + getMatrikelnummer()); //Ausgabe
    }
}
