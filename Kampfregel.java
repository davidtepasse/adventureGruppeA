public class Kampfregel {

    private Wuerfel wuerfel6;
    private Wuerfel wuerfel10;
    
    /**
     * Erstellt eine neue Kampfregel
     */
    public Kampfregel() {
        wuerfel6 = new Wuerfel(6);
        wuerfel10 = new Wuerfel(10);
    }

    /**
     * Ein Angriff zwischen einem Helden und einem Monster
     * 
     * @param k1 der Held
     * @param k2 das Monster
     */
    public void kampf(Held k1, Monster k2) {
        while (k1.getGesundheit() > 0 && k2.getGesundheit() > 0) {
            int bonusA = wuerfel10.wuerfeln() + wuerfel6.wuerfeln();
            int bonusB = wuerfel10.wuerfeln() + wuerfel6.wuerfeln();
            if (k1.getAngriffswert() + bonusA < k2.getKampfKraft() + bonusB) {
                k1.setGesundheit(k1.getGesundheit()-1);
            }
            else {
                k2.setGesundheit(k2.getGesundheit()-1);
            }
        }
    }

}