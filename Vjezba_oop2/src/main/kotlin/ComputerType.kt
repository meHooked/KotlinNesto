enum class ComputerType {
    OLD,
    DECENT,
    NEW;

    companion object {
        fun getBootSpeed(type: ComputerType) : Double {
            return when(type){
                OLD -> 15.5
                DECENT -> 9.2
                NEW -> 6.1
            }
        }
    }
}
