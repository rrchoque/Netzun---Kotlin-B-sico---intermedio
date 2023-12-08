fun main() {
    // Declaración de variables
    var saludo: String = "Hola mundo!"
    println(saludo)

    // Constante
    val PI:Double = 3.14
    println(PI)

    // Inferencia de tipos
    var saludos = "Hola mundo!"
    println(saludos)

    // Variables de tipo texto
    var nombre = "Peter"
    var apellido = "Parker"
    println(nombre + " " + apellido)
    println("$nombre $apellido")

    // Variables de tipo número
    var numero1 = 7
    var numero2 = 2
    // Operaciones matemáticas
    println("Suma: ${numero1 + numero2}")
    println("Resta: ${numero1 - numero2}")
    println("Multiplicación: ${numero1 * numero2}")
    println("División: ${numero1 / numero2}")
    println("Módulo: ${numero1 % numero2}")

    // Nullables en kotlin
    var nombreNulo:String?
    nombreNulo = null
    var longitud: Int? = nombreNulo?.length
    println("Longitud : $longitud")

    // Elvis Operator
    println("Hola $nombreNulo tu nombre tiene $longitud letras")

    var nombreNulo2:String?
    nombreNulo2 = null ?: "Usuario"
    var longitud2: Int? = nombreNulo2?.length ?: 0
    println("Hola $nombreNulo2 tu nombre tiene $longitud2 letras")


}