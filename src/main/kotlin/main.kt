fun main() {
    // Objetos
    // Creando una clase
    var auto = Car(2023, "azul", "Sedan")
    println(auto.year)
    println(auto.color)
    println(auto.modelo)
    auto.encender()
    auto.apagar()

//    var auto2 = Car(2022, "rojo", "Hatchback")
//    println(auto2.year)
//    println(auto2.color)
//    println(auto2.modelo)

    val persona = Person("Reynaldo", 30)
    println(persona.nombre)
    println(persona.edad)

    var camion = Car(2019, "blanco", "Recolector")
    println(camion.year)
    println(camion.color)
    println(camion.modelo)
    camion.encender()
    camion.apagar()

    val tarjeta1 = MasterCard("45747457574574")
    tarjeta1.score(51)

    val tarjeta2 = Visa("01364918364314")
    tarjeta2.score(51)

    val credit = UserInfo()
    println(credit.creditId())
    credit.newCard()
}

//class Car(val year:Int, val color: String, var modelo:String) {
//    // Se ejecuta al instansiar la clase
//    init {
//        val antiguedad = 2023 - year
//        println("La antiguedad es de $antiguedad años.")
//    }
//
//    fun encender(){
//        println("Engine Start...!!!")
//    }
//
//    fun apagar(){
//        println("Engine Off...!!!")
//    }
//}

// Interfaces
interface CreditCard {
    val carNumber:String
    fun score(age:Int)
}

class MasterCard(override val carNumber: String) : CreditCard{
    override fun score(age: Int) {
        if (age > 50){
            println("Negativo")
        } else {
            println("Positivo")
        }
    }
}

class Visa(override val carNumber: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 60){
            println("Negativo")
        } else {
            println("Positivo")
        }
    }
}

// Clases abstractas
abstract class CreditCard1 {
    fun creditId(): String {
        return "923856298539"
    }

    abstract fun newCard()
}

class UserInfo: CreditCard1(){
    fun getInfo():String{
        return creditId()
    }

    override fun newCard() {
        println("new card created!")
    }
}