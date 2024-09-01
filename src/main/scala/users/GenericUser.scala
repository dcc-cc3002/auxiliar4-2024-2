package users
import videos.Video

abstract class GenericUser(val username: String) extends Account{
  def getUsername: String ={
    username
  }

  def writeComment(video: Video, comment: String): Unit ={
    video.addComment(this,comment)
  }

  def likeVideo(video: Video): Unit = {
    video.like(this)
  }
}
