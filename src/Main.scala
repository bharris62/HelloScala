
object Main {

  def main(args: Array[String]): Unit = {
    val car = new Car(4,2,"Toyota",1999)
    println(car.toString)


    val m = new Math()

    println(m.add(10,20))
    println(m.subtract(20,10))
    println(m.multiply(2,2))

    val f = new Food()
    f.add("Banana")
    f.add("Apple")
    println(f.toString)
  }
}
