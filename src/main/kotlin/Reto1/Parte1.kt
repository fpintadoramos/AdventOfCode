package Reto1
import java.io.File
fun largerMeasurements(l:List<Int>):Int{
    var cont:Int = 0
    var puntoAnterior = 0
    l.forEach {
        if (it>puntoAnterior&&puntoAnterior!=0){
            cont++
        }
        puntoAnterior = it
    }
    return cont
}
fun fillList():List<Int>{
    var l:MutableList<Int> = mutableListOf()
    File("input.txt").forEachLine() { l.add(it.toInt()) }
    return l
}

