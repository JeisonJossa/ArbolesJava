package arboles;

import javax.swing.JOptionPane;

public class arbolBinario {

    nodoArbol raiz;
    String cadena;

    public arbolBinario() {
        raiz = null;
        cadena = "";
    }

    public void agregarNodo(int d, String nom) {
        nodoArbol nuevo = new nodoArbol(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            nodoArbol auxiliar = raiz;
            nodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.nodoIzq;
                    if (auxiliar == null) {
                        padre.nodoIzq = nuevo;
                        return;
                    }

                } else {
                    auxiliar = auxiliar.nodoDer;
                    if (auxiliar == null) {
                        padre.nodoDer = nuevo;
                        return;

                    }
                }

            }

        }
    }

    //metodo para saber si esta vacio
    public boolean estaVacio() {
        return raiz == null;
    }

    // recorrido inorden
    public void inOrden(nodoArbol r) {
        if (r != null) {
            inOrden(r.nodoIzq);
            //this.cadena = this.cadena + r.dato + " " + r.nombre + "\n";
           JOptionPane.showMessageDialog(null,r.dato+r.nombre);
            inOrden(r.nodoDer);
        }
        //JOptionPane.showMessageDialog(null, this.cadena);
    }
    
    // buscar
    
    public nodoArbol Search(int d)
    {
    nodoArbol aux=raiz;
    while(aux.dato!=d)
    {
    if(d<aux.dato)
    {
    aux=aux.nodoIzq;
    }
    else{
    aux=aux.nodoDer;
    }
    if(aux==null)
    {
    return null;
    }
    
    }
    return aux;
    }
}
