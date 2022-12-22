
package arboles;


public class nodoArbol {
    int dato;
    String nombre;
    nodoArbol nodoIzq,nodoDer;
    
    public nodoArbol(int d, String nom)
    {
        this.dato=d;
        this.nombre=nom;
        this.nodoDer=null;
        this.nodoIzq=null;
    }
  
    public String toString()
    {return nombre+"su nombre es "+dato;
    }
    
}
