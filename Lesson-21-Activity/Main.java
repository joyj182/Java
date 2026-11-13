class Main {

  void allowance(){
    double m = 1;
    int day = 0;
    while(!(m>=500) ){
      m = 2*m;
      day ++;
    }
    System.out.println("Day:" + day);
  }

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    allowance();
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}