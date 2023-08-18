fun main() {

    /*
    Nombre: Wilmer Danilo Moncada Parra
    ID: 702523
    Materia: Electiva CP II
    Ingenieria de sistemas
    
    Declarar un arreglo que permita calcular e imprimir lo siguinte:
    1. Promedio de calificciones
    2. calificacion mas alta
    3. Calificacion mas baja
    4. Mostrar calificaciones inferiores a 3.0

    leer una cantidad indefinida de numeros hasta que el usuario saque un cero
    sacar la sumatoria, el promedio y la raiz de los tres dijtos
     */

    val calificacion = arrayOf(9.5, 8.0, 7.5, 6.0, 9.0)

    val promedio = calificacion.average()
    println("El promedio de calificaciones es: $promedio")

    val calificaciones = arrayOf(9.5, 8.0, 7.5, 6.0, 9.0)

    val maximaCalificacion = calificacion.maxOrNull()
    println("La calificación más alta es: $maximaCalificacion")

    val qualification = arrayOf(9.5, 8.0, 7.5, 6.0, 9.0)

    val calcification = null
    val minimaCalificacion = calcification.minOrNull()
    println("La calificación más baja es: $minimaCalificacion")

    val numeros = ArrayList<Int>()
    var numero: Int

    do {
        print("Ingrese un número (0 para salir): ")
        numero = readLine()!!.toInt()

        if (numero != 0) {
            numeros.add(numero)
        }
    } while (numero != 0)

    val sumatoria = numeros.sum()
    val prompted = numeros.average()
    val raiz = Math.sqrt(numeros.size.toDouble())

    println("La sumatoria es: $sumatoria")
    println("El promedio es: $prompted")
    println("La raíz de los tres dígitos es: $raiz")


}

private fun Nothing?.minOrNull(): Double {
    val calificaciones
    return calificaciones
}
