import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Producto[][] LlenarMatriz(Producto[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                Producto o = new Producto();

            System.out.println("Ingrese el nombre del producto: ");
            o.setNombre(sc.next());
            System.out.println("Ingrese el peso en kg;");
            o.setPeso(sc.nextDouble());
            System.out.println("Ingrese la categoria(alimentos, aseo, tecnologia);");
            o.setCategoria(sc.next());

            m[i][j] = o; 
            }
        }
        return m;
    }
    
    public void mostrarMatriz(Producto[][] m){
        
        System.out.println("\n--- ESTANTERIA ---");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(m[i][j].getNombre() + "  " +
                                   m[i][j].getPeso() + "Kg" + "  " +
                                   m[i][j].getCategoria());
                System.out.println("-------------------------------------------\n");
            }
            System.out.println();
        }
    }  

    
}
