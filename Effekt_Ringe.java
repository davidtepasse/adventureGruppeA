
/**
 * Write a description of class Ringe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Effekt_Ringe
{
    int Zusatz_Gesundheit = 0;
    int Zusatz_Stärke = 0;
    int Zusatz_Verteidigung = 0;
    int Zusatz_Glück = 0;
    int Zusatz_Agilität = 0;
    int Preis = 0;
    String Ringname;
    Effekt_Ringe erster_Ring;
    Effekt_Ringe zweiter_Ring;
    /**
     * Constructor for objects of class Ringe
     */
    public Effekt_Ringe(int Ringtyp)
    {
        switch(Ringtyp){
            case 0:
            Zusatz_Gesundheit = 50;
            Preis = 100;
            Ringname = "Gesundheitsring";
            break;

            case 1:
            Zusatz_Stärke = 25;
            Preis = 150;
            Ringname = "Stärkering";
            break;

            case 2:
            Zusatz_Verteidigung = 25;
            Preis = 150;
            Ringname = "Verteidigungsring";
            break;

            case 3:
            Zusatz_Agilität = 25;
            Preis = 150;
            Ringname = "Agilitätsring";
            break;

            default:
            break;
        }
    }

    public void ausrüsten(Effekt_Ringe equip_ring, Held player){
        switch(equip_ring.Ringname){
            case "Gesundheitsring":
            if(erster_Ring == null){
                player.Gesundheit_Max += Zusatz_Gesundheit;
                player.Gesundheit += Zusatz_Gesundheit;
                erster_Ring = equip_ring;
            }
            else if(zweiter_Ring == null){
                player.Gesundheit_Max += Zusatz_Gesundheit;
                player.Gesundheit += Zusatz_Gesundheit;
                zweiter_Ring = equip_ring;
            }
            else{
                System.out.println("Du kannst nicht mehr als zwei Ringe gleichzeitig ausgerüstet haben.");
            }
            break;

            case "Stärkering":
            if(erster_Ring == null){
                player.Stärke += Zusatz_Stärke;
                erster_Ring = equip_ring;
            }
            else if(zweiter_Ring == null){
                player.Stärke += Zusatz_Stärke;
                zweiter_Ring = equip_ring;
            }
            else{
                System.out.println("Du kannst nicht mehr als zwei Ringe gleichzeitig ausgerüstet haben.");
            }
            break;

            case "Verteidigungsring":
            if(erster_Ring == null){
                player.Verteidigung += Zusatz_Verteidigung;
                erster_Ring = equip_ring;
            }
            else if(zweiter_Ring == null){
                player.Verteidigung += Zusatz_Verteidigung;
                zweiter_Ring = equip_ring;
            }
            else{
                System.out.println("Du kannst nicht mehr als zwei Ringe gleichzeitig ausgerüstet haben.");
            }

            break;

            case "Agilitätsring":
            if(erster_Ring == null){
                player.Agilität += Zusatz_Agilität;
                erster_Ring = equip_ring;
            }
            else if(zweiter_Ring == null){
                player.Agilität += Zusatz_Agilität;
                zweiter_Ring = equip_ring;
            }
            else{
                System.out.println("Du kannst nicht mehr als zwei Ringe gleichzeitig ausgerüstet haben.");
            }

            break;

            default:
            System.out.println("Ring existiert nicht.");
            break;
        }
    }

    public Effekt_Ringe ablegen(int Slot, Held player){
            if(Slot == 1){
                Effekt_Ringe temp = erster_Ring;
                Effekt_annullieren(erster_Ring, player);
                erster_Ring = null;
                return temp;
            }
            else if(Slot == 2){
                Effekt_Ringe temp = zweiter_Ring;
                Effekt_annullieren(zweiter_Ring, player);
                erster_Ring = null;
                return temp;
            }
            else{
                System.out.println("Kein Ring an diesem Finger ausgerüstet.");
                return null;
            }
    }
    public void Effekt_annullieren(Effekt_Ringe null_Ring, Held Player){
        switch(null_Ring.Ringname){
            case "Gesundheitsring":
            Player.Gesundheit_Max -= Zusatz_Gesundheit;
            if(Player.Gesundheit >= Player.Gesundheit_Max){
                Player.Gesundheit = Player.Gesundheit_Max;
            }
            break;
            
            case "Stärkering":
            Player.Stärke -= Zusatz_Stärke;
            break;
            
            case "Verteidigungsring":
            Player.Verteidigung -= Zusatz_Verteidigung;
            break;
            
            case "Agilitätsring":
            Player.Agilität -= Zusatz_Agilität;
            break;
            
            default:
            break;
        }
    }
}