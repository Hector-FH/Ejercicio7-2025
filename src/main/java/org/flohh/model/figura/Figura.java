package org.flohh.model.figura;

import org.flohh.vista.SolicitaDatos;

public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos {

    public Figura() {
    }

    public abstract double area();

    public abstract double perimetro();
}