import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        int x;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Liczba x : ");
    x = scanner.nextInt();
    for(int i=0;i<x;i++)
      {
        for(int j=0;j<i;j++)
          {
            System.out.print("*");
          }
        System.out.println(" ");
      }
    
    }
}
  
    

          