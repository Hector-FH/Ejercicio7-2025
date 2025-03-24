package org.flohh.inicio;

import org.flohh.util.ReadUtil;
import org.flohh.vista.Consola;
import org.flohh.vista.Ejecutable;
import org.flohh.vista.Menu;
import org.flohh.vista.Ventana;

public class Inicio {

    public Inicio() {
    }

    public static void main(String[] args) {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;

        System.out.println("Hola Hector 2");
        while (flag) {
            ejecutable = null;
            Menu.principal2();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    ejecutable = Consola.getInstance();
                    break;
                case 2:
                    ejecutable = Ventana.getInstance();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (ejecutable != null) {
                ejecutable.run();
            }
        }
    }
}