import cs1.Keyboard;

//You are traveling to King's Island for the day.
//Everyone in the group has agreed to split the cost evenly.
//Write a program to determine the total cost of the trip and the cost per person.
//Assume that each ticket is $32.99


public class KingsIsland
{
	public static void main(String[] args)
	{
		int people;
		double parking;
		double food;
		double total;
		double total2;
		double cost;
		double tickets;



		//Prompt for and read in the number of people in the group
		System.out.print("enter the number of people in the group ");
		people = Keyboard.readInt();



		//Prompt for and read in the cost of parking
		System.out.print("enter the cost for parking ");
		parking = Keyboard.readDouble();


		//Prompt for and read in the amount spent on food
		System.out.print("enter the amount of money spent on food ");
		food = Keyboard.readDouble();


		//Calculate the total expenses
		total = parking + food;
		tickets = people * 32.99;
		total2 = tickets + total;




		//Calculate the average per person
		cost = total2 / people;

		//Display results
		System.out.println("KingsIsland Report ");
		System.out.println("The Total Cost is $"+total2);
		System.out.println("The Total Cost per person is $"+cost);


	}
}