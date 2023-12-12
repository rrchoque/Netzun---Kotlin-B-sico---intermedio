fun main() {
    // Creando y llamando a una función
    multiplicacion(4,3)

    saludos(apellido ="Choque", nombre ="Reynaldo")
    saludos(nombre ="Juan")

    var suma = sumar(4,5)
    println("Suma: $suma")

    println(multiplicacion2(5,6))
    println(multiplicacion3(5,6))}

fun multiplicacion(num1:Int, num2:Int){
    var resultado = num1 * num2;
    println("Multiplicación: $resultado")
}

fun saludos(nombre: String, apellido: String = "Sin apellido"){
    println("Hola $nombre $apellido")
}

fun sumar(a:Int, b:Int): Int{
    return a+b
}

var multiplicacion2 = fun(a:Int, b:Int):Int {
    return a * b
}

var multiplicacion3 = { a:Int, b:Int -> a * b }