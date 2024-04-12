package users

import videos.Video

trait User {

  def writeComment(video: Video): Unit

  def likeVideo(video: Video)
}
