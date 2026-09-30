package ListasCarrera;

public class Buscador {
    
    private Lista lista;
    
    public Buscador(Lista lista) {
            this.lista = lista;
    }    
    
    public void buscar_Por_Nombre(String NombreCompetizione) {
                
        boolean esta = false;
        
        if (lista.vacia()) {
            System.out.println("\nNo se encontro competidores");
        } else {
            Nodo i = lista.getInicio();
            while (i != null && !esta) {
                if (NombreCompetizione.equals(i.getNombre())) {
                    esta = true;
                } else {
                    i = i.getNext();
                }
                
            }
        }
        
        if (esta) {
            System.out.println("\n" + NombreCompetizione + " fue encontrado!");
        } else {
            System.out.println("\n" + NombreCompetizione + " no está en la lista...");
        }
    }
    
    public void buscar_Por_Empresa(String NombreEmpresa) {
        boolean esta = false;
        
        if (lista.vacia()) {
            System.out.println("\nNo hay competidores disponibles.");
        } else {
            Nodo i = lista.getInicio();
            while (i != null && !esta) {
                if (NombreEmpresa.equals(i.getEmpresa())) {
                    esta = true;
                } else {
                    i = i.getNext();
                }
                
            }
        }
        
        if (esta) {
            System.out.println("\nEl competidor de la empresa " + NombreEmpresa + " fue encontrado!");            
        } else {
            System.out.println("\nEl competidor de la empresa " + NombreEmpresa + " no está en la lista...");
        }
    }
    
    public void buscar_por_Lugar(int lugar) {
        boolean esta = false;
        
        if (lista.vacia()) {
            System.out.println("\nNo hay competidores disponibles.");
        } else {
            Nodo i = lista.getInicio();
            while (i != null && !esta) {
                if (lugar == i.getNumeroFin()) {
                    esta = true;
                } else {
                    i = i.getNext();
                }
                
            }
        }
        
        if (esta) {
            System.out.println("\nEl competidor en el lugar n. " + lugar + " fue encontrado!");
        } else {
            System.out.println("\nEl competidor en el lugar n. " + lugar + " no está en la lista...");
        }
    }
}

