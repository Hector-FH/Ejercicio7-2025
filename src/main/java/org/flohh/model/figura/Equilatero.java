package org.flohh.model.figura;

import org.flohh.util.ReadUtil;
import org.flohh.vista.Menu;

public class Equilatero extends Triangulo {
    protected double lado1;

    public Equilatero() {
    }

    public void setLado(double lado1) {
        this.lado1 = lado1;
    }

    public double perimetro() {
        return lado1 * 3;
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
        Menu.menuLado1();
        lado1 = ReadUtil.getInstance().leerDouble();
    }
}