class Main {

  String creditCardType(String cardNumber){
    if(cardNumber.substring(0,1).equal("4")){
      return "Visa";
    }
    else if(cardNumber.substring(0,3).equal("34") || cardNumber.substring(0,3).equal("37")){
      return "American Express";
    }
    else if(cardNumber.substring(0,3).equal("36")){
      return "Diner Club";
    }
    else if(cardNumber.substring(0,3).equal("51") || cardNumber.substring(0,3).equal("55")){
      return "Master Club";
    }
    else if(cardNumber.substring(0,5).equal("6011") || cardNumber.substring(0,3).equal("65")){
      return "Discorvery";
    }
    else{
      return "None";
    }  
  }

  String pigLatin(String word){
    String l1 = word.substring(0,1);
    String l2 = word.length();
    return l2 + l1 + "ay";
  }

  String nycLocate(String zip){
    if(zip.substring(0,4).equal("100") || zip.substring(0,4).equal("101") || zip.substring(0,4).equal("102")){
      return "Manhattan";
    }
    else if(zip.substring(0,4).equal("103")){
      return "Staten Island";
    }
    else if(zip.substring(0,4).equal("104") ){
      return "Bronx";
    }
    else if (zip.substring(0,4).equal("112")){
      return "Brooklyn";
    }
    else if(zip.substring(0,4).equal("113") || zip.substring(0,4).equal("114") || zip.substring(0,4).equal("111") ){
      return "Queens":
    }
    else{
      return "None";
    }
  }

  String getMonth(String date){
    if(date.substring(0,3).equalTo("01")){
      return "January";
    }
    else if(date.substring(0,3).equalTo("02")){
      return "Febuary";
    }
    else if (date.substring(0,3).equalTo("03")){
      return "March";
    }
    else if (date.substring(0,3).equalTo("04")){
      return "April";
    }
    else if (date.substring(0,3).equalTo("05")){
      return "May";
    }
    else if (date.substring(0,3).equalTo("06")){
      return "June";
    }
    else if (date.substring(0,3).equalTo("07")){
      return "July";
    }
    else if (date.substring(0,3).equalTo("08")){
      return "August";
    }
    else if (date.substring(0,3).equalTo("09")){
      return "September";
    }
    else if (date.substring(0,3).equalTo("10")){
      return "October";
    }
    else if (date.substring(0,3).equalTo("11")){
      return "November";
    }
    else if (date.substring(0,3).equalTo("12")){
      return "December";
    }
    else{
      return "None";
    }
  }

  boolean validatePswd(String password){
    if(password.length() >= 5 && password.length() <= 8){
      return true;
    }
    
  }





  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  
  
}