
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("Enter x:");
    double x = Input.readDouble();
    double y = Math.pow(x , 7);
    System.out.println("Y =" +y);
/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("Enter z");
    double z = Input.readDouble();
    double q = (Math.pow(z, 3)) + 5;
    System.out.println("Q =" +q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println("Enter T");
    double t = Input.readDouble();
    System.out.println("Enter R");
    double r = Input.readDouble();
    double s = Math.pow(t, 5)*(Math.pow(r + 2, 4));
    System.out.println("S = " + s);
 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println("Enter A");
    double a = Input.readDouble();
    System.out.println("Enter B");
    double b = Input.readDouble();

    double c = Math.sqrt(a + b);
    System.out.println(c);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    System.out.println("Enter x1");
    double x1 = Input.readDouble();
    System.out.println("Enter x2");
    double x2 = Input.readDouble();
    System.out.println("Enter y1");
    double y1 = Input.readDouble();
    System.out.println("Enter y2");
    double y2 = Input.readDouble();

    double d = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println("D =" +d);



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/





/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}