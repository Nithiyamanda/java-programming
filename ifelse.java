class Main {
  public static void main(String[] args) {
    int source,destination,distance;
    source = 1;
    destination = 10;
    distance = destination-source;
    System.out.println("total distance is :"+ distance);
    int d=4;
    if(d==1)
    {
      System.out.println("you have selected auto");
      int amount = distance*10;
      System.out.println("total amount is :"+ amount);
    }
    else if(d==2)
    {
        System.out.println("you have selected mini");
      int amount = distance*20;
      System.out.println("total amount is :"+ amount);
    }
    else if(d==3)
    {
        System.out.println("you have selected micro");
      int amount = distance*30;
      System.out.println("total amount is :"+ amount);
    }
    else if(d==4)
    {
        System.out.println("you have selected pre");
      int amount = distance*40;
      System.out.println("total amount is :"+ amount);
    }
    else if(d==5)
    {
      System.out.println("oops!:");
    }

  }
}

    
