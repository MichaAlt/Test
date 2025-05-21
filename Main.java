
/**
 * Beschreiben Sie hier die Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Main
{
    public static void main (String args[])
    {
       int oberGrenze = 100;
       double mult = 1;
       
       for(int i = 1; i <= oberGrenze; ++i)
       {
           mult *= i;     
        }
       
    System.out.println("Mult = " + mult); 
    }
}
