package com.fjd.poo;

public class EmpleadoGerente extends Empleado implements Trabajador{
    private String departamentoSupervisado;
    public EmpleadoGerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamentoSupervisado = departamento;
    }

    @Override
    public String obtenerInformacion() {
        String informacionEmpleado = super.obtenerInformacion();
        return informacionEmpleado + "\n" + obtenerDetalles();
    }

    @Override
    protected String obtenerDetalles() {
        return "Departamento supervisado: " + departamentoSupervisado;
    }
}
