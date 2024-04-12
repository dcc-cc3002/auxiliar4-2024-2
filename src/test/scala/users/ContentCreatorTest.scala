package users

import app.ITube
import munit.FunSuite
import videos.Video

class ContentCreatorTest extends FunSuite {
  var user: ContentCreator = _
  var video: Video = _
  var creator: ContentCreator = _
  var app: ITube = _
  var subscriber: BasicUser = _

  override def beforeEach(context: BeforeEach): Unit = {
    user = new ContentCreator("username")
    creator = new ContentCreator("username")
    video = new Video(creator)
    subscriber = new BasicUser("username")
    app = new ITube
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

  test("A content creator can publish videos.") {
    assertEquals(app.getVideos.size, 0)
    user.uploadVideo(video, app)
    assertEquals(app.getVideos.size, 1)
  }

  test("A content creator can delete their videos.") {
    user.uploadVideo(video, app)
    assertEquals(app.getVideos.size, 1)
    user.deleteVideo(video, app)
    assertEquals(app.getVideos.size, 0)
  }

  test("A content creator can add subscribers.") {
    assertEquals(user.getSubscribers.size, 0)
    user.addSubscriber(subscriber)
    assertEquals(user.getSubscribers.size, 1)
    user.addSubscriber(subscriber)
    assertEquals(user.getSubscribers.size, 1)
  }
}
