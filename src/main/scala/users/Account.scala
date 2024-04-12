package users

import videos.Video

trait Account {

  def getUsername: String

  def writeComment(video: Video, comment: String): Unit

  def likeVideo(video: Video): Unit
}
