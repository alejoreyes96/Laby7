
public class Book implements GameThing, Readable, Openable {
	 public boolean isOpen = false;      
	  public String getName()

      {

            return "A dusty old book";

      }

      public String getDescription()

      {

            return "This book appears to be old and its pages filled with dust. It's also quite heavy.";

      }
      public void read()

      {

            System.out.println("It is written in some ancient language. You cannot decipher it yet.");

      }
      public void open() {
    	  if( isOpen == false){
    	  
    	  System.out.print("As the book opens, you can feel a mysterious aura coming from it.");
    	  isOpen = true;
    	  }
    	  else{
    	  System.out.print("The book is already open!");
    	  }
      }
      public void close() {
    	  if( isOpen == true){
        	  System.out.print("As the book closes, a cloud of dust is thrown into the area.");
        	  isOpen = false;
        	  }
        	  else{
        	  System.out.print("The book is already closed!");
        	  }
    	 
    	  
      }
}
