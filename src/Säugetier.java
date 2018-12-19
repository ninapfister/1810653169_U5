public abstract class Säugetier // abstrakte Klasse, abstract heißt es lassen sich keine Objekte erzeugen, nur Strukturelement, besteht die Möglichkeit Methoden ohne Rumpf zu deklarieren
{ // abstrakte KLassen als Superklassen eingesetzt, die abstrakte Methoden enthalten, die sspäter von abgeleiteten Klassen implementiert werden
    // Interface - werden verwendet um Gemeinsamkeiten die in mehreren Klassen sind, in seperaten KLassen zu definieren, Schnittstelle - welche Mtehoden Klasse die implementiert verfügen muss
    // alle Klassen die Interface implementieren, müssen alle Methoden die Interface vorgibt enthalten, kann nichts ausgeben, ; statt KLammer, Contract also 2 Sachen und nur 1 Aufrufen


    private String name; // Attribute, objektorientiert, getter und setter
    private int alter;
    private String geschlecht;

    public Säugetier(String name, int alter, String geschlecht) // Konstruktor
    {
        this.alter=alter; // mit this greift man auf das Attribut zu, . alter bestimmt es genauer, Wertzuweisung
        this.name=name;
        this.geschlecht=geschlecht;
    }

    public abstract String printAll(); // abstrakte Methode,kann nicht implementiert werden, nur in abgeleiteter Klasse (Vererbung) durch Methoden-Überlagerund implementiert, keinen Methodenrumpf, anstelle Rumpf und Klammern - Semikolon
    // können nicht aufgerufen werden

    // getter und setter, brauch ich, könnte es auch mit this zugreifen aber dann nur in dieser Klasse

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
