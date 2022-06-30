package ObjectOrientedPrograming

fun main(args: Array<String>) {
    var firstAdmin = Admin("Miriam",900000.00,"miriam2gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)

    firstAdmin.SetIdNumber("987878")
    println(firstAdmin.GetIdNumber("987878"))
}

class Admin {
    var name:String
    var salary:Double
    var email:String
    private var phoneNumber:String = ""
    private var idNumber:String = ""

    constructor(name:String, salary:Double,email:String){
        this.name = name
        this.salary = salary
        this.email = email
    }
    fun registerUser(){
        println("Yeah, I can register a user")

    }
    fun suspendEmployee(){
        println("Yeah, I can suspend an employee")
    }
    fun SetPhoneNumber(phoneNumber:String){
        this.phoneNumber = phoneNumber

    }
    fun GetPhoneNumber(phoneNumber:String){
        this.phoneNumber = phoneNumber
    }
    fun SetIdNumber(idNumber:String){
        this.idNumber = idNumber

    }
    fun GetIdNumber(idNumber:String){
        this.idNumber = idNumber
    }


}