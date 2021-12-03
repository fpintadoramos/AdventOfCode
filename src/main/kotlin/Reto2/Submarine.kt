package Reto2

class Submarine(){
    var x:Int = 0
    var depth:Int = 0

    fun forward(distance:Int){
        x += distance
    }

    fun down(distance:Int){
        depth += distance
    }

    fun up(distance:Int){
        depth -= distance
    }

    override fun toString() = "Horizontal position: $x \nDepth: $depth"
}