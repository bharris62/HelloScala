class Car(val wheels: Int,  val seats: Int, val brand: String, val year: Int  ) {

  override def toString: String = {
    s"The $brand has $wheels whees, $seats seats and was made in $year!"
  }
}
