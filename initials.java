package projects;
import java.util.Scanner;

public class initials
{
	static void printInitials(String name)
    {
        if(name.length()==0)
        	return;
        //first name initial
        System.out.print(Character.toUpperCase(name.charAt(0)));
        //other parts of name
        for(int i=1;i<name.length();i++)
        {
        	if(name.charAt(i)==' ')
        	{
        		System.out.println(" "+ Character.toUpperCase(name.charAt(i+1)));
        	}
        }
        
    }
 
// Driver code
public static void main(String args[])
{	
	Scanner sc= new Scanner(System.in); 
	System.out.println("***************************************** \n");
	System.out.println("\tWelcome to initial generator!\t");
	System.out.println("***************************************** \n");
	System.out.println("Please enter your name!");
	String name= sc.nextLine();   
    printInitials(name);
}

}
