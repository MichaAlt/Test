import java.math.*;

public class Main
{
    public static void main (String args[])
    {

        int oberGrenze = 100;
        BigInteger mult = new BigInteger("1");
        //double mult = 1;
       
        for(int i = 1; i <= oberGrenze; ++i)
        {
            String param = String.valueOf(i);
            //mult *= i;    
            mult = mult.multiply(new BigInteger(param));
        }
       
        System.out.println("Mult = " + mult); 
    }
}
