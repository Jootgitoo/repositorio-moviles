package com.example.recyclerviewplanetas.modelo

data class Planet(val name: String, val sizeKm: Int, val distanceAU: Double, val imageName: String = name.lowercase())