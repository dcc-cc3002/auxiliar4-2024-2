package users
import videos.Video
import app.ITube
import scala.collection.mutable.ArrayBuffer


class ContentCreator(username: String) extends GenericUser(username){
  private val subscribers: ArrayBuffer[Account] = ArrayBuffer[Account]()
  def uploadVideo(video: Video, app: ITube):Unit = app.addVideo(video)
  def deleteVideo(video: Video, app: ITube):Unit = app.deleteVideo(video)
  def getSubscribers: ArrayBuffer[Account] = subscribers
  def subscribeTo(user: Account): Unit = subscribers+=user
}
