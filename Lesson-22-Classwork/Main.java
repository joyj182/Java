class Main {


  int[] convert(int[] celsius){
    int[] farhen = new int[celsius.length];
    for(x=0; x<=celsius.length-1; x++){
      farhen[x]= celsiusToFarhenheit(celsius[x]);
    
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
  int[] celsius = {26, 14, 26};
    
  }

  

  double celsiusToFarhenheit(double c){
        return (int)(c*9/5+32);
  }
}