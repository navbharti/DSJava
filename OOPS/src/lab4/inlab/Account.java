package lab4.inlab;

public class Account {

private int id;

private double balance;

private double annualInterestRate;

Account()

{

this.id=0;

this.balance=0.0;

this.annualInterestRate=0.0;

}

Account(int i,double b)

{

if(setID(i))

this.id=i;

else

this.id=0;

if(setBalance(i))

this.balance=b;

else

this.balance=0.0;

this.annualInterestRate=4.5;

}

private int getID()

{

return this.id;

}

private double getBalance()

{

return this.balance;

}

private double getAnnualInterestRate()

{

return this.annualInterestRate;

}

private double getMonthlyInterest()

{

return ((getBalance()*getAnnualInterestRate())/(100*12));

}

private boolean setBalance(double b)

{

if(b>=0)

{

this.balance=b;

return true;

}

return false;

}

private boolean setID(int i)

{

if(i>=0)

{

this.balance=i;

return true;

}

return false;

}

private boolean withDraw(double wd)

{

if((this.balance - wd)>0)

{

this.balance -= wd;

return true;

}

return false;

}

private boolean deposit(double dp)

{

this.balance +=dp;

return true;

}

public String toString()

{

return String.format("%nAccount Details:%nAccount Number : %d%nBalance : %.2f%nMonthly Interest : %.2f", getID(),getBalance(),getMonthlyInterest());

}

public static void main(String[] args)

{

Account acc = new Account(1122,20000);

if(!acc.withDraw(2500))

System.out.println("No sufficient amount in the account");

else

System.out.println("Withdraw is succesful");

if(acc.deposit(3000));

System.out.println("Amount deposited succesfully");

System.out.println(acc);

}

}