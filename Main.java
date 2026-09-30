import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String nombre;
        String empresa;
        int numero;
        Scanner leer = new Scanner (System.in);
        Lista grupo = new Lista();
        int opc =0;

        do{
            menu();
            System.out.print("Elige una opcion: ");
            opc = Integer.parseInt(leer.nextLine());
            switch (opc){
                case 1:
                        System.out.println("\nNombre del corredor: ");
                        nombre = leer.nextLine();
                        System.out.println("Nombre de la empresa: ");
                        empresa = leer.nextLine();
                        System.out.println("Lugar que quedo: ");
                        numero = Integer.parseInt(leer.nextLine());
                        grupo.agregar(nombre, empresa, numero);
                    break;
                case 2:
                    System.out.println("Lista de corredores: ");
                    grupo.mostrar();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(opc!=7);
    }

    public static void menu(){
        System.out.println("\nTrabajo en equipo Lista Corredores \n");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar elementos");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Buscar por empresa");
        System.out.println("5. Buscar por numero que quedo");
        System.out.println("6. Borrar");
        System.out.println("7. Salir");
    }
}
