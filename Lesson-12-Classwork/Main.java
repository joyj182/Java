class Main {
  // functions

  boolean collegeCredit(String courseCode){
    if(courseCode.substring(0,7).equal("M") || courseCode.substring(0,7).equal("E")){
      return true;
    }else{
      return false;
    }
  }

  String getCounsoler(String class){
    if (class.substring(0).equal("B") || class.substring(4).equal("B")){
      return "Berrouet";
    }
    else if(class.substring(0).equal("C") || class.substring(4).equal("C")){
      return "Chu";
    }
    else if(class.substring(0).equal("D") || class.substring(4).equal("D")){
      return "Dinn";
    }
    else if(class.substring(0).equal("E") || class.substring(4).equal("E")){
      return "Eyzengart";
    }
    else if(class.substring(0).equal("F") || class.substring(4).equal("F")){
      return "Flores";
    }
    else if(class.substring(0).equal("G") || class.substring(4).equal("G")){
      return "Gibson";
    }
    else if(class.substring(0).equal("L") || class.substring(4).equal("L")){
      return "Shim Lee";
    }
    else if(class.substring(0).equal("M") || class.substring(4).equal("M")){
      return "Meltzer";
    }
    else if(class.substring(0).equal("P") || class.substring(4).equal("P")){
      return "Paccione";
    }
    else if(class.substring(0).equal("S") || class.substring(4).equal("S")){
      return "Fiore";
    }
    else if(class.substring(0).equal("T") || class.substring(4).equal("T")){
      return "Tsai";
    }
    else if(class.substring(0).equal("Z") || class.substring(4).equal("Z")){
      return "Zayes";
    }
    else{
      return "None";
    }
  }

  String imageType(String fileName){
    
  }


  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }

 
}