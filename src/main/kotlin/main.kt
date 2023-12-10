fun main() {
    // Expresión IF y ELSE
    var lluvia = false
    if (lluvia) {
        println("debes usar un paraguas")
    } else {
        println("No necesitas usar un paraguas")
    }

    // Operadores de comparación
    // <, <=, >, >=, !=, ==
    var edad1 = 20
    if (edad1 >= 18){
        println("Usted es mayor de edad")
    } else {
        println("Usted es menor de edad")
    }

    var nombre = "gian"
    if (nombre == "gian"){
        println("Hola Gian")
    }

    // Condicionales anidadas
    var edad = 25
    var grupo = true
    if (edad >= 18) {
        println("Puede pasar por ser mayor de edad")
        if (grupo) {
            println("Ganaste un descuento por venir en grupo")
        } else {
             println("No recibiste descuento")
        }
    } else {
        println("No puede pasar, usted es menor de edad")
    }

    // Expresión When.
    var x = 3
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("El número no es 1 ni 2")
        }
    }

    // Ejercicio Semaforo
    var semaforo = "naranja"
    when (semaforo) {
        "rojo" -> println("Debe detenerse")
        "verde" -> println("Puede continuar")
        "amarillo" -> println("Precaución")
        else -> {
            println("No es un color del semaforo")
        }
    }

    // Rangos y progresiones.
    var num = 45
    /*if (num in 5 .. 20) {
        println("El número se encuentra entre 5 y 20.")
    }*/

    when (num) {
        in 5..20 -> println("El numero esta entre 5 y 20")
        in 30..40 -> println("El número esta entre 30 y 40")
        else -> {
            println("Número desconocido")
        }
    }
}