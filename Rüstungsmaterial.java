
/**
 * Material der Rüstung
 *
 * @author jkd,tb
 * @version 1.0
 */
public class Rüstungsmaterial {
    
    private String name;
    
    private int materialBonus;
    
    /**
     * Erstellt ein neues Rüstungsmaterial
     * 
     * @param name Name des Materials
     * @param materialBonus der Bonus den das Material verleiht
     */
    public Rüstungsmaterial(String name, int materialBonus) {
        this.name = name;
        this.materialBonus = materialBonus;
    }
    
    // GETTER UND SETTER
    
    public String getName() {
        return name;
    }
    
    public int getMaterialBonus() {
        return materialBonus;
    }
}