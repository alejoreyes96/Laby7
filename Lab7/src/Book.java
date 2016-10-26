
public class Book implements GameThing, Readable {
	  public String getName()

      {

            return "A dusty old book";

      }

      public String getDescription()

      {

            return "This book appears to be old and dusty. It's also quite heavy.";

      }
      public void read()

      {

            System.out.println("It is written in some ancient language. You cannot decipher it yet.");

      }
}
