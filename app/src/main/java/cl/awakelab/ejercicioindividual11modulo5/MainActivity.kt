package cl.awakelab.ejercicioindividual11modulo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {

    fun ejerciciosAYB () {
        var numero1 = 10
        val numero2 = 33
        val numero3 = 66

        var resultado = numero1 + numero2 + numero3

        println(resultado)

        numero1 = 55

        resultado = numero1 + numero2 + numero3

        println(resultado)

        val promedio = resultado/3

        println(promedio)
    }

    fun ejercicioC() {
        val amanda = Person("Amanda", 33, "play tennis", null)
        val atiqah = Person("Atiqah", 28, "climb", amanda)
        amanda.showProfile()
        atiqah.showProfile()
    }

    ejercicioC()

}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: " + name)
        println("Age: " + age)
        if(hobby != null) {
            print("Likes to " + hobby + ". ")
        } else {
            println("Doesn't have a hobby. ")
        }
        if(referrer != null) {
            print("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}