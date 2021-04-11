
/**
 * Beschreiben Sie hier die Klasse Hehler.
 * 
 * @Jannis Rose
 * @08.04.2021
 */
public class Hehler
{
    public List<Waffe> listeLow;
    public List<Waffe> listeMid;
    public List<Waffe> listeHigh;

    int kosten = 0;
    Waffe waffeGewinn;
    /**
     * Konstruktor für Objekte der Klasse Hehler
     */
    public Hehler()
    {
        listeLow = new List<Waffe>();
        listeLow.append(new Waffe(new Material("holz", 10) , 10,"erste"));
        listeLow.append(new Waffe(new Material("holz", 10) , 10,"erste"));
        listeLow.append(new Waffe(new Material("stein", 15) , 15,"zweite"));
        listeLow.append(new Waffe(new Material("stein", 15) , 15,"zweite"));
        listeLow.append(new Waffe(new Material("eisen", 25) , 25,"dritte"));

        listeMid = new List<Waffe>(); 
        listeMid.append(new Waffe(new Material("holz", 10) , 10,"erste"));
        listeMid.append(new Waffe(new Material("stein", 15) , 15,"zweite"));
        listeMid.append(new Waffe(new Material("stein", 15) , 15,"zweite"));
        listeMid.append(new Waffe(new Material("eisen", 25) , 25,"dritte"));
        listeMid.append(new Waffe(new Material("diamand", 40) , 40,"vierte"));

        listeHigh = new List<Waffe>();
        listeHigh.append(new Waffe(new Material("stein", 15) , 15,"zweite"));
        listeHigh.append(new Waffe(new Material("eisen", 25) , 25,"dritte"));
        listeHigh.append(new Waffe(new Material("eisen", 25) , 25,"dritte"));
        listeHigh.append(new Waffe(new Material("diamand", 40) , 40,"vierte"));
        listeHigh.append(new Waffe(new Material("obisidian", 70) , 70,"fünfte"));
    }

    public void preiseInfo()
    {
        System.out.println("Preistafel:");
        System.out.println("Stufe 1 : 10");
        System.out.println("Stufe 2 : 20");
        System.out.println("Stufe 3 : 30");

    }

    public void gambeln(int stufe, int kontostand)
    {
        if (stufe == 1)
        {
            if(kontostand > 9)
            {
                kosten = 10;
                int random_int = (int)Math.floor(Math.random()*(4-0+1)+0);
                listeLow.toFirst();
                for (int i = 0; i < random_int; i++) {
                    listeLow.next();
                }
                waffeGewinn = listeLow.getContent();
            }
            else
                System.out.println("Du hast nicht genug Geld!");
        }
        else if (stufe == 2)
        {
            if(kontostand > 19)
            {
                kosten = 20;
                int random_int = (int)Math.floor(Math.random()*(4-0+1)+0);
                listeMid.toFirst();
                for (int i = 0; i < random_int; i++) {
                    listeMid.next();
                }
                waffeGewinn = listeMid.getContent();
            }
            else
                System.out.println("Du hast nicht genug Geld!");
        }
        else if (stufe == 3)
        {
            if(kontostand > 29)
            {
                kosten = 30;
                int random_int = (int)Math.floor(Math.random()*(4-0+1)+0);
                listeHigh.toFirst();
                for (int i = 0; i < random_int; i++) {
                    listeHigh.next();
                }
                waffeGewinn = listeHigh.getContent();
            }
            else
                System.out.println("Du hast nicht genug Geld!");
        }
    }

    public int kosten()
    {
        return kosten;
    }

    public Waffe gewinn()
    {
        return waffeGewinn;
    }
    
    public void kostenReset()
    {
        kosten = 0;
    }
}