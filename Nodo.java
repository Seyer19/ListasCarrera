package ListasCarrera;

public class Nodo {
    private String elem;
    private Nodo next;
    private Nodo back;

    //Dentro del nodo el dato que se utilizara
    public void setElem(String variable){
        elem = variable;
    }

    //Obetencion del dato dentro del nodo
    public  String getElem(){
        return elem;
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
