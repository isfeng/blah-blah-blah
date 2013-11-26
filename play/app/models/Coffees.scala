package models

import scala.slick.driver.H2Driver.simple._

object Coffees extends Table[(String, Double)]("COFFEES") {
  def name = column[String]("COF_NAME", O.PrimaryKey)
  def price = column[Double]("PRICE")
  def * = name ~ price
}