class Cookie {
  //four instance variables with proper control
  int cookieCount;
  int bakeTemp;
  int bakeTime;
  boolean isBaked;

  //constructor set to 0 or false
  Cookie() {
    cookieCount = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isBaked = false;
  }

  //constructor sets first three to a parameter and cookies not yet baked
  Cookie(int aCookieCount, int aBakeTemp, int aBakeTime) {
    cookieCount = aCookieCount;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isBaked = false;
  }

  //accessor method
  boolean getIsBaked() {
    return isBaked;
  }

  //mutator method
  void setCookieCount(int aCookieCount) {
    cookieCount = aCookieCount;
  }

  //method to "Bake" the cookies
  void bakeCookies(int aBakeTemp, int aBakeTime) {
    System.out.println(cookieCount + " cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    //set cookies baked to tue
    isBaked = true;
  }
}