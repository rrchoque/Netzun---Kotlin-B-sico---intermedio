fun main() {
    // Loops
    // For
    for (i in 1..4){
        println("Hola mundo")
    }

    // Iteración de colección
    var listaPersonajes = listOf("Spiderman", "Wolverine", "Ironman")
    for ((indice, personaje) in listaPersonajes.withIndex()) {
        println("$indice: $personaje")
    }

    // Iteración de Maps
    var user = mutableMapOf("nombre" to "Reynaldo", "pass" to "123")
    for (item in user) {
        println("${item.key} : ${item.value}")
    }
    for ((key, value) in user) {
        println("$key : $value")
    }

    // While Loop
    var num = 1
    while (num < 4) {
        println("Esta es una línea")
        num = num + 1
    }

    // do..While Loop
    var suerte = 10
    do {
        println("Ingrese su número:")
        var numero = readLine()!!.toInt()
        if (numero > suerte) {
            println("Tu número es muy alto")
        }
        if (numero < suerte) {
            println("Tu número es muy bajo")
        }
        if (numero == suerte) {
            println("Ganaste!!")
        }
    } while (suerte != numero)

    // Loops anidados
    for (i in 1..4) {
        println("fila: $i")
        for (j in 1..4){
            println("$j")
        }
    }
}