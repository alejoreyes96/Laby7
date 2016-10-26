public class Sign implements GameThing, Readable, Edible

{

      public String getName()

      {

            return "A chocolate-made sign";

      }

      public String getDescription()

      {

                return "This is a small chocolate-made sign. There seems to be some partially faded writing in it.";

      }

      public void read()

      {

            System.out.println("You can see the following message: \"NO TRESPASSING! EVIL WITCH AHEAD!\"");

      }
      public void eat(){
    	  
    	  System.out.println("The chocolate sign tasted so delicious and creamy! \n Was the sign read though?....");
    	  AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
      }

}