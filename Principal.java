import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Metodos M = new Metodos();
    int n = 0; // es la dimension de la matriz
    System.out.println("Ingrese la dimension de la matriz:");
    n=sc.nextInt();
    Producto[][] m = new Producto[n][n];
    m = M.LlenarMatriz(m);
    M.mostrarMatriz(m);




    }
}
