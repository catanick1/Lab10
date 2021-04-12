class Cookie {
  int cookieCount;
  int bakeTemp;
  int bakeTime;
  boolean isBaked;

  Cookie() {
    cookieCount = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isBaked = false;
  }

  Cookie(int aCookieCount, int aBakeTemp, int aBakeTime) {
    cookieCount = aCookieCount;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isBaked = false;
  }

  boolean getIsBaked() {
    return isBaked;
  }

  void setCookieCount(int aCookieCount) {
    cookieCount = aCookieCount;
  }

  void bakeCookies(int aBakeTemp, int aBakeTime) {
    System.out.println(cookieCount + " cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isBaked = true;
  }
}