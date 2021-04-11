
/**
 * Klasse Held, erbt von Character
 * @version 1.0
 * @author dt
 */
class Held extends Karacter {
    private Inventar meinInventar;
    private int angriffswert;
    private boolean privat;
    private Rucksack meinRucksack;
    private Hehler meinHehler;

    int Stärke = 5;
    int Verteidigung = 5;
    int Agilität = 5;
    int Gesundheit_Max;
    // Geldsystem
    int dublonen;
    // Levelsystem  
    int monstercounter;
    private Level level;

    public Held(String name, int gesundheit, int kampf, boolean privat, int dublonen) {
        super(name, gesundheit, kampf);
        meinInventar = new Inventar();
        this.privat = privat;
        meinRucksack = new Rucksack();
        Gesundheit_Max = gesundheit;
        this.dublonen = dublonen;
        meinHehler = new Hehler();

        monstercounter = 0;
        level = new Level();
    }

    //zum testen
    public Held() {
        super("test", 100, 100);
        meinInventar = new Inventar();
        this.privat = true;
        meinRucksack = new Rucksack();
        dublonen = 20;
        meinHehler = new Hehler();
    }

    /**
     * Der Held greift ein Monster an.
     * 
     * @param g das Monster das angegriffen werden soll
     * @param r die Kampfregel die den Kapf berechnet
     */
    public void angreifen(Monster g, Kampfregel r) {
        r.kampf(this, g);
        if (gesundheit <= 0) {
            System.out.println("Du bist tot!");
        }
        else {
            dublonen = dublonen + 5;//wenn ein Karakter jemand anderen tötet bekommt er geld
            monstercounter++;
        }

        //level++;
    }

    public void angriffswertBerechnen() {
        int gesundheitVer = (int)Math.round(level.levelbonus(monstercounter, gesundheit));
        angriffswert = gesundheitVer + meinInventar.nehmeAusDemInventar().getBonus();
    }

    public int getAngriffswert() {
        this.angriffswertBerechnen();
        return angriffswert;
    }

    public int getGesundheit() {
        int gesundheitVer = (int)Math.round(level.levelbonus(monstercounter, gesundheit));
        return gesundheitVer;
    }

    /**
     * nimmt eine Waffe und fügt sie dem inventar hinzu
     */
    public void waffeAufnehmen(Waffe waffe) {
        meinInventar.fuegeHinzu(waffe);

    }

    /**
     * Nachher: waffe hat den wert null!
     */
    public void waffeAblegen() {
        //???
    }

    public boolean getPrivat(){
        return privat;
    }

    public void gewinn(int get)
    {
        dublonen = dublonen + get;
    }

    public void verlust(int loose)
    {
        dublonen = dublonen - loose;
    }

    public int kontostand()
    {
        return dublonen;
    }

    public void hehlerGambeln(int stufe)
    {
        if(stufe < 1 || stufe > 3 )
        {
            System.out.println("Du kannst nur Stufe 1, 2 oder 3 nehmen.");
        }
        else
        {
            meinHehler.gambeln(stufe , this.kontostand());
            if(meinHehler.kosten() > 0)
            {
                this.verlust(meinHehler.kosten());
                meinHehler.kostenReset();
                this.waffeAufnehmen(meinHehler.gewinn());
            }
        }
    }
    
    public void hehlerPreisTabelle()
    {
        meinHehler.preiseInfo();
    }
}