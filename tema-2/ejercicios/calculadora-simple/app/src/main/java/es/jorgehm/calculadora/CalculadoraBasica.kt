package es.jorgehm.calculadora

import android.content.Intent
import android.os.Bundle
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

            val num1 = Integer.parseInt(binding.escribirNumero1.toString())
            val num2 = Integer.parseInt(binding.escribirNumero2.toString())

            suma(num1, num2)

        }

        binding.btnResta.setOnClickListener(){

            val num1 = Integer.parseInt(binding.escribirNumero1.toString())
            val num2 = Integer.parseInt(binding.escribirNumero2.toString())

            resta(num1, num2)
        }

        binding.botonMultiplicacion.setOnClickListener(){
            val num1 = Integer.parseInt(binding.escribirNumero1.toString())
            val num2 = Integer.parseInt(binding.escribirNumero2.toString())

            multiplicacion(num1, num2)
        }

        binding.botonDivision.setOnClickListener(){
            val num1 = Integer.parseInt(binding.escribirNumero1.toString())
            val num2 = Integer.parseInt(binding.escribirNumero2.toString())

            division(num1, num2)
        }

        binding.btnLimpiar.setOnClickListener(){
            limpiar()
        }


    }

    fun suma(num1 : Int, num2 : Int ){
        binding.escribirResultado.setText(num1 + num2)

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
    }




}