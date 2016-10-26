
public class Apple implements GameThing, Edible {

    
	  public String getName(){

            return "An opaque blood-red apple";
      }

      public String getDescription(){
    	  
            return"It is told that if you gaze long enough into a blood-red apple, you can hear a heart pumping blood.";
      }
      public void eat(){
    	  
    	  System.out.println("As you eat the apple, you can taste and feel the rich and thick flavors going through your mouth and into your very core.");
    	  AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
    	  }
     
}
