package com.fjd.poo;

public class EmpleadoDesarrollador extends Empleado implements Trabajador{
    private String lenguajePrincipal;

    public EmpleadoDesarrollador(String nombre, int edad, double salario, String lenguajePrincipal) {
        super(nombre, edad, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    protected String obtenerDetalles() {
        return "Lenguaje principal: " + lenguajePrincipal;
    }
}
