
class Main {

	double gpa(double GPA){
		if(GPA > 90){
			return GPA * 1.1;
		}
		else{
			return GPA;
		}
	}

	boolean isGraduating(double grade, double credits){
		if(grade == 12 && credits >= 44){
			return true;
		}else{
			return false;
		}
	}

	String BMI( double weight, double height){
		double bmi = weight/Math.pow(height, 2);
		if(bmi <= 18.4){
			return "Underweight";
		}
		else if(bmi >= 18.5 && bmi <= 24.9){
			return "Normal";
		}
		else if(bmi >= 25.0 && bmi <= 39.9){
			return "Overweight";
		}
		else{
			return "Obsese";
		}
	
	}

	double shippingCost(double weight){
		if(weight <= 10){
			return 0.00;
		}
		else if( weight <= 15 && weight > 10){
			return 5.00;
		}
		
	}

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){

		double grade = 10;
		double credits = 45;

		if(isGraduating(grade, credits) == true){
			System.out.println("Student is Graduating");
		}else{
			System.out.println("Student is NOT Graduating");
		}

  }

 
  
}