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