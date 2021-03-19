
/**
 * Beschreiben Sie hier die Klasse Waehrung.
 * 
 * @author Louis, Nico, Moritz  
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Waehrung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public int dublonen;

    /**
     * Konstruktor für Objekte der Klasse Waehrung
     */
    public Waehrung()
    {
        dublonen = 100;
    }

    public int verlust(int loose)
    {
        dublonen = dublonen - loose;
        return dublonen;
    }
    
    public int gewinn(int get)
    {
        dublonen = dublonen + get;
        return dublonen;
    }
}
