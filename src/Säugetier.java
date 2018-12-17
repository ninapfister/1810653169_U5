public abstract class Säugetier // abstrakte Klasse, abstract heißt es lassen sich keine Objekte erzeugen, nur Strukturelement, besteht die Möglichkeit Methoden ohne Rumpf zu deklarieren
{
    private String name; // Attribute, objektorientiert, getter und setter
    private int alter;
    private String geschlecht;

    public Säugetier(String name, int alter, String geschlecht) // Konstruktor
    {
        this.alter=alter; // mit this greift man auf das Attribut zu, . alter bestimmt es genauer, Wertzuweisung
        this.name=name;
        this.geschlecht=geschlecht;
    }

    public abstract String printAll(); // abstrakte Methode,kann nicht implementiert werden, nur in abgeleiteter Klasse durch Methoden-Überlagerund implementiert, keinen Methodenrumpf, anstelle Rumpf und Klammern - Semikolon

    // getter und setter

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public String getGeschlecht()
    {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht)
    {
        this.geschlecht = geschlecht;
    }
}
