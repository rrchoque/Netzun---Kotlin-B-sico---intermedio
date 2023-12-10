fun main() {
    // Ingreso de datos desde consola.
    println("¿Cual es tu color favorito?:")
    val color = readLine()
    println("Tu color favorito es el $color")

    // Ejercicio: Preguntar al usuario algunos datos importantes
    // para crear su cuenta de usuario (Usuario, Contraseña, Correo)
    // y luego mostrar en pantalla la información.
    println("Ingrese su Usuario:")
    val usuario = readLine()
    println("Ingrese su Contraseña:")
    val password = readLine()
    println("Ingrese su Correo Electrónico:")
    val correo = readLine()
    println("Usuario: $usuario")
    println("Contraseña: $password")
    println("Correo: $correo")
}