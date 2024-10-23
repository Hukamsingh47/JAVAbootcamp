
import java.util.Scanner;

/*

    data types
    variable  types
    control statement: if, else if, switch

    looping statement: for, while, do while

    data base connectivity

    OOPS 

 */

public class LoopingStatement 
{
    public static void main(String[] args) 
    {
        
        int no = 5;
        System.out.println(" for loop start ");

        /*
          i = 0,   0 < 5 : true, ++
          1 , 1 < 5 true, i++
          2, 2 < 5 true , 2 == 2
          3, 3 < 5 true
          4, 4 < 5 true , i++
          5, 5 < 5 false
         */
        for(int i =0; true; i++) // ( initialization ; condition ; increment/decrement )
        {
            //START
            if (i == 2) 
            {
                break;   //  
                //continue;
            }
            System.out.println( "value of i = "+i);
            //END
        }
        System.out.println(" for loop end ");
        System.out.println(" while loop start ");
        int i = 0;
        
        while (i < no) 
        { 
            System.out.println(" inside while loop starting, i =  "+i);
            i++;
            System.out.println(" inside while loop ending, i  = "+i);
        }
        System.out.println(" while loop end ");
        while (true) 
        { 
            System.out.println(" please enter your pin ");
            Scanner sc = new Scanner(System.in);
            int pin = sc.nextInt();    
            if(pin == 1122)
            {
                System.out.println(" pin is correct ");
                break;
            }
            else
            {
                System.out.println(" pin in incorrect, please try again ");
            }
        }
        System.out.println(" end of program");
        int j = 0;
        for (; j < 5;) 
        {
            j++;
        }
        int k = 0;
        for(; k < 5; k++);
        
        
        /*
        {
            System.out.println(" inside for loop, k = "+k);
        }
        */
        System.out.println(" k = "+k);
        if(k == 0);
        System.out.println(k);
    }
    
}
