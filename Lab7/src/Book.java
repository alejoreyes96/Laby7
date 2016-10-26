
public class Book implements GameThing, Readable, Openable {
	 public boolean isOpen = false;      
	  public String getName()

      {

            return "A dusty old book";

      }

      public String getDescription()

      {
    	  if(isOpen == true){
            return " This book appears to be old and its pages filled with dust. It's also quite heavy.\n The book is currently open.";
    	  }
    	  else{
    		  return " This book appears to be old and its pages filled with dust. It's also quite heavy.\n The book is currently closed.";
    	  }
      }
      public void read()

      {
    	  if(isOpen == true){
            System.out.println("It is written in some ancient language. I cannot decipher it yet.");
    	  }
    	  else{
    		  System.out.println("I still don't have the skillset to read closed books.");
    	  }
      }
      public void open() {
    	  if( isOpen == false){
    	  
    	  System.out.print("As the book opens, I can feel a mysterious aura coming from it.");
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
