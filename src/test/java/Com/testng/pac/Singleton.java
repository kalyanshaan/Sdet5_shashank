package Com.testng.pac;

public class Singleton {
	
	 private static Singleton single_instance = null;
	 
	    // Declaring a variable of type String
	    public String s;
	 
	    // Constructor
	    // Here we will be creating private constructor
	    // restricted to this class itself
	    private Singleton()
	    {
	        s = "Hello I am  Singleton private class";
	    }
	 
	    // Static method
	    // Static method to create instance of Singleton class
	    public static Singleton getInstance()
	    {
	        if (single_instance == null)
	            single_instance = new Singleton();
	 
	        return single_instance;
	    }
	}

	


