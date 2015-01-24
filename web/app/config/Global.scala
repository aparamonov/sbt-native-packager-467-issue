package config

import play.filters.csrf._
import play.api.mvc._
import play.api.GlobalSettings
import play.filters.gzip.GzipFilter
import scala.concurrent.Future
import play.api.mvc.Results._
import play.api.Play.current
import play.api.Play

object Global extends WithFilters(new GzipFilter(), CSRFFilter()) with GlobalSettings {

  override def onError(request: RequestHeader, ex: Throwable) = {
    if (Play.isProd) {
      Future.successful(InternalServerError(views.html.system.error(ex)))
    }
    else {
      super.onError(request, ex)
    }
  }
}
