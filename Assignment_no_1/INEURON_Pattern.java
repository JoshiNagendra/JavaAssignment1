package Assignment_no_1;

public class INEURON_Pattern 
{
	int n=7;
  public void iNeuron()
  {
	  /// alpha I
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  if(i==0&&j>0&&j<n-1||j==((n-1)/2)||i==(n-1)&&j>0&&j<n-1)
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.print("  ");
		  
		  // alpha N
		  
		  for(int j=0;j<n;j++)
		  {
			  if(j==0||j==(n-1)||i==j)
			  {
				  System.out.print("*");
			  }
			  else 
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.print("  ");
		  
		  // alpha E
		  
		  for(int j=0;j<n;j++)
		  {
			  if(i==0||j==0||i==((n-1)/2)||i==(n-1))
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.print("  ");
	       
		  // alpha U
		  
		  for(int j=0;j<n;j++)
		  {
			  if(j==0&&i<n-2||j==(n-1)&&i<(n-2)||i-j==(n-2)||i+j==(n-1)+((n-2))||i==(n-1)&&j>0&&j<(n-1))
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.print("  ");
		  
		  //alpha R
		  
		  for(int j=0;j<n;j++)
		  {
			  if(i==0&&j<(n-3)||j==(((n-1)/2)+1)&&i>0&&i<(n-4)||i-j==(((n-1))/2)-1||j==0||i==((n-1)/2)&&j<(n-3))
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.print("");
		  //alpha O
		  for(int j=0;j<n;j++)
		   {
			   if(i==0&&j!=0&&j!=(n-1)||j==0&&i!=0&&i!=(n-1)||i==(n-1)&&j!=0&&j!=(n-1)||j==(n-1)&&i!=0&&i!=(n-1))
			   {
				   System.out.print("*");
			   }
			   else
				   System.out.print(" ");
		   }
		   System.out.print("  ");
		   
		   //alpha N
		   for(int j=0;j<n;j++)
			  {
				  if(j==0||j==(n-1)||i==j)
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
	  INEURON_Pattern in = new INEURON_Pattern();
	  in.iNeuron();
  }
}
