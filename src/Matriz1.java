import java.util.Scanner;

public class Matriz1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] m1;
    int x=0,y=0;
    System.out.print("Digite o tamanho da linha da sua matriz : ");
    x =input.nextInt();
    System.out.print("Digite o tamanho da coluna da sua matriz : ");
    y =input.nextInt();
    m1= new int[x][y];
    preencher(m1, input);
    System.out.println("==================================");
    exibir(m1);
  }

  public static void preencher(int[][] m1, Scanner input) {
    System.out.println("PREENCHIMENTO DE DADOS DE MATRIZ");

    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m1[i].length; j++) {
        System.out.print("Digite o valor da matriz na posição [" + i + "][" + j + "]: ");
        m1[i][j]=input.nextInt();
      }
    }

  }

  public static void exibir(int[][] m1) {
    System.out.println("Sua matriz é essa :");
    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m1[i].length; j++) {
        System.out.print(m1[i][j]);

      }
      System.out.println();
    }
  }
}
