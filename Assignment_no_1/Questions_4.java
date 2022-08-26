package Assignment_no_1;

public class Questions_4 
{
	int n =10;
   public void question_4()
   {
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   if(j==0&&i>(n-1)/2||i==n-1||j==(n-1)&&i>((n-1)/2)||i-j>=((n-1)/2)||i+j>=((n-1)+((n-1)/2)))
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
	   Questions_4 qe4 = new Questions_4();
	   qe4.question_4();
   }
}
