package arboles;

import javax.swing.JOptionPane;

public class Arboles {

    public static void main(String[] args) {
        int op = 0, elemento=0;
        String nombre = "";
        arbolBinario arbolito = new arbolBinario();
        do {

            try {

                op = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nodo \n"
                        + " 2. Recorrer el arbol \n3. Buscar \n 4: Salir"));

                switch (op) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero del nodo"));
                        nombre = JOptionPane.showInputDialog("ingrese nombre del nodo");
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio");
                        }
                        break;

                    case 3:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor a buscar"));
                            //arbolito.Search(elemento);
                            if (arbolito.Search(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "dato no encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, "dato encontrado" + arbolito.Search(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio");
                        }

                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "usted ha decidido salir");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion no valida");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "error su dato no es un numero ");
            }

        } while (op != 4);
    }

}
