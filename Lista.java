package ListasCarrera;

public class Lista { //Variables, constructor y metodos
    private Nodo inicio;    //Siempre apunta al primer elemento
    private Nodo fin;       //Apunta a la cola

    public Lista(){
        inicio= null;
        fin = null;
    }
    
    public void setInicio(Nodo variable){
        inicio = variable;
    }

    public Nodo getInicio(){
        return inicio;
    }

    public boolean vacia(){ //Sino tiene elementos, regresa true, porque estaria vacia
        if (inicio == null)
            return true;
        else
            return false;
    }

    //Registrar corredor al final de la lista con los datos
    public void agregar(String nombre, String empresa, int numeroFin){
        Nodo nuevo = new Nodo(nombre, empresa, numeroFin);
        nuevo.setNext(null); //Si lo omite, java pone el null
        nuevo.setBack(null);
        //Aqui el nuevo corredor es el primero y ultimo a la vez por ser primero
        if (vacia()){
            inicio = nuevo;
            fin = nuevo;
        //Aqui se enlazan usando el fin, sin recorrer la lista ya que solo hay un metodo de agregar
        } else {
            //Set next apunta a fin la cual iria hacia delante
            fin.setNext(nuevo);
            //Fin aqui sigue siendo el pasada pero se enlaza a fin = nuevo para que apunte al siguiente
            nuevo.setBack(fin);
            fin = nuevo;
        }
        

    }
    //En el codigo dejo de existir new nodo porque el constructor en nodo solicita los 3 datos
    public void mostrar(){
        if(vacia()){
            System.out.println("\nNo hay elementos");
        }else{
            Nodo i = inicio;
            // Posicion de ID
            int posicion = 1;
            while(i!=null){
                System.out.println("========= Corredor n. " + posicion + " =========");
                System.out.println("Nombre: "+ i.getNombre() + "\nEmpresa: " + i.getEmpresa() + "\nNumero de corredor: " + i.getNumeroFin());
                posicion++;
                i = i.getNext();
            }
        }
    }
    
    public void limpiar() {
        inicio = fin = null;
    }   
}
