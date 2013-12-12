import play.api._
import play.api.mvc.WithFilters
import play.filters.csrf._

/**
 *	http://www.playframework.com/documentation/2.2.x/ScalaCsrf
 */
object Global extends GlobalSettings {

  override def onStart(app: Application) {
    Logger.info("Application has started")
  }

  override def onStop(app: Application) {
    Logger.info("Application shutdown...")
  }

}