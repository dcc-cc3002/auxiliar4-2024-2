package users

import munit.FunSuite
import videos.Video

class BasicUserTest extends FunSuite {

  var user: BasicUser = _
  var video: Video = _
  var creator: ContentCreator = _

  override def beforeEach(context: BeforeEach): Unit = {
    user = new BasicUser("username")
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
}
