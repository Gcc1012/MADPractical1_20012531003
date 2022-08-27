fun main()
{
    val obj = ArrayList<Student> (5)

    obj.add(Student())
    obj.add(Student("15","IT","D","AB15","Gayatri","Chawda",19))
    obj.add(Student("78","IT","A","AB1","Divyanshi","Singh", 22))
    obj.add(Student("03","CE","D","A14","Deepika","Kshatriya",22))
    obj.add(Student("08","AI","B","A10","Prachi","Raval",20))
    obj.add(Student("025","CE","B","AB9","Kruti","  Shah",19))

    for (i in obj)
    {
        i.details()
        i.studentinfo()
    }

}
open class Person(private val fn: String, private val ln: String, private val age: Int)
{
    fun details() {
        println("First Name = $fn")
        println("Last Name = $ln")
        println("Age = $age")
    }
}

class Student(private val enroll: String,private val branch: String,private val Class: String,private val batch: String,fname: String,lname: String,age: Int) : Person(fname, lname, age)
{

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0)
    {
        println("Secondary Constructor")
    }
    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}