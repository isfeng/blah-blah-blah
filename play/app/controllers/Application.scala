package controllers

import play.api._
import play.api.mvc._
import scala.slick.driver.H2Driver.simple._
import models.Coffees

object Application extends Controller {

  def index = Action {
    Logger.debug(Coffees.ddl.createStatements.mkString)
    Ok(views.html.index("Your new application is ready."))
  }

}