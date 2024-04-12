package users

import videos.Video

class PremiumUser(username: String) extends AbstractUser(username) {

  private var downloadedVideos: Set[Video] = Set[Video]()

  def getDownloadedVideos: Set[Video] = downloadedVideos

  def downloadVideo(video: Video): Unit = downloadedVideos += video
}
