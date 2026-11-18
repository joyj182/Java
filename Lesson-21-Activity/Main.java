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

  void addTwoNumbers(){
    int num1 = randInt(0 , 10);
    int num2 = randInt(0,10);
    int sum = num1 + num2;
    print("Find the sum of these two numbers: " + num1 +" and " + num2);
    int ans = Input.readInt();
    while(!(sum == ans) ){
      print("Wrong");
      int guess = Input.readInt();
    }
   }

  int gcf(int num1 , int num2){
    int 
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