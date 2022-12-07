import java.util.Scanner;
import java.util.SortedMap;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m2[][] = new int[6][3];
        
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

}
