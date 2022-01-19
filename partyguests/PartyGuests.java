/* Authors: Dimitar Ivanov and Hector Hernandez 
   Project: PartyGuests
   Date: 11/30/18
*/
/*
My name is Dimitar and this is my party guest Project that I did for my CSIS 1400 class with my teammate Hector, this is a project about going to a party. It
prompt you how many guests are attending this party, what they are going to bring to this party as well as remove guests from the party or add more guests to it as 
well.
*/
import java.util.*;
public class PartyGuests {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
         
   //Prompt user for amount of guests
      //Hector
      System.out.print("How many guests are attending? ");
      int numberOfGuests = input.nextInt();
      ArrayList<String> guestList = new ArrayList<>();//Array for storing names
      input.nextLine();
       
   //Prompt user for names of guests and prints the list   
      //Hector
      System.out.println("Please enter the names of " + numberOfGuests + " guests: ");
      for(int i = 1; i <= numberOfGuests; i++)
      {
         System.out.printf("Guest %d: ", i);
         guestList.add(input.nextLine());
      }
      System.out.println("\nGuest list: " + guestList);
         
   //Allows user to remove guests from previous lists if needed and then prints list alphabetically
      String Nope; //Name of the person to remove
      String Yup; //Name of the person to add
      int Answer; //Whether or not the user wants to remove or add additional names 
      do{
        // Dimitar
         System.out.print("\nShould anyone be removed or added? (0 for no, 1 for remove, 2 for add)");
         Answer = input.nextInt();
         input.nextLine();
         if(Answer == 1){
         //Dimitar
            System.out.print("Who would you like to remove?");//Removes a person from the list
            Nope = input.nextLine();
            guestList.remove(Nope);
            Collections.sort(guestList);
         }
         if(Answer == 2)
         //Dimitar
         {
            System.out.print("Who would you like to add?");//Adds a person to the list
            Yup = input.nextLine();
            guestList.add(Yup);
            Collections.sort(guestList);
         }
      }while(Answer != 0); //Hector
      Collections.sort(guestList);
      System.out.println("\nCurrent List (Alphabetical): " + guestList);
      System.out.println("");//Space
         
   //Allows user to choose the drinks that guests bring
      //Hector
      String[] drinkOptions = {
         	"Crown Royal", "Henny", "Absolute Vodka", "Champangne", "Corona", "Tequila"};
     				
      int pdchoice;//The number that corresponds to the index of the guestList array
      int drinkchoice;//The number that corresponds to the index of the drinkGuestList array
         
      ArrayList<String> drinkGuestList = new ArrayList<>();//Array for storing drinks that guests will bring
           
            do{
        //Dimitar Hector
         // This shows you what drink a person is bringins
         System.out.printf("Who should bring a drink? (0 - %d(Corresponds to position in list) or -1 to quit)", guestList.size() - 1);
         pdchoice = input.nextInt();
         System.out.println("");
        //This chooses the person you selected
         if(pdchoice != -1){
            System.out.printf("You chose %s", guestList.get(pdchoice));
            System.out.println("");//Space
            System.out.printf("What drink should %s bring?(0 - %d)\n", guestList.get(pdchoice), drinkOptions.length - 1); 
            System.out.println(Arrays.toString(drinkOptions));
            drinkchoice = input.nextInt();
            System.out.printf(drinkOptions[drinkchoice]);
            System.out.println("");//Space
            DrinkChoice currentDrinkChoice = new DrinkChoice(guestList.get(pdchoice), drinkOptions[drinkchoice]);
            drinkGuestList.add(currentDrinkChoice.toString());
            System.out.println("");//Space
           //Prints the guest and replaces the brackets
            System.out.print(drinkGuestList.toString().replace("[","").replace("]","").replace(",","")); 
           System.out.println("");//Space
          
         }
        
      }while(pdchoice != -1);
         
   //Allows user to choose the food that guests bring
      String[] foodOptions = {
         	  "Chips", "Dips", "Burgers", "Hot Dogs", "Tacos"};
         
      int pfchoice;
      int foodchoice;
      // Hector Dimitar
      ArrayList<String> foodGuestList = new ArrayList<>();//Array for storing food that guests will bring
      do{
         System.out.printf("Who should bring food? (0 - %d(Corresponds to position in list) or -1 to quit)", guestList.size() - 1);
         pfchoice = input.nextInt();
         System.out.println("");
         if(pfchoice != -1){
            System.out.printf("You chose %s", guestList.get(pfchoice));
            System.out.println("");//Space
            System.out.printf("What drink should %s bring?(0 - %d)\n", guestList.get(pfchoice), foodOptions.length - 1); // this pulls up the prompt what drink you want someone to get
            System.out.println(Arrays.toString(foodOptions));
            foodchoice = input.nextInt();
            System.out.printf(foodOptions[foodchoice]);
            System.out.println("");//Space
            FoodChoice currentFoodChoice = new FoodChoice(guestList.get(pfchoice), foodOptions[foodchoice]);
            foodGuestList.add(currentFoodChoice.toString());
            System.out.println("");//Space
            //Prints the guest and replaces the brackets 
            System.out.print(foodGuestList.toString().replace("[","").replace("]","").replace(",",""));
            System.out.println("");//Space
         }
           
      }
      //Dimitar
      while(pfchoice != -1);
      System.out.println("Guests that are coming: " + guestList);//Prints the lists of guests
      System.out.println(drinkGuestList);//Prints what drinks they are bringing 
      System.out.println(foodGuestList);//Prints what food they are bringing
      input.close();
   }
}
