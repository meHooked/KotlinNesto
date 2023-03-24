class Square(a: Int) : Shape(a, a) {

    override fun calculateArea() : Int{
        calculateAreaGreeting()
        return a * a
    }

    override fun calculateOpseg(): Int {
        return 4 * a
    }

    override fun sayHello() {
        println("Hello from square")
    }

    fun sayHelloSquare(){
        println("Custom square hello")
    }


}