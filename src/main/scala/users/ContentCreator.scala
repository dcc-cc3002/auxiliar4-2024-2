package users

import app.ITube
import videos.Video

class ContentCreator(username: String) extends AbstractAccount(username) {

  private var subscribers: Set[User] = Set[User]()


  def getSubscribers: Set[User] = subscribers

  def uploadVideo(video: Video, app: ITube): Unit = app.addVideo(video)

  def deleteVideo(video: Video, app: ITube): Unit = app.deleteVideo(video)

  def addSubscriber(user: User): Unit = subscribers += user
}
