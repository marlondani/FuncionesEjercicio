//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Escriba el numero de la operacion que quiere realizar")
    println("""
        1. Suma
        2. Resta
        3. Raiz
        4. Cuadrado
        5. Saludo
        6. Division
        7. Multiplicacion
        8. Salir
    """)
    println("Digite una opcion: ")
    var operacion = readln().toInt()
    var estado = true
    while (estado) {
        if (operacion == 1) {
            suma()
            estado = false
        } else if (operacion == 2) {
            resta()
            estado = false
        } else if (operacion == 3) {
            println("La raiz es: ${raiz()}")
            estado = false
        } else if (operacion == 4) {
            println(cuadrado())
            estado = false
        } else if (operacion == 5) {
            println(saludo())
            estado = false
        } else if (operacion == 6) {
            division(8.0, 2.0)
            estado = false
        } else if (operacion == 7) {
            println(multi(8.0, 2.0))
            estado = false
        } else if (operacion == 8) {
            println("Saliendo...")
            estado = false
        }
    }
}
var n1 = 12.0
var n2 = 6.0
//Sin parametros y sin retorno
fun suma() {
    println("La suma es: ${n1+n2}")
}
//Sin parametros y sin retorno
fun resta() {
    println("La resta es: ${n1-n2}")
}
//Sin parametros y con retorno
fun raiz():Double{
    return Math.sqrt(n1)
}
//Sin parametros y con retorno
fun saludo(): String{
    return "hola clase"
}
//Sin parametros y con retorno
fun cuadrado(): Double{
    return Math.pow(n1, 2.0)
}
//Con parametros y sin retorno
fun division(n1: Double, n2: Double){
    var div= n1/n2
    println("La division es: ${div}")
}
//Con parametros y con retorno
fun multi(n1:Double, n2:Double):String {
    return "La multiplicacion es: ${(n1*n2)}"
}