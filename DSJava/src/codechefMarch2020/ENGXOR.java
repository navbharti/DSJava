package codechefMarch2020;

import java.util.Scanner;

public class ENGXOR {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 int  TotalNo,Qu,ans,p;
		    int i,j;
		    //scanf("%ld %ld",&TotalNo,&Qu);
		    TotalNo = Integer.parseInt(input.next());
		    Qu = Integer.parseInt(input.next());
		    int a[]=new int[TotalNo];
		    //long int a  =(long int) malloc(sizeof(long int)*TotalNo);
		    for(i=0;i<TotalNo;i++)
		        //scanf("%ld",&a[i]);
		    	a[i]=Integer.parseInt(input.next());
		     int co=0,ce=0;
		    for(i=0;i<TotalNo;i++)
		       if(doCal(a[i])==true)
		            co++;
		       else
		            ce++;
		   for(i=0;i<Qu;i++)
		   {
		      // scanf("%ld",&p);
			   p = Integer.parseInt(input.next());
		       ans = p;
		           if(doCal(ans))
		                System.out.println(co+" "+ce);
		        	   //printf("%ld %ld\n",co,ce);
		           else
		                System.out.println(ce+" "+co);
		        	   //printf("%ld %ld\n",ce,co);
		       
		   }
	}

	public static boolean doCal(int n) {
		int p, c=0;
		
		while(n!=0) {
			p=n%2;
			if(p==1)
				c++;
			n=n/2;
		}
		
		if(c%2==0)
			return false;
		return true;
	}
}
