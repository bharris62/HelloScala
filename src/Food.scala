import scala.collection.mutable.ListBuffer

import scala.collection.JavaConverters._
import scala.collection.mutable

/**
  * Created by BHarris on 3/20/17.
  */
class Food {

  var foodItem = new ListBuffer[String]()

  def add(food:String) = {
    foodItem += food
  }

  override def toString: String = {
    foodItem.toString()
  }

}
