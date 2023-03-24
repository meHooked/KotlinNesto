class Rectangle(a: Int, b: Int) : Shape(a, b) {

    override fun calculateArea(): Int{
        calculateAreaGreeting()
        return a * b
    }

    override fun calculateOpseg(): Int {
        return 2 * (a + b)
    }

    override fun sayHello() {
        println("Hello from Rectangle")
    }


}