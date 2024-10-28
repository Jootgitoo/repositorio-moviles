package es.jorgehm.calculadora

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.calculadora.databinding.ActivityCalculadoraBasicaBinding

class CalculadoraBasica : AppCompatActivity() {

    private lateinit var binding: ActivityCalculadoraBasicaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculadoraBasicaBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.botonSuma.setOnClickListener() {
            val num1 = binding.escribirNumero1.text.toString().toInt()
            val num2 = binding.escribirNumero2.text.toString().toInt()
            suma(num1, num2)
        }

        binding.btnResta.setOnClickListener(){

            val num1 = binding.escribirNumero1.text.toString().toInt()
            val num2 = binding.escribirNumero2.text.toString().toInt()

            resta(num1, num2)
        }

        binding.botonMultiplicacion.setOnClickListener(){
            val num1 = binding.escribirNumero1.text.toString().toInt()
            val num2 = binding.escribirNumero2.text.toString().toInt()

            multiplicacion(num1, num2)
        }

        binding.botonDivision.setOnClickListener(){
            val num1 = binding.escribirNumero1.text.toString().toInt()
            val num2 = binding.escribirNumero2.text.toString().toInt()

            division(num1, num2)
        }

        binding.btnLimpiar.setOnClickListener(){
            limpiar()
        }


    }

    fun suma(num1 : Int, num2 : Int ){
        Log.e("Jorge","datos2 $num1 $num2")
        binding.escribirResultado.text = (num1 + num2).toString()
    }

    fun resta(num1 : Int, num2 : Int ){
        binding.escribirResultado.setText(num1 - num2)

    }
    fun multiplicacion(num1 : Int, num2 : Int ){
        binding.escribirResultado.setText(num1 * num2)

    }
    fun division(num1 : Int, num2 : Int ){
        binding.escribirResultado.setText(num1 / num2)

    }
    fun limpiar(){
        binding.escribirNumero1.setText("")
        binding.escribirNumero2.setText("")
        binding.Resultado.setText("")
    }




}