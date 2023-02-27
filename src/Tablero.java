public class Tablero {
    private Node head;
    private Node tail;

    private int columnasT = 0;
    private int filasT = 1;


    public void addNode(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    public void print(int filas, int columnas) {

        if (head == null) {
            System.out.println("Sin datos");
            return;
        }
        if (filas == 0) {
            return;
        }
        //columnasT = columnas;
        //filasT = filas;
        print(tail, filas, columnas, filasT, columnasT);

    }

    /*//metodo de impresion del tablero
    //el metodo funciona de manera que cada que imprime un numero en una misma fila se resta esa columna de esa fila
    //cuando complete toda la fila le resta 1 a la fila
    private void print(Node current, int filas, int columnas, int columnasT) {
        if (filas == 0) {
            print(filas, columnas);
        } else {
            //comprueba si la fila  es impar
            if (filas % 2 != 0) {
                if (columnas == 0) {
                    if (columnasT == 0) {
                        filas--;
                        columnas = 3;
                        columnasT = 3;
                        System.out.println();
                        print(current.getPrevious(), filas, columnas, columnasT);
                        return;
                    }
                    //recursividad aparte usada para la ultima fila
                    if (filas == 1) {
                        System.out.print("[" + current.getNum() + "] ");
                        columnasT--;
                        print(current.getNext(), filas, columnas, columnasT);
                        return;
                    }
                    //recursivo para tomar el numero por el que deberia empezar la fila en caso de que sea impar
                    System.out.print("[" + current.getNext().getNum() + "] ");
                    columnasT--;
                    print(current.getNext(), filas, columnas, columnasT);
                    return;
                }
                columnas--;
                print(current.getPrevious(), filas, columnas, columnasT);
            } else {
                //recursivo si la fila es par
                if (columnas == 1) {
                    if (columnasT == 0) {
                        filas--;
                        columnas = 3;
                        columnasT = 3;
                        System.out.println();
                        print(current.getNext(), filas, columnas, columnasT);
                        return;
                    }
                    System.out.print("[" + current.getNum() + "] ");
                    columnasT--;
                    print(current.getPrevious(), filas, columnas, columnasT);
                    return;
                }
                columnas--;
                print(current.getPrevious(), filas, columnas, columnasT);

            }
        }
    }*/

    private void print(Node current, int filas, int columnas, int filasT, int columnasT) {
        if(current==null){
            return;
        }else{
            if(filasT<=filas){
                if(filasT%2!=0){
                    System.out.println("hola");
                }else{
                    if(columnasT<columnas){
                        System.out.print("["+current.getNum()+"] ");
                        columnasT++;
                        if(columnasT==columnas){
                            filasT++;
                            System.out.println();
                            columnasT=0;
                        }
                        print(current.getPrevious(), filas, columnas, filasT, columnasT);
                    }
                }
            }
        }
    }
}



