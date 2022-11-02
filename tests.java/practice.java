import java.util.Scanner;	
class practice
{
	public static void main(String arg[])
	{	 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any character:");
	  char ch=sc.next( ).charAt(0);	 
          int n=characterToAscii(ch);
          System.out.println("The ASCII value of " + ch + " is: " + n);
          sc.close();    
    }
	static int characterToAscii(char c)
	{
	  int num = (int) c;
	  return num;
	}

}