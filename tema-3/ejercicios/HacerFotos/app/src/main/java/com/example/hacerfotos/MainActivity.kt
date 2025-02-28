package com.example.hacerfotos

import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.hacerfotos.databinding.ActivityMainBinding
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bitmap: Bitmap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Activity para abrir la camara
        val openCamera = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val data = result.data!!
                bitmap = data.extras!!.get("data") as Bitmap
                binding.img.setImageBitmap(bitmap)
            }
        }
        //Activity para pedir permisos de cámara
        //Usamos registerForActivityResult para recuperar los datos devueltos
        val requestCameraPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()) {
                isGranted: Boolean ->
            if (isGranted) {
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                //si quisieras vídeo.
                //val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
                openCamera.launch(intent)
            } else {
                Log.e("SAR","Permiso de cámara no concedido")
            }
        }
        binding.openCamera.setOnClickListener {
            requestCameraPermissionLauncher.launch(android.Manifest.permission.CAMERA)
        }

        binding.saveToGallery.setOnClickListener {
            saveImageToGallery(binding.txtImagen.text.toString())
        }

        //Activity para lanzar la galería de imágenes.
        //Usamos registerForActivityResult para recuperar los datos devueltos
        val pickMedia = registerForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
            // Callback is invoked after the user selects a media item or closes the
            // photo picker.
            if (uri != null) {
                Log.d("SAR", "Selected URI: $uri")
                binding.img.setImageURI(uri)
                Log.d("SAR", "Cargada")
            } else {
                Log.d("SAR", "No media selected")
            }
        }
        binding.openGallery.setOnClickListener{
            pickMedia.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
            //si quisieras que se vean imágenes y vídeos de la galería.
            // pickMedia.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageAndVideo))
        }
    }

    //----------------------- Funciones lanzadas por los botones -------------------------

    /**
     * Guardar imagen en la galería. Se guardará con el nombre que pongamos en la editText.
     */
    private fun saveImageToGallery(filename:String = "my_image.jpg"): Uri? {

        val filepath = Environment.DIRECTORY_PICTURES
        val contentValues = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, filename)
            put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
            put(MediaStore.Images.Media.RELATIVE_PATH, filepath)
        }
        val contentResolver = contentResolver
        val uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)

        try {
            val outputStream = contentResolver.openOutputStream(uri!!)
            if (outputStream != null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
            }
            outputStream?.close()
        } catch (e: IOException) {
            e.printStackTrace()
            Toast.makeText(this, "Se ha producido algún error al almcenar la imagen en la galería.",
                Toast.LENGTH_SHORT).show()
            return null
        }
        Toast.makeText(this, "Imagen almacenada en la galería", Toast.LENGTH_SHORT).show()
        binding.txtImagen.setText("")
        return uri
    }
}