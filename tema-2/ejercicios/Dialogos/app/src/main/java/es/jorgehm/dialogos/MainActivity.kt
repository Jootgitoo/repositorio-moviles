package es.jorgehm.dialogos

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.jorgehm.dialogos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSimpleAlert.setOnClickListener { showSimpleAlertDialog() }
        binding.btnOkCancel.setOnClickListener { showOkCancelAlertDialog() }
        binding.btnOkNoCancel.setOnClickListener { showOkNoCancelAlertDialog() }
        binding.btnListAlert.setOnClickListener { showListAlertDialog() }
        binding.btnSingleChoiceAlert.setOnClickListener{ showSingleChoiceAlertDialog() }
        binding.btnMultiChoiceAlert.setOnClickListener{ showMultiChoiceAlertDialog() }
        binding.btnCustomInput.setOnClickListener { showCustomInputAlertDialog() }
    }

    private fun showSimpleAlertDialog() {
        AlertDialog.Builder(this)
            .setTitle("Simple Alert")
            .setMessage("This is a simple alert dialog.")
            .setPositiveButton("OK", null)
            .setIcon(R.drawable.carita)
            .show()
    }

    private fun showOkCancelAlertDialog() {
        AlertDialog.Builder(ContextThemeWrapper(this,R.style.temaDialog))
            .setTitle("Confirmation")
            .setMessage("Are you sure you want to proceed?")
            .setPositiveButton("OK") { dialog, which ->
                // Si pulsas el boton ok
                Toast.makeText(this, "OK clicked", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel") { dialog, which ->
                // Si pulsas el boton Cancel
                Toast.makeText(this, "Cancel clicked", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    private fun showOkNoCancelAlertDialog() {
        AlertDialog.Builder(this)
            .setTitle("Confirmation")
            .setMessage("Are you sure you want to proceed?")
            .setPositiveButton("OK") { dialog, which ->
                // Si pulsas el boton ok
                Toast.makeText(this, "OK clicked", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { dialog, which ->
                // Si pulsas el boton No
                Toast.makeText(this, "No clicked", Toast.LENGTH_SHORT).show()
            }
            .setNeutralButton("Cancel") { dialog, which ->
                // Si pulsas el boton cancel
                Toast.makeText(this, "Cancel clicked", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    private fun showListAlertDialog() {
        val items = arrayOf("Item 1", "Item 2", "Item 3") //este array podría venir cargado de un fichero o una BBDD.
        AlertDialog.Builder(this)
            .setTitle("List Alert")
            .setItems(items) { dialog, which ->
                // Handle item selection
                Toast.makeText(this, "Selected: ${items[which]}", Toast.LENGTH_SHORT).show()
            }

            .show()
    }

    private fun showSingleChoiceAlertDialog() {
        val items = arrayOf("Item 1", "Item 2", "Item 3")
        var checkedItem = -1 // No item selected initially
        AlertDialog.Builder(this)
            .setTitle("Single Choice Alert")
            .setSingleChoiceItems(items, checkedItem) { dialog, which ->
                checkedItem = which
            }
            .setPositiveButton("OK") { dialog, which ->
                // Handle selection
                Toast.makeText(this, "Selected: ${items[checkedItem]}", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    private fun showMultiChoiceAlertDialog() {
        val items = arrayOf("Item 1", "Item 2", "Item 3")
        val selectedItems = booleanArrayOf(false, false, false) // Initially, no items are selected
        AlertDialog.Builder(this)
            .setTitle("Multi Choice Alert")
            .setMultiChoiceItems(items, selectedItems) { dialog, which, isChecked ->
                selectedItems[which] = isChecked
            }
            .setPositiveButton("OK") { dialog, which ->
                // Handle selections
                val selectedItemsList = mutableListOf<String>()
                for (i in selectedItems.indices) {
                    if (selectedItems[i]) {
                        selectedItemsList.add(items[i])
                    }
                }
                Toast.makeText(this, "Selected: $selectedItemsList", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    public fun showCustomInputAlertDialog() {
        // Crear un constructor de AlertDialog
        val builder = AlertDialog.Builder(this)

        // Inflar el layout del diálogo usando el layout específico
        val inflater = layoutInflater
        val dialogLayout = inflater.inflate(R.layout.dialogo_personalizado, null)

        // Acceder al EditText desde el layout inflado
        val editText = dialogLayout.findViewById<EditText>(R.id.editTextData)

        // Configurar el AlertDialog
        builder.setView(dialogLayout)
            .setPositiveButton("OK") { dialogInterface, i ->
                // Obtener el texto ingresado en el EditText
                val inputText = editText.text.toString()
                // Procesar el texto ingresado
                Toast.makeText(this, "Input: $inputText", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

}


