/**
 * Created by andrewkim on 10/8/17.
 */
public class State {
  private String name;
  private String bird;
  private String flower;

  public State(String name, String bird, String flower){
    this.name = name;
    this.bird = bird;
    this.flower = flower;
  }

  public String getName(){
    return this.name;
  }

  public String getBird(){
    return this.bird;
  }

  public String getFlower(){
    return this.flower;
  }

  public String getSummary(){
    return this.name + ", " + this.bird + ", " + this.flower;
  }
}

