class Student(firstName: String, lastName: String, oib: String, val facultyName: String) : Person(firstName, lastName, oib) {
    override fun work() {
        println("Studying")
    }

    fun examPassed(exam: Exam){
        exams.add(exam)
    }

    companion object {
        var exams = arrayListOf<Exam>()

        fun bestGrade(): Int{
            return exams.maxBy { it.grade }.grade
        }

        fun lowestGrade(): Int{
            return exams.minBy { it.grade }.grade
        }

        fun averageGrade(): Double {
            var total = 0.0
            for(exam in exams){
                total += exam.grade
            }
            return total / exams.size
        }

    }

}