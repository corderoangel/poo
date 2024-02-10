package com.fjd.poo;

import android.util.Log;

public class GestorEmpleados {
    public void calcularYMostrarSalarioAnual(Trabajador trabajador){
        double salarioAnual = trabajador.calcularSalarioAnual();
        Log.d("salario", "salario anual: " + salarioAnual);
    }
}
