fun main() {
    // Krijimi i objekteve Student me vlera të ndryshme
    val student1 = Student("Luan Berisha", 25, listOf(10, 8, 9, 7))
    val student2 = Student("Arbër Kelmendi", 21, listOf(7, 8, 7, 9))
    val student3 = Student("Erion Gashi", 20, listOf(7, 8, 7, 9))
    val student4 = Student("Arbër Gashi", 25, listOf(7, 8, 10, 9))
    val student5 = Student("Vlera Gashi", 21, listOf(8, 8, 8, 8))
    val student6 = Student("Blend Berisha", 24, listOf(8, 7, 8, 9))
    val student7 = Student("Bleona Kelmendi", 23, listOf(6, 6, 6, 7))


    println("----------------------------------------------------------------------------------------------------------")
    // Data Types dhe Print Functions
    // Shtypja e të dhënave të përgjithshme të studentëve
    println("Shtypja e të dhënave të përgjithshme të studentëve")
    println()
    // Printimi i të dhënave për student1
    print("Emri: ${student1.name} - Lloji: ${student1.name::class.simpleName}, ")
    print("Mosha: ${student1.age} - Lloji: ${student1.age::class.simpleName}, ")
    println("Notat: ${student1.grades.joinToString(", ")} - Lloji: ${student1.grades::class.simpleName}")
    println("----------------------------------------------------------------------------------------------------------")
    // Printimi i të dhënave për student2
    print("Emri: ${student2.name} - Lloji: ${student1.name::class.simpleName},")
    print("Mosha: ${student2.age} - Lloji: ${student1.age::class.simpleName},  ")
    println("Notat: ${student2.grades.joinToString(", ")} - Lloji: ${student1.grades::class.simpleName} ")
    println("----------------------------------------------------------------------------------------------------------")
    // Printimi i të dhënave për student3
    print("Emri: ${student3.name} - Lloji: ${student1.name::class.simpleName}, ")
    print("Mosha: ${student3.age} - Lloji: ${student1.age::class.simpleName},  ")
    println("Notat: ${student3.grades.joinToString(", ")} - Lloji: ${student1.grades::class.simpleName}")
    println("----------------------------------------------------------------------------------------------------------")
    println()

    //  Arrays dhe Lists:
    // Krijimi i një ArrayList me objekte Student
    // Kjo ArrayList do të përmbajë të gjithë studentët e krijuar më lart
    val studentList = arrayListOf(student1, student2, student3, student4, student5, student6, student7)


    println("----------------------------------------------------------------------------------------------------------")
    println("Llogaritja e mesatares së studentëve")
    println()
    // Llogaritja e mesatares së notave duke përdorur funksionin calculateAverage()
    // Për secilin student në listën e studentëve, llogaritet mesatarja e notave dhe shtypet
    for (student in studentList) {
        // Konvertimi nga List<Int> në Array<Int> për të përdorur funksionin calculateAverage()
        val studentGrades = student.grades.toTypedArray()
        // Thirrja e funksionit calculateAverage për të llogaritur mesataren e notave
        val average = calculateAverage(studentGrades)
        // Shtypja e mesatares së notave të secilit student
        println("Mesatarja e notave të ${student.name} është: $average")
    }

    println("-----------------------------------------------------------------------------------------------------------")
    // Shtypja e të dhënave të përgjithshme të studentëve, me ArrayList StudentList
    // Kjo pjesë bën të njëjtën gjë si më parë, por duke përdorur ArrayList për të ruajtur studentët
    println("Shtypja e të dhënave të përgjithshme të studentëve")
    println()
    // Për secilin student në ArrayList, shtypni emrin, moshën dhe notat duke specifikuar gjithashtu llojin e secilës vlerë
    for (student in studentList){
        print("Emri: ${student.name} - Lloji: ${student.name::class.simpleName}, ")
        print("Mosha: ${student.age} - Lloji: ${student.age::class.simpleName},  ")
        println("Notat: ${student.grades.joinToString(", ")} - Lloji: ${student.grades::class.simpleName}")
    }
    println("-----------------------------------------------------------------------------------------------------------")

    // If Statements dhe Loops:
    // Filtrimi dhe shtypja e studentëve me një mesatare më të lartë se një vlerë e caktuar
    // Përdorimi i një vlere minimale për mesataren dhe shtypja e studentëve që e kalojnë këtë prag
    val minAverage = 8.0
    // Thirrja e funksionit filterStudentsByAverage për të filtruar studentët me mesatare më të lartë se minAverage
    val studentsAboveMinAverage = filterStudentsByAverage(studentList, minAverage)
    println("Studentët me një mesatare më të lartë se $minAverage:")
    println()
    // Shtypja e emrave të studentëve që kalojnë pragun e mesatares
    for (student in studentsAboveMinAverage) {
        println(student.name)
    }


    println("----------------------------------------------------------------------------------------------------------")


    // Shtypja e studentëve me një mesatare më të ulët se një vlerë e caktuar
    // Duke përdorur një prag maksimal për mesataren dhe shtypjen e studentëve që e kalojnë ose janë të barabartë me këtë prag
    val maxAverage = 8.0
    println("Studentët me një mesatare më të ulët ose të barabartë me $maxAverage:")
    println()
    // Thirrja e funksionit printStudentsBelowAverage për të shtypur studentët që janë nën ose baraz me maxAverage
    printStudentsBelowAverage(studentList, maxAverage)

    println("----------------------------------------------------------------------------------------------------------")


    // Krijimi i objekteve Course me vlera të ndryshme
    val androidCourse = Course("Kursi Android Studio & Kotlin", mutableListOf())
    val reactCourse = Course("Kursi i React", mutableListOf())

    // Shtimi i studentëve në kursin Android Studio & Kotlin
    println("Shtimi i studentëve në kursin Android Studio & Kotlin")
    println()
    androidCourse.addStudent(student1)
    androidCourse.addStudent(student2)
    androidCourse.addStudent(student3)
    androidCourse.addStudent(student5)
    androidCourse.addStudent(student7)
    androidCourse.addStudent(student5) // Shtohet përsëri për të treguar se lista nuk mund të përmbajë të njëjtin student më shumë se një herë
    println("----------------------------------------------------------------------------------------------------------")

    // Shtimi i studentëve në kursin e React
    println("Shtimi i studentëve në kursin e React")
    println()
    reactCourse.addStudent(student1)
    reactCourse.addStudent(student2)
    reactCourse.addStudent(student5)
    reactCourse.addStudent(student6)
    reactCourse.addStudent(student6)// Shtohet përsëri për të treguar se lista nuk mund të përmbajë të njëjtin student më shumë se një herë
    println("----------------------------------------------------------------------------------------------------------")

    // Krijimi i një Map të kurseve
    // Kjo hartë (Map) do të përmbajë emrat e kurseve dhe objektet përkatëse të kursit
    val courseMap = mutableMapOf(
        androidCourse.courseName to androidCourse,
        reactCourse.courseName to reactCourse
    )


    // Përdorimi i funksionit filterCourseByStudentNumber() për të filtruar kurset me më shumë studentë se një vlerë e caktuar
    // filterCourseByStudentNumber() funksioni ndodhet më poshtë
    val minimumStudentNumber = 2
    val filteredCourses = filterCourseByStudentNumber(courseMap, minimumStudentNumber)
    println("Kurset me më shumë se $minimumStudentNumber studentë:")
    println()
    // Printimi i emrave të kurseve që kanë më shumë se minimumStudentNumber studentë
    for (course in filteredCourses) {
        println(course.courseName)
    }



    println("----------------------------------------------------------------------------------------------------------")
    // Shtypja e studentit me mesataren më të lartë, nëse ka studentë në kurs
    // getTopStudent() funksioni është më poshtë
    val topStudent = getTopStudent(androidCourse)
    if (topStudent != null) {
        println("Student/i/ja me mesataren më të lartë në kursin Android është: ${topStudent.name} me një mesatare prej ${topStudent.average()}")
    } else {
        println("Nuk ka studentë në ketë kurs.")
    }
    println()


    // Shtypja e studentëve që kanë kaluar pragun e kalimit
    // getPassingStudent() funksioni është më poshtë
    println("----------------------------------------------------------------------------------------------------------")
    val passMark = 7.5
    val passingStudents = getPassingStudents(studentList, passMark)
    println("Studentët që kanë kaluar pragun prej $passMark:")
    println()
    // Printimi i emrave të studentëve që kanë kaluar pragun e kalimit
    for (name in passingStudents) {
        println(name)
    }
    println()
}


// Funksioni që kthen të gjitha kurset ku numri i studentëve është më i madh se një vlerë e caktuar
// Ky funksion merr një Map të kurseve dhe një numër minimal të studentëve për të krahasuar
// Krijon një listë të kurseve të filtruar që përmban kurset me numër studentësh më të madh se vlera e specifikuar
// Përdor një loop for për të filtruar kurset bazuar në numrin e studentëve
fun filterCourseByStudentNumber(courseMap: Map<String, Course>, minimumStudents: Int): List<Course> {
    // Krijon një listë të mundshme për të mbajtur kurset që kalojnë filtrin
    val filteredCourses = mutableListOf<Course>()

    // Kalon përmes të gjitha vlerave në Map (kurset)
    for (course in courseMap.values) {
        // Kontrollon nëse numri i studentëve në kurs është më i madh se minimumi i dhënë
        if (course.students.size > minimumStudents) {
            // Shton kursin në listën e filtruar nëse përmbush kushtin
            filteredCourses.add(course)
        }
    }

    // Kthen listën e kurseve që kalojnë filtrin
    return filteredCourses
}




// Funksioni që llogarit mesataren e një array të notave
// Ky funksion merr një array të notave dhe kthen mesataren e tyre
// Kthen mesataren duke ndarë shumën e notave me numrin e tyre
fun calculateAverage(grades: Array<Int>): Double {
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



// Funksioni që kthen studentin me mesataren më të lartë në një kurs
// Ky funksion merr një objekt Course dhe kthen studentin me mesataren më të lartë të notave
// Krijon një variabël për të mbajtur studentin me mesataren më të lartë dhe një tjetër për të mbajtur mesataren më të lartë
// Përdor një loop for për të krahasuar mesataret e studentëve dhe për të gjetur studentin me mesataren më të lartë
fun getTopStudent(course: Course): Student? {
    // Inicilizo `topStudent` si `null` sepse nuk e kemi gjetur ende studentin më të mirë
    var topStudent: Student? = null
    var highestAverage = -1.0 // Fillojm më një vler që është më e vogël se gjdo vlerë të mundeshme

    for (student in course.students) {
        val currentAverage = student.average()
        if (currentAverage > highestAverage) {
            topStudent = student
            highestAverage = currentAverage
        }
    }

    return topStudent
}


// Funksioni që kthen emrat e studentëve që kanë kaluar pragun e kalimit
// Ky funksion merr një ArrayList të studentëve dhe një prag të kalimit
// Krijon një listë të emrave të studentëve që kanë një mesatare më të lartë se pragu
// Përdor një loop for për të krahasuar mesataret e studentëve me pragun e kalimit
fun getPassingStudents(students: ArrayList<Student>, passMark: Double): List<String> {
    val passingStudents = mutableListOf<String>()
    for (student in students) {
        if (student.average() >= passMark) {
            passingStudents.add(student.name)
        }
    }
    return passingStudents
}
