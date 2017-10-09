/**
 * Created by andrewkim on 10/8/17.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StatePrompter {
  public static void main(String args[]){
    Scanner scannerln = new Scanner(System.in);
    HashMap<String, State> hmap = new HashMap<String, State>();
    String userInput = "";
    ArrayList<State> states = new ArrayList<State>();

    hmap.put("alabama", new State("Alabama", "Yellowhammer", "Camellia"));
    hmap.put("alaska", new State("Alaska", "Willow Ptarmigan", "Forget-me-not"));
    hmap.put("arizona", new State("Arizona", "Cactus Wren", "Saguaro Cactus"));
    hmap.put("arkansas", new State("Arkansas", "Mockingbird", "Apple Blossom"));
    hmap.put("california", new State("California", "California Valley Quail", "Golden Poppy"));
    hmap.put("colorado", new State("Colorado", "Lark Bunting", "Rocky Mountain Columbine"));

    while(!userInput.equals("none")){
      System.out.println("Enter a State or None to Exit:");
      userInput = scannerln.nextLine().toLowerCase().trim();
      if (userInput.equals("none")) {
        break;
      }
      if (hmap.containsKey(userInput)){
        State currentState = hmap.get(userInput);
        System.out.println("Bird: " + currentState.getBird());
        System.out.println("Flower: " + currentState.getFlower());
        states.add(currentState);
      } else {
        System.out.println("State does not exist");
      }
    }

    System.out.println("A summary report for each State, Bird and Flower is: ");
    for (State state : states) {
      System.out.println(state.getSummary());
    }
    System.out.println("Please visit our site again");
  }
}
