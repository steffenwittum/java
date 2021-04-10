/** 
  Implementation Collatz Problem
*/
public class Collatz{
  public static void main(String[] argv){
    int y,x,z;
//		interaktive variante ... useless for massdata
//    y=Integer.parseInt(System.console().readLine("Geben Sie ein Integer ein:"));
    if(argv.length != 1){
      System.out.println("Collatz: Usage: Collatz <pos.Int.>\n  Ex.: Collatz 17\n");
      System.exit(127);
    }
    y=Integer.parseInt(argv[0]);
    x=y;
    z=0;
    while(x!=1){

      System.out.println("Zwischenwert: " + x);

      if(x%2==0){
        x=x/2;
      } else {
        x=3*x+1;
      }
      z=z+1; // z+=1 z++
}
    System.out.println("Anzahl der Iterationen für "+y+" ist "+z);
  }
}
