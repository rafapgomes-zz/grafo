import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        grafo obj = new grafo();
        int matriz[][] = new int[5][5];
        for(int c=0; c<5;c++)
        {   
            System.out.println("Lendo arestas vertice"+c);
            for(int l=0; l<5;l++)
            {
                matriz[l][c]= leitor.nextInt();
            }
        }
        for(int l=0; l<5;l++)
        {   
            for(int c=0; c<5;c++)
            {
              System.out.print(matriz[l][c]);
            }
            System.out.print("\n");
        }
        // Vetice 1 é viznho de 3?
        System.out.println(obj.checaviznho(0,2,matriz));
        // Viznhos do vertice 2
        obj.vizinhos(1, matriz);

        
        
    }
}
