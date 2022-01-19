/* Authors: Dimitar Ivanov and Hector Hernandez 
   Project: PartyGuests
   Date: 11/30/18
*/

//Dimitar
public class DrinkChoice {
	//Fields, name and drink
	public String name;
	public String drink;
	
	//Constructors, name and drink
	public DrinkChoice(String name, String drink){
		this.name = name;
		this.drink = drink;
	}
	
	//toString Method, this shows what type of drink the person is bringing
	public String toString(){
		String drinkResult = String.format("%s is bringing %s%n", this.name, this.drink);
      return drinkResult;
	}
}
