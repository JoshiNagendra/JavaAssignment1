package Assignment_no_1;

public class Question_5 
{
   int n=10;
   public void question_5()
   {
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   if(i==0||j==0||i==(n-1)||i-j>=((n-1)/2)||i+j<=((n-1)/2))
			   {
				   System.out.print("*");
			   }
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
	   }
   }
   public static void main(String args[])
   {
	   Question_5 qe5 = new Question_5();
	   qe5.question_5();
   }
}
