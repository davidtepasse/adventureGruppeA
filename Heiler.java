
/**
 * Klasse Heiler
 * Ein Heiler kann Helden heilen
 * 
 * @author dt
 * @version 0.1
 */
public class Heiler extends Karacter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    Wartebank meinePraxis;
    // allgemeine Heilkraft
    private int heilkraft;
    private Held held;
    
    /**
     * Konstruktor für Objekte der Klasse Heiler
     * @param   eine Queue als Wartebank
     */
    public Heiler(Wartebank meinePraxis, int heilkraft)
    {
        // Instanzvariable initialisieren
        super("Hipokrates", 100,1);
        this.heilkraft = heilkraft;
        this.meinePraxis = meinePraxis;
    }
    
    /**
     * heilt /behandelt den vordersten Helden von der Wartebank
     */
    public void heilen() {
        Held temp = meinePraxis.heldVorlassen();
        temp.setGesundheit(temp.getGesundheit()+heilkraft);
        held.verlust(10);
    }
}
