import java.util.Scanner;

public class Ques1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms in the series: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			if(i==n-1)
			{
				System.out.print(i*2+","+i);
				break;
			}
			System.out.print(i*2+","+i+",");
		}

	}

}
