package users
import videos.Video
import scala.collection.mutable.ArrayBuffer

class PremiumUser(username: String) extends BasicUser(username) {
  private val downloadedVideos: ArrayBuffer[Video] = ArrayBuffer[Video]()
  def getDownloadedVideos:ArrayBuffer[Video]=downloadedVideos
  def downloadVideo(video: Video):Unit=downloadedVideos+=video
}
