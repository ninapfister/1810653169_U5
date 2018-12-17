public class Mensch2 {
    private String vorname; // Attribute
    private String nachname;
    private int alter;


    public Mensch2(String vorname, String nachname, int alter) //Konstruktor
    {
        this.vorname = vorname; // mit this greift man auf das Attribut zu, .vorname bestimmt es genau, Wertzuweisung
        this.nachname = nachname;
        this.alter = alter;
    }
        // getter und setter, brauch ich, könnte es auch mit this zugreifen aber dann nur in dieser Klasse

        public String getVorname ()
        {
            return vorname;
        }

        public void setVorname (String vorname)
        {
            this.vorname = vorname;
        }

        public String getNachname ()
        {
            return nachname;
        }

        public void setNachname (String nachname)
        {
            this.nachname = nachname;
        }

        public int getAlter ()
        {
            return alter;
        }

        public void setAlter ( int alter)
        {
            this.alter = alter;
        }

        public void Status () // Methode
        {
            System.out.println(getVorname() + " " + getNachname() + " ist ein Mensch und ist " + getAlter() + " Jahre alt"); // Ausgabe
        }
    }