package org.flohh.model.figura3;

import org.flohh.model.figura.Figura;
import org.flohh.util.ReadUtil;
import org.flohh.vista.Menu;

public class Circulo extends Figura {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    @Override
    public double area() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double perimetro() {
        return (2 * radio) * Math.PI;
    }

    @Override
    public void leerDatos() {
        Menu.menuRadio();
        radio = ReadUtil.getInstance().leerDouble();
    }
}
