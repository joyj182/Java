class Main {

	void display(String word){
		System.out.println(word);
	}

	double FtoC(double F){
		return (F-32)/1.8;
	}
	
	double sphereVolume(double r){
		double result = 4.0/3.0 * Math.PI * Math.pow(r,3);
		return result;
	}

	double coneVolume(double r2, double h){
		return Math.PI * Math.pow(r2, 2) * (h/3.0);
	}

	double distance(double x1, double x2, double y1, double y2){
		double result = (x2 - x1)/(y2 - y1);
		return result;
	}

	public static void main(String[] args) {
    	(new Main()).init();
	}


  void init(){
	// 1
	display("Hello");
	// 2
	System.out.println("Enter Fehrenheit:");
 	double F = Input.readDouble();
	System.out.println("Celsius = " + FtoC(F));
	//3
	System.out.println("Enter radius:");
	double r = Input.readDouble();
	System.out.println("Volume of Sphere = " + sphereVolume(r) );
	//4
	System.out.println("Enter radius:");
	double r2 = Input.readDouble();
	System.out.println("Enter height:");
	double h = Input.readDouble();
	System.out.println("Volume of Cone = " + coneVolume(r2, h) );
	//5
	System.out.println("Enter x1:");
	double x1 = Input.readDouble();
	System.out.println("Enter x2:");
	double x2 = Input.readDouble();
	System.out.println("Enter y1:");
	double y1 = Input.readDouble();
	System.out.println("Enter y2:");
	double y2 = Input.readDouble();

	System.out.println("The distance is " + distance(x1, x2, y1, y2));


  }

  
 
}