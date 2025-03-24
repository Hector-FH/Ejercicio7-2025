package org.flohh.model.figura;

import org.flohh.util.ReadUtil;
import org.flohh.vista.Menu;

public class Cuadrado extends Figura {

    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void leerDatos() {
        Menu.menuLado();
        lado = ReadUtil.getInstance().leerDouble();
    }
}