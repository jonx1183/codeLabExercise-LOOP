package To;

import java.util.Scanner;

public class ExTo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //a.

//Hver gang det ydre loop køres så looper det indre loop igennem indtil dens krav er opfyldt.
// Den vil derefter køre det ydre loop igen og fortsætte indtil dens krav er opfyldt.

    for (int i = 0; i <= 4; i++){

      for (int test = 0; test < i; test++ ){
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
