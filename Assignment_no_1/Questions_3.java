package Assignment_no_1;

public class Questions_3 
{
	int n=9;
   public void question_3()
   {
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   if(i==0||i==(n-1)||j==0||j==(n-1)||i+j<=((n-1)/2)||j-i>=((n-1)/2))
			   {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
	   }
   }
   public static void main(String args[])
   {
	   Questions_3 qe3 =new Questions_3();
	   qe3.question_3();
   }
}
