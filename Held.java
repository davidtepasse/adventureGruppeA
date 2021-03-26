
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
        
        monstercounter = 0;
        level = new Level();
    }

    //zum testen
    public Held(boolean privat) {
        super("test", 100, 100);
        meinInventar = new Inventar();
        this.privat = privat;
        meinRucksack = new Rucksack();
        dublonen = 100;
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
    
    public int gewinn(int get)
    {
        dublonen = dublonen + get;
        return dublonen;
    }
    
    public int verlust(int loose)
    {
        dublonen = dublonen - loose;
        return dublonen;
    }
    
    public int Kontostand()
    {
        return dublonen;
    }
}