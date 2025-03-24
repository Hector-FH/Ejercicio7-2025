package org.sanchez.muciño.emmanuel.figura;

import org.sanchez.vista.SolicitaDatos;

import java.io.*;
import java.util.*;

public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos {

    public Figura() {
    }

    public abstract double area();

    public abstract double perimetro();
}