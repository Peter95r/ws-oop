class Cwiczenie{

 public static void main(String[] args){

  int i = 20;
  short s= 16;
  long l=64;
  byte bte = 8;
  boolean b = false;

  char c= 'z';
  String string= "Helo world";
  
  float f = 32;
  double d = 62.14;

  System.out.println((int) c);

  int newInt =  i^2;
  i = ++i * s;

  double newDouble = d/ 2.5;

  int newI = i / 5;

  int modulo = 10%4;

  System.out.println("Modulo answer " +modulo);
  

  //cwiczenie nr 3

  if((int) c > 100){
    System.out.print("True");
   }
  else{
    System.out.println("Not true");
   }


  //cwiczenie 4

  Scanner in = new Scanner(System.in);

 }
}