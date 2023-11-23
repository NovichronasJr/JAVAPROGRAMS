import java.util.*;

abstract class Predict
{
	abstract void sides(int a);

}

class Rectangle
{
	void sides()
	{
		System.out.println("no of sides : 4");
	}	
}

class Triangle{
	void sides()
	{
		System.out.println("no of sides : 3");
	}	
}

class Hexagon{

	void sides()
	{
		System.out.println("no of sides : 6");
	}	
}


class Shape
{
	public static void main(String args[])
	{
		Rectangle o1 = new Rectangle();
		Triangle o2 = new Triangle();
		Hexagon o3 = new Hexagon();
		
		o1.sides();
		o2.sides();
		o3.sides();
		
	
	}

}
