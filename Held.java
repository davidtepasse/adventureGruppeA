
/**
 * Klasse Held, erbt von Character
 * @version 1.0
 * @author dt
 */
class Held extends Karacter {
    private int vermoegen;
    private Inventar meinInventar;
    private int angriffswert;
    private boolean privat;
    private Rucksack meinRucksack;
    int Stärke = 5;
    int Verteidigung = 5;
    int Agilität = 5;
    int Gesundheit_Max;
    private Waehrung geld;
   
    public Held(String name, int vermoegen, int gesundheit, int kampf, boolean privat) {
        super(name, gesundheit, kampf);
        meinInventar = new Inventar();
        this.vermoegen = vermoegen;
        this.privat = privat;
        meinRucksack = new Rucksack();
        Gesundheit_Max = gesundheit;
        geld = new Waehrung();
    }

    //zum testen
    public Held(boolean privat) {
        super("test", 100, 100);
        meinInventar = new Inventar();
        this.vermoegen = 100;
        this.privat = privat;
        meinRucksack = new Rucksack();

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
              geld.gewinn(5);//wenn ein Karakter jemand anderen tötet bekommt er geld
          }
          //level++;
      }

    public void angriffswertBerechnen() {
        angriffswert = gesundheit + meinInventar.nehmeAusDemInventar().getBonus();
    }
    
    public int getAngriffswert() {
        this.angriffswertBerechnen();
        return angriffswert;
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
}