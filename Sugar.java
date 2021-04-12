class Sugar extends Cookie {
  String cookieShape;
  boolean isDecorated;

  Sugar() {
    cookieShape = "";
    isDecorated = false;
  }

  Sugar(String aCookieShape) {
    cookieShape = aCookieShape;
    isDecorated = false;
  }

  String getCookieShape() {
    return cookieShape;
  }

  void setCookieShape(String aCookieShape) {
    cookieShape = aCookieShape;
  }

  void cutCookies(String aCookieShape, int aCookieCount) {
    System.out.println(aCookieCount + " were cut into " + aCookieShape);
    setCookieCount(aCookieCount);
  }

  void decorateCookies(boolean aIsBaked) {
    if (aIsBaked == true) {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}