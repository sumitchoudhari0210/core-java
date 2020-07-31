package Stringcount;

public class CountCharacters 
{
	public static void main(String[] args) 
	{
		
		String s="abcabcdbacesbacrgacsbcsv bdfarsdasbafacsbaf";
		char [] ch= s.toCharArray();
		for(int i=0; i<ch.length;i++) 
		{
			if (ch[i]!='\u0000')
			{
				int counter=1;
				for(int j=i+1;j<ch.length;j++) 
				{
					if (ch[i]==ch[j]) 
					{
						counter++;
						ch[j]='\u0000';
					
					}
			
				}
				if(counter%2==1) {System.out.println(ch[i]+" Number of times repeated-"+ counter);
				}
			}
			
		}
		
	}

}
