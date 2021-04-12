//this is where we make our objects to play around with

//Using the tree object, cut out 10 tree shapes using the cutOut method (hint: make sure to use the accessor method for the parameter - do not just type in "tree" again)
//Bake the tree object at 350 degrees for 12 minutes
//Decorate the tree object
//Now, make a new Sugar object called aCookie. Use the constructor that does not take any parameters.

class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("tree");
    tree.cutCookies(tree.getCookieShape(), 10);
    tree.bakeCookies(350, 12);
    tree.decorateCookies(tree.getIsBaked());

    Sugar aCookie = new Sugar();
    aCookie.decorateCookies(aCookie.getIsBaked());
  }
}