
/**
 * Beschreiben Sie hier die Klasse Level.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Level
{

    /**
     * Konstruktor für Objekte der Klasse Level
     */
    public Level()
    {
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public double levelbonus(double monstercount , double gesundheit)
    {
        double gVerrrechnet = 0;
        if(monstercount < 10){
            gVerrrechnet = gesundheit * 1;
        }
        else if(monstercount < 25){
            gVerrrechnet = gesundheit * 1.05;
        }
        else if(monstercount < 50){
            gVerrrechnet = gesundheit * 1.15;
        }
        else if(monstercount < 75){
            gVerrrechnet = gesundheit * 1.25;
        }
        else if(monstercount < 100){
            gVerrrechnet = gesundheit * 1.35;
        }
        else if(monstercount < 1000){
            gVerrrechnet = gesundheit * 1.45;
        }
        else if(monstercount > 999){
            gVerrrechnet = gesundheit * 10;
        }
        return gVerrrechnet;
    }
    public int level(int monstercount)
    {
        int level = 0;
        
        if(monstercount < 10){
            level = 1;
        }
        else if(monstercount < 25){
            level = 2;
        }
        else if(monstercount < 50){
            level = 3;
        }
        else if(monstercount < 75){
            level = 4;
        }
        else if(monstercount < 100){
            level = 5;
        }
        else if(monstercount < 1000){
            level = 6;
        }
        else if(monstercount > 999){
            level = 7;
        }
        
        
        return level;
    }
}
