import java.util.Date;
import java.util.Calendar; 
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class menstNasc
{
    // instance variables - replace the example below with your own
    private Date ultimaMenst;
    private String resposta;
    
    public menstNasc()
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Em qual dia ocorreu a última menstruacao? (DUM)");
        
        resposta = input.next(); 
        
        try 
        {
         Date dum = new SimpleDateFormat("dd/MM/yyyy").parse(resposta);
         Calendar c = Calendar.getInstance(); 
         c.setTime(dum);
         //c.add(Calendar.MONTH, 9);
         c.add(Calendar.DATE, 39*7);
         Date dpp = c.getTime();
         System.out.println(dpp);
         new menstNasc();
        } 
        catch (Exception e) 
        {
         System.out.println("Formato de data incorreto!");
         new menstNasc();
        }   
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
    
    }
}
