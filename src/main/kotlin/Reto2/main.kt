package Reto2

fun main(){
    var s:Submarine = Submarine()
    s.forward(5)
    s.down(5)
    s.forward(8)
    s.up(3)
    s.down(8)
    s.forward(2)
    println(s.toString())
}