
public class Pattern15 {
public static void main(String[] args) {
int s=5;
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<i;j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=s; k++)
			{
				System.out.print(k);
			}
			s--;
			System.out.println();
		}
		
		
	}
	

}
