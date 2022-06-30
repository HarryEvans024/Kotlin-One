package OOPS

fun main(args: Array<String>) {
    var firstUser = User("Harry", "emobilis@gmail.com", "12345", "12345")
    firstUser.register()
    firstUser.login()

    var secondUser =User("XYZ","emobilis@gmail.com", "12345","12345")

}


class User {
    //These are the properties
    var name:String
    var email:String
    var password:String
    var confirmPassword:String

    //This is a constructor
    constructor(name:String, email:String, password:String, confirmPassword:String){
        this.name = name
        this.email = email
        this.password = password
        this.confirmPassword = confirmPassword
    }

    fun register(){
        if (!password.equals(confirmPassword)){
            println("Passwords don't match")
        }else{
            println("Registration successful")
        }
    }

    fun login(){
        if (email.equals("emobilis@gmail.com")&& password.equals("12345")){
            println("Login successful")
        }else{
            println("Wrong username or password")
        }
    }
}


