class superclass {

  public superclass(int data,int number) {
    System.out.println("Inside Superclass Constructer!!!");
  }
}

class index extends superclass {

  public index() {
    super(10,0);
    System.out.println("Inside subclass Constructer!!!");
  }

  public static void main(String as[]) {
  }
}
