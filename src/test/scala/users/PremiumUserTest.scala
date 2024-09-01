package users

import munit.FunSuite
import videos.Video

class PremiumUserTest extends FunSuite {

  var user: PremiumUser = _
  var video: Video = _
  var creator: ContentCreator = _

  override def beforeEach(context: BeforeEach): Unit = {
    user = new PremiumUser("username")
    creator = new ContentCreator("username")
    video = new Video(creator)
  }

  test("A user has a username.") {
    assertEquals(user.getUsername, "username")
  }

  test("A user can write a comment.") {
    assertEquals(video.getComments.size, 0)
    user.writeComment(video, "This video is great.")
    assertEquals(video.getComments.size, 1)
  }

  test("A user can like a video.") {
    assertEquals(video.getLikes, 0)
    user.likeVideo(video)
    assertEquals(video.getLikes, 1)
    user.likeVideo(video)
    assertEquals(video.getLikes, 1)
  }

  test("A user can subscribe to a creator.") {
    assertEquals(user.getSubscriptions.size, 0)
    user.subscribeTo(creator)
    assertEquals(user.getSubscriptions.size, 1)
    user.subscribeTo(creator)
    assertEquals(user.getSubscriptions.size, 1)
  }

  test("A premium user can download a video.") {
    assertEquals(user.getDownloadedVideos.size, 0)
    user.downloadVideo(video)
    assertEquals(user.getDownloadedVideos.size, 1)
    user.downloadVideo(video)
    assertEquals(user.getDownloadedVideos.size, 1)
  }
}
