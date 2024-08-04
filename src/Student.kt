//Klasa Student me atributet e saj: name(String), age(Int), grades(List<Int>)
class Student(val name: String, val age: Int, val grades: List<Int>) {

    // Funksioni që llogarit mesataren e notave të studentit
    // Kthen mesataren duke ndarë shumën e notave me numrin e tyre
    // Nëse lista e notave është bosh, kthen 0.0
    fun average(): Double {
        var sum = 0
        for (grade in grades) {
            sum += grade
        }
        return if (grades.isNotEmpty()) {
            sum.toDouble() / grades.size
        } else {
            0.0
        }
    }

}

// Funksioni që filtron studentët sipas një mesatareje minimale
// Ky funksion merr një listë të studentëve dhe një mesatare minimale për të krahasuar
// Kthen një listë të studentëve që kanë një mesatare më të lartë se vlera e specifikuar
fun filterStudentsByAverage(studentList: List<Student>, minAverage: Double): List<Student> {
    val filteredStudents = mutableListOf<Student>()
    for (student in studentList) {
        if (student.average() > minAverage) {
            filteredStudents.add(student)
        }
    }
    return filteredStudents
}

// Funksioni që shtyp studentët me një mesatare më të ulët ose të barabartë me një vlerë të caktuar
// Ky funksion merr një listë të studentëve dhe një mesatare maksimale për të krahasuar
// Krijon një loop for për të filtruar dhe shtypur studentët bazuar në mesataren e tyre
fun printStudentsBelowAverage(studentList: List<Student>, maxAverage: Double) {
    for (student in studentList) {
        if (student.average() <= maxAverage) {
            println("${student.name} ka një mesatare prej ${student.average()}")
        }
    }
}