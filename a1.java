import java.util.*;

class a1
{
	public static void main(String[]args)
	{
	
	int a=(int)(Math.random()*100);
	int b=0,cnt=0;
	
	
	do
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		
		//b=sc.next();
		if(a>b)
		{
			System.out.println("Try lower");
			cnt++;
		}
		else
			{
			if(a<b)
			System.out.println("Try higher");
			cnt++;
			}
		}
		catch(Exception e){}
		System.out.println(cnt);
	}while(a!=b);

	}
}	