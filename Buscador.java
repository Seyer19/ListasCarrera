package ListasCarrera;

public class Buscador {
    
    private Lista lista;
    
    public Buscador(Lista lista) {
            this.lista = lista;
    }    
    
    public void buscar_Por_Nombre(String NombreCompetizione) {
                
        boolean esta = false;
        
        if (vacia()) {
            System.out.println("No se encontro competidores");
        } else {
            Nodo i = inicio;
            while (i != null && !esta) {
                if (NombreCompetizione.equals(i.getNombre())) {
                    esta = true;
                } else {
                    i = i.getNext();
                }
                
            }
        }
        
        if (esta) {
            System.out.println(NombreCompetizione + " fue encontrado!")
        } else {
            System.out.println(NombreCompetizione + " no está en la lista...");
        }
    }
    
    public void buscar_Por_Empresa(String NombreEmpresa) {
        boolean esta = false;
        
        if (vacia()) {
            System.out.println("No hay competidores disponibles.");
        } else {
            Nodo i = inicio;
            while (i != null && !esta) {
                if (NombreEmpresa.equals(i.getEmpresa())) {
                    esta = true;
                } else {
                    i = i.getNext();
                }
                
            }
        }
        
        if (esta) {
            System.out.println("El competidor de la empresa: " + NombreEmpresa + " fue encontrado!");            
        } else {
            System.out.println("El competidor de la empresa: " + NombreEmpresa + " no está en la lista...");
        }
    }
    
    public void buscar_por_Lugar(int lugar) {
        boolean esta = false;
        
        if (vacia()) {
            System.out.println("No hay competidores disponibles.");
        } else {
            Nodo i = inicio;
            while (i != null && !esta) {
                if (lugar.equals(i.getNumeroFin())) {
                    esta = true;
                } else {
                    i = i.getNext();
                }
                
            }
        }
        
        if (esta) {
            System.out.println("El competidor en el lugar n. " + lugar + " fue encontrado!");
        } else {
            System.out.println("El competidor en el lugar n. " + lugar + " no está en la lista...");
        }
    }
}

