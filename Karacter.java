/**
 * Oberklasse für alle Spieler und Monster
 * (alles das was die beiden gemeinsam haben..)
 * @version 1.0
 * @author dt
 */
abstract class Karacter
{
    // instance variables - replace the example below with your own
    protected String name;
    protected int gesundheit;
    protected int kampfkraft;
    /**
     * Constructor for objects of class Character
     */
    public Karacter(String name, int gesundheit, int kampf)
    {
        // initialise instance variables
        this.name = name;
        this.gesundheit = gesundheit;
        this.kampfkraft = kampf;
    }

    /** 
     * getter und setter
     */
    public int getGesundheit() {
        return gesundheit;
    }
    
    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }
    
    public int getKampfKraft() {
        return kampfkraft;
    }
    
    public void setKampfkraft(int kampfkraft) {
        this.kampfkraft = kampfkraft;
    }
    
     public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
