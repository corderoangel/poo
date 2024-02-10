package com.fjd.poo;

public class Empleado implements Trabajador{
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double calcularSalarioAnual(){
        return salario * 12;
    }

    public String obtenerInformacion(){
        return "Nombre: " + nombre + "\nEdad: " + edad +
                "\nsalario mensual: " + salario + "\nsalario anual: "
                + calcularSalarioAnual();
    }

    protected String obtenerDetalles(){
        return "Detalles adicionales";
    }
}
