fun main() {
    // Creando una lista
    // listOf(value1, value2, value3, etc..)
    // var/var listName = listOf(value1, value2, value3, etc..)
    // listOf (inmutable) : mutableListOf (mutable)
    var paises1 = mutableListOf("Bolivia", "Argentina", "Peru")
    println(paises1)
    println(paises1[2])

    paises1[2] = "Brasil"
    println(paises1[2])

    // Crear un Set (No admite duplicados)
    // setOf (inmutable) : mutableSetOf (mutable)
    var paises = mutableSetOf("Bolivia", "Argentina", "Peru", "Bolivia")
    println(paises)
    println(paises.elementAt(2))
    paises.remove("Peru")
    println(paises)

    // Crear un Map
    // MapOf (inmutable) : mutableMapOf (mutable)
    var datosUsuario = mutableMapOf("nombre" to "Reynaldo", "pass" to "123")
    println(datosUsuario)
    println(datosUsuario["nombre"])
    println(datosUsuario.keys)
    println(datosUsuario.values)
    datosUsuario["pass"] = "456"
    println(datosUsuario)

}