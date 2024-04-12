package users
import videos.Video

abstract class AbstractAccount(username: String) extends Account {

  override def getUsername: String = username

  override def likeVideo(video: Video): Unit = video.like(this)

  override def writeComment(video: Video, comment: String): Unit = video.addComment(this, comment)
}
