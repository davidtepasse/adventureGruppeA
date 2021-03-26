public class Rüstung {
    
    private String name;

    private int bonus;

    private Material material;

    private int magie;
    
    private int zustand;
    
    /**
     * Erstellt eine neue Rüstung
     * 
     * @param material das Material der Rüstung
     * @param name der Name der Rüstung
     */
    public Rüstung(Material material, String name) {
        this.material = material;
        this.name = name;
        zustand = 100;
        bonusBerechnen();
    }
    
    // schnelle standardwaffe
    public Rüstung() {
        this.material = new Material ("holz", 10);
        this.name = "Knueppel";
        zustand = 100;
        bonusBerechnen();
    }

    /**
     * Berechnet den Bonus der Rüstung
     */
    public void bonusBerechnen() {
        bonus =  material.getRüstungsmaterialBonus()*zustand/100;
    }

    // GETTER UND SETTER
    
    public int getRüstungBonus() {
        return bonus;
    }
    
    public String getRüstungName() {
        return name;
    }

    public int getRüstungZustand(){
        return zustand;
    }
    
    public void setRüstungZustand(int zustand){
        this.zustand = zustand;
    }
}