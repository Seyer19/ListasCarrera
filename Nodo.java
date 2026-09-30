package ListasCarrera;

public class Nodo {
   
    //Variables utilizadas para la clase corredor y poder conectar nodos
    private String nombre;
    private int numeroFin;
    private String empresa;

    private Nodo next;
    private Nodo back;

    public Nodo(String nombre, String empresa, int numeroFin) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.numeroFin = numeroFin;
    }

    //Obtencion del dato dentro de nombre
    public  String getNombre(){
        return nombre;
    }

    //Obtencion del dato dentro del numero que quedaron
    public int getNumeroFin(){
        return numeroFin;
    }

    //Obtencion del dato dentro de la empresa
    public  String getEmpresa(){
        return empresa;
    }

    //Poder mover apuntador al siguiente nodo
    public void setNext(Nodo variable){
        next = variable;
    }

    //Conseguir cual es el siguiente nodo a entrar
    public Nodo getNext(){
        return next;
    }

    //Poder colocar cuantos nodos para atras
    public  void setBack(Nodo variable){
        back = variable;
    }

    //Poder reconocer a que nodo retroceder
    public Nodo getBack(){
        return back;
    }
}
