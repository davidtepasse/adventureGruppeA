
/**
 * Berechnung der Level mit Bonus
 * 
 * @author Jannis, Niklas, Ole 
 * @version 26.03.21
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
     * Gesundheitsbonus pro Monstertode
     * 
     * @param  Monstercount 
     * @return Mulitplikator Gesundheit 
     */
    public double levelbonus(int monstercount , int gesundheit)
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
    /**
     * Level Ausgabe 
     */
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
