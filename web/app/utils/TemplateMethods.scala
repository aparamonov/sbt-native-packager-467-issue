package utils

import play.api.{ Mode, Play }

object TemplateMethods {

  //are we running in test mode?
  def isTest: Boolean = {
    Play.maybeApplication.exists(_.mode == Mode.Test)
  }

  //are we running in prod mode?
  def isProd: Boolean = {
    Play.maybeApplication.exists(_.mode == Mode.Prod)
  }

  def requestId: String = {
    ""
  }

  def serverIp: String = {
    ""
  }
}
