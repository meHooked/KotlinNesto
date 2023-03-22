object MySingleton {
    var connected = false
    fun connect(){
        connected = true
        println("Connected to database")
    }
    fun disconnect(){
        connected = false
        println("Disconnected from database")
    }
}