//Klasa Course me atributet e saj: courseName(String), students(MutableList<Student>)
class Course(val courseName: String, val students: MutableList<Student>) {

    // Funksioni që regjistron një student të ri në kurs
    // Kontrollon nëse studenti ekziston tashmë dhe nëse po, kthen një mesazh gabimi
    // Nëse studenti nuk ekziston, e shton atë në listën e studentëve dhe kthen sukses
    fun addStudent(student: Student): Boolean {
        for (existingStudent in students) {
            if (existingStudent.name == student.name && existingStudent.age == student.age) {
                println("Student/i/ja më emrin ${student.name} tashmë ekziston!")
                return false
            }
        }
        students.add(student)
        println("Student/i/ja  ${student.name} u regjistrua me sukses!")
        return true
    }

}
