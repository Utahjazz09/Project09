/* Authors: Dimitar Ivanov and Hector Hernandez 
   Project: PartyGuests
   Date: 11/30/18
*/
//Hector
public class FoodChoice {
	//Fields, name and food
	public String name;
	public String food;
	
	//Constructors, name and food
	public FoodChoice(String name, String food){
		this.name = name;
		this.food = food;
	}
	
	//toString Method
   // This shows what type of food the person is bringing
	public String toString(){
		String foodResult = String.format("%s is bringing %s", this.name, this.food);
		return foodResult;
	}

}
