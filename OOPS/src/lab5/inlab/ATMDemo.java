package lab5.inlab;

public class ATMDemo

{

public static void main(String[] args)

{

Atm x=Atm.amount();

System.out.println("Original Balance :"

+x.Balance);

x.getAmount(10);

System.out.println("Balance after dedction:"

+x.Balance);

Atm y = Atm.amount();

y.getAmount(1000);

System.out.println("Balance after dedction:"

+y.Balance);

Atm z = Atm.amount();

z.getAmount(1000);

System.out.println("Balance after dedction:"

+z.Balance);

}

}


	class Atm

	{

	private static Atm acc=null;

	public double Balance=123516;

	public static Atm amount()

	{

	if(acc==null)

	acc=new Atm();

	return acc;

	}

	public void getAmount(int m)

	{

	if(Balance==0)

	System.out.println("Insufficient Balance");

	else if(Balance-m<0)

	System.out.println("Insufficient Balance");

	else

	Balance=Balance-m;

	}

	}

	