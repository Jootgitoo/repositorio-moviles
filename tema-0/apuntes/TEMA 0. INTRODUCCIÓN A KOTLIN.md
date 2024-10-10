##### HOLA MUNDO
Para realizar el hola mundo seguimos los siguientes pasos
1. Creamos una **función** para ello se declara como **fun** llamada **main()** puesto que se va a ejecutar
2.  Para escribir en consola directamente utilizamos **println("texto_en_consola")**
```kotlin
fun main(){
	println("Hola mundo")
}
```
-----------------
##### VARIABLES
Para declarar una variable:
- Se le dice al programa que vamos a declarar una **variable** (QUE PUEDE CAMBIAR) --> **var**
- Se nombra la variable como queramos --> **num** (en este caso)
- Se declara de que tipo es (igual que java)
```kotlin
//Declaras la variable
var num: Int

//Le asignas un valor a la variable
var num = 1
```

O bien se puede crear una variable asignándole un valor directamente y el programa ya entiende de que tipo es la variable
```kotlin
//Con esto el programa ya entiende que num es una variable int
var num = 1 

//Con esto el programa ya entiende que num es una variable String
var cadena = "hola"

//Con esto el programa ya entiende que num es una variable double
var decimal = 2.5
```
----------
##### VALORES NULOS
Para Kotlin **NINGUN VALOR** puede ser nulo, a no ser que se lo marques con el carácter **?**
```kotlin
//Esto da error
var nombre: String
nombre = null

//Esto no da error
var nombre: String?
nombre = null
```

Pero a partir de ahora **todo el rato** hay que comprobar si es nulo o no
```kotlin
//Declaramos la variable
var nombre: String?
nombre = "Jorge"

//Comprobamos si es null
if (nombre != null){
	print("Nombre no nulo")
}
```

El **operador Elvis** nos permite definir un valor alternativo si se encuentra en null, es decir, si esa variable está null el programa le asignará un valor
```kotlin
var nombre: String? = null
var longitud: Int = nombre?.length ?: 0

print(${longitud}) //Imprime un 0
```
----------------
##### CONSTANTES
Para declarar una constante (NO PUEDE CAMBIAR NUNCA)
- Se le dice al programa que vamos a declarar una **constante**  --> **val**
- Se nombra la variable como queramos --> **num** (en este caso)
- Se declara de que tipo es (igual que java)
- Las constantes siempre van en mayúsculas
```kotlin
//Constante que tiene un valor que siempre va a ser 10
val NUMERO_PAGINAS: Int = 10
```
--------------------
##### OPERADORES
Todos los operadores son iguales que en java 
```kotlin
fun main(){
	val a = 17
	val b = 20

//Con el $ se escribe el valor que tiene esa variable
	print("$a es igual a $b: ${a == b}")
}
```

Kotlin respeta el orden de los operadores, es decir, realiza las operaciones según este orden: paréntesis, exponente, multiplicación, división, módulo, suma, resta
```kotlin
var x = (3 + 2) * 5 //Esto da 25

var y = (3 + 2) * 5 + (3 * 2 * (3 + 2)) //Esto da 55
```
-------------
##### ESCRITURA Y LECTURA POR CONSOLA
Para escribir en consola se utiliza el metodo **print** 
```kotlin
//Imprime todo en la misma línea
print("Hola")
print("¿Que tal?")

//Imprime cada cosa en una línea
println("Hola")
println("¿Que tal?")
```

Para leer datos desde el teclado se utiliza la función **readLine()**
```kotlin
print("Introduce tu nombre")
val nombre = readLine()
```
----------
##### SENTENCIA IF, IF/ELSE
```kotlin
if (expresion-lógica){
	instruciones...
}

//Ejemplo
println("introduce un numero")
val numero: Int =readLine().toInt()

if (numero > 0 ){
	print("$numero es un numero positivo")
}
```

IF/ELSE
```kotlin
println("Introduce un numero")
val numero: Int = readLine.toInt()

if((numero % 2) == 0){
	println("$numero es un número par")
	
} else {
	println("$numero es un número impar")
}
```

IF / ELSE IF
```kotlin
println("Introduce un numero")
val x: Int = readLine().toInt()

if (x > 10){
	print("$x es mayor que 10")
	
} else if (x < 10) {
	print("$x es menor que 10")
	
} else {
	println("$x es igual a 10")
}
```
-------------
##### CONDICIONALES
```kotlin
println("Introduce un numero")
val numero: Int = readLine.toInt()

if ((x > 10 ) && (x < 20)){
	println("$X está entre 10 y 20")
}

if ((x == 10) || (x == 20)){
	println("$x es 10 o 20")
}

if (!(x == 10)){
	println("$x es distinto que 10")
}
```
--------
##### WHEN
```kotlin
when(valor){
	1 -> intrucciones
	2 -> intrucciones
	3 ...
	else -> {
		intrucciones
	}
}

//Ejemplo
when(valor){
	1 -> print("x es 1")
	2 -> print("x es 2")
	else -> {
		println("x no es ni uno ni dos")
	}
}
```
----------
##### WHILE
```kotlin
while(expresion lógica){
	intrucciones
}

//Ejemplo
var i < 0
while (i < 100){
	println($i)
	i++
}
```
--------
##### DO WHILE
```kotlin
do {
	instruccion
} while (condicion)

//Ejemplo
var num: Int

do {
	print("Teclea número mayor de 0")
	num = readln().toInt()
} while (num <= 0)
```
------
##### FOR
```kotlin
for (expresion lógica){
	instruciones
}

//Imprimir una cuenta
for(i in 1..5){
	println("Contando $i")
}

//Recorrer un rango
for(char in 'a' <=..<='f'){
	print(char) //Imprime abcdef
} 

//Recorre un rano pero avanza de 2 en 2
for(char in 'a'<=..<='f' step 2){
	print(char) //Imprime: ace
} 

//Iteracción inversa
for(char in 'f' >= downTo >= 'a'){
	print(char) //Imprime fedcba
} 

//Iteración excluyendo el límite superior
for(char in 'a' <= until < 'f'){
	print(char)
}

//Recorre una cadena de caracteres
for (c in "Ejemplo"){
	print(c)
}

pg38
```