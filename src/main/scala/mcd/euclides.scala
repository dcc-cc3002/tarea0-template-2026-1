package cl.uchile.dcc
package mcd

/*
El siguiente import es necesario sí quieren leer números enteros desde la consola.
Pueden leer un entero de la siguiente forma:

  val a = readInt()
  
y luego usarlo como deseen

  val res = a + 5
  println(s"El resultado del número ingresado más 5 es $res")
  
*/
import scala.annotation.tailrec
import scala.io.StdIn.readInt

@main def euclidesInteractivo(): Unit = {
  // Inicio de la zona donde deben editar el código

  def euclides(a: Int, b: Int): Int = {

    if b == 0 then a
    else euclides(b, a % b)

  }

  var continuar: Boolean = true

  while continuar do {

    println("Ingrese el primer numero (0 para salir):")
    val a: Int = readInt()

    if a == 0 then {
      println("Adios!")
      continuar = false
    }
    else {
      println("Ingrese el segundo numero:")
      val b: Int = readInt()

      val resultado: Int = euclides(a, b)
      println(s"El MCD de $a y $a es $resultado")
    }
  }
  
  // Fin de la zona donde deben editar el código
}
