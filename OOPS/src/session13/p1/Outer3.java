package session13.p1;

public class Outer3 {

	static int data = 10;

	static int LocalClass()

	{

	class Inner

	{

	int data = 20;

	int getData()

	{

	return data;

	}

	};

	Inner inner = new Inner();

	return inner.getData();

	}

	public static void main(String[] args)

	{

	System.out.println(data * LocalClass());

	}

	}