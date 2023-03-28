class Consumer<T: Fruit>(var fruit: Fruit) {
    fun eat(){
        fruit.eat()
    }
}