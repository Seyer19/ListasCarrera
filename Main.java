package ListasCarrera;
/*
Participantes en una carrera de 10 km de recorrido: nombre,
empresa que representan, búsqueda por nombre, búsqueda por empresa.
Al terminar la carrera registran el lugar en el que quedo. Búsqueda por lugares,
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Trabajo en equipo Lista Corredores \n");

        // PRUEBA TEMPORAL de agregar() y mostrar()
        Lista carrera = new Lista();
        carrera.agregar("Arath",  "Bimbo" , 2);
        carrera.agregar("Pablo",  "Cemex" , 1);
        carrera.agregar("Thiago",  "Pemex" ,  3);
        carrera.mostrar();
        // FIN DE LA PRUEBA
        //Borrar la prueba y los /* */ para que crees el menu pablo
        

        /*
        Scanner leer = new Scanner(System.in);
        int opc = 0;

        do {
            menu();
            System.out.println("Elige Opcion");
            opc = Integer.parseInt(leer.nextLine());

            switch (opc) {
                case 1:

                    break;
            }

        } while (opc != 7);

        leer.close();
        */
    }

    public static void menu() {
        System.out.println("Listas de Corredores\n");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar elementos");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Buscar por empresa");
        System.out.println("5. Buscar por numero que quedo");
        System.out.println("6. Borrar");
        System.out.println("7. Salir");
    }
}