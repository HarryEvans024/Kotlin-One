import javax.print.attribute.standard.JobOriginatingUserName

fun main(args: Array<String>) {
    motto()
    userVerification("kingwanyama","kingwanyama@gmail.com")
    average(20.3,50,65.0f)
    println(addition(30, 40.0))
}


fun motto(){
    println("Hello this is our motto")
}
fun userVerification(userName:String, email:String){
    println("Your username is $userName and Your email is$email")
}
fun average(x:Double, y:Int, z:Float){
    var result = (x + y + z)/3.0
    println("Hello, Your average is $result")
}
fun addition(x:Int, y:Double):Double{
    var answer = x + y
    return answer
}
