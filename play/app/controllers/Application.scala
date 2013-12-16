package controllers

import play.api._
import play.api.mvc._
import scala.slick.driver.H2Driver.simple._
import models.Coffees
import securesocial.core.{ Identity, Authorization }
import views.html.defaultpages.badRequest
import views.html.defaultpages.todo
import views.html.refund
import views.html.refund

object Application extends Controller with securesocial.core.SecureSocial {

  def index = SecuredAction { implicit request =>
    Ok(views.html.index(request.user))
  }

  def page = UserAwareAction { implicit request =>
    val userName = request.user match {
      case Some(user) => user.fullName
      case _ => "guest"
    }
    Ok("Hello %s".format(userName))
  }

  // you don't want to redirect to the login page for ajax calls so
  // adding a ajaxCall = true will make SecureSocial return a forbidden error
  // instead.
  def ajaxCall = SecuredAction(ajaxCall = true) { implicit request =>
    Ok("")
  }

  def testRefund = Action {
    Ok(views.html.refund())
  }

  def testRequest = Action {
    Ok(views.html.request())
  }

  def canvas = UserAwareAction { implicit request =>
    request.user match {
      case Some(user) => Ok(views.html.canvas(user.firstName))
      case _ => Ok(views.html.canvas("guest"))
    }
  }
}