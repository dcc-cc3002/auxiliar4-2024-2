package videos

import munit.FunSuite
import users.{ContentCreator, Account}

class VideoTest extends FunSuite{

  var video: Video = _
  var creator: ContentCreator = _
  var user: Account = _

  override def beforeEach(context: BeforeEach): Unit = {
    video = new Video(creator)
    user = null
  }

  test("A video can be given a like.") {
    assertEquals(video.getLikes, 0)
    video.like(user)
    assertEquals(video.getLikes, 1)
    video.like(user)
    assertEquals(video.getLikes, 1)
  }

  test("A video can add comments.") {
    assertEquals(video.getComments.size, 0)
    video.addComment(user, "This video is great <3")
    assertEquals(video.getComments.size, 1)
  }

  test("A video has a creator.") {
    assertEquals(video.getCreator, creator)
  }
}
