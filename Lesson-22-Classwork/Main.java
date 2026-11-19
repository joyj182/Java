class Main {


  double[] convert(double[] celsius){
    double[] farhen = new double[celsius.length];
    for(int x=0; x<=celsius.length-1; x++){
      farhen[x]= celsiusToFarhenheit(celsius[x]);
      print(farhen[x]);
    }
    return farhen;
  }

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  String[] friends = {}; 
  double[] celsius = {26.3, 14.1, 26.6};
  double[] result = convert(celsius);
    
  }

  

  double celsiusToFarhenheit(double c){
        return (c*9/5.0+32);
  }
}