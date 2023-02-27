import java.util.Scanner;
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        System.out.println("1. Jugar, 2. Salir");
        int option = sc.nextInt();
        if(option == 1){
            System.out.println("nombre");
            String name = sc.nextLine();
            System.out.println("Por favor ingrese la cantidad de filas que desea para el tablero");
            int filas = sc.nextInt();
            System.out.println("Por favor ingrese la cantidad de columnas para el tablero");
            int columnas = sc.nextInt();
            //añadir nodo de tablero
            int medidas = columnas*filas;
            for (int i = 0; i < medidas; i++){
                tablero.addNode(new Node(String.valueOf(i + 1)));

            }
            tablero.print(filas, columnas);
        }

    }


}