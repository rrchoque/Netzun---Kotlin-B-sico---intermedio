open class Car(val year:Int, val color: String, var modelo:String) {
    // Se ejecuta al instansiar la clase
    init {
        val antiguedad = 2023 - year
        println("La antiguedad es de $antiguedad años.")
    }

    fun encender(){
        println("Engine Start...!!!")
    }

    fun apagar(){
        println("Engine Off...!!!")
    }
}