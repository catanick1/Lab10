//sugar cookie class

//two instance variables, cookie shape and is decorated
class Sugar extends Cookie {
  String cookieShape;
  boolean isDecorated;

//constructor 1, setting text blank and false
  Sugar() {
    cookieShape = "";
    isDecorated = false;
  }

  //second constructor setting parameter and false
  Sugar(String aCookieShape) {
    cookieShape = aCookieShape;
    isDecorated = false;
  }

  //accessor method
  String getCookieShape() {
    return cookieShape;
  }

  //mutator method
  void setCookieShape(String aCookieShape) {
    cookieShape = aCookieShape;
  }

  ////method to cut it out into shapes and #of cookies
  //use tthe superclass's SetCookieCount mutator method to set the number of cookies there are
  void cutCookies(String aCookieShape, int aCookieCount) {
    System.out.println(aCookieCount + " were cut into " + aCookieShape);
    setCookieCount(aCookieCount);
  }

  //method that allows it to decorate cookies, but only if they are baked (if baked is true, decorated is now true)
  void decorateCookies(boolean aIsBaked) {
    if (aIsBaked == true) {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    //if it has not been maked, print ln
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}