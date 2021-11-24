package com.example.udemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    mostrarMensajeSaludo("Hola, bienvenido a android!")
    variablesConstantes()
  }

  private fun mostrarMensajeSaludo(mensajeSaludo: CharSequence){
    var textoSaludo = findViewById<TextView>(R.id.main_id_text);
    var botonSaludo = findViewById<Button>(R.id.main_id_button);
    botonSaludo.setOnClickListener{
      textoSaludo.text = if(textoSaludo.text == "Mensaje Fake!") mensajeSaludo else "Mensaje Fake!";
    }
  }

  // Curso de Kotlin para principiantes
  private fun variablesConstantes(){
    var nombrePersona: String = "Jesús Alejandro García";
    var edadPersona: Int = 25;
    println("Mi nombre es $nombrePersona y tengo $edadPersona años");

    val profesionConst = "Ingeniero en Telemática";
    println(profesionConst);
  }
}
