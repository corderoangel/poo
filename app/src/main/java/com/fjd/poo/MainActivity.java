package com.fjd.poo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Empleado empleado = new Empleado("Ángel Cordero", 23, 2000000);
        EmpleadoGerente empleadoGerente = new EmpleadoGerente("Ángel Cordero", 23, 2000000, "Cauca");
        EmpleadoDesarrollador empleadoDesarrollador = new EmpleadoDesarrollador("Brahim Diaz", 28, 40000, "Java");

        GestorEmpleados gestorEmpleados = new GestorEmpleados();

        gestorEmpleados.calcularYMostrarSalarioAnual(empleado);
        gestorEmpleados.calcularYMostrarSalarioAnual(empleadoGerente);
        gestorEmpleados.calcularYMostrarSalarioAnual(empleadoDesarrollador);

        //TextView infoTextView = findViewById(R.id.infoTextView);
        //infoTextView.setText(empleado2.obtenerInformacion());
    }
}