package app

import munit.FunSuite
import users.{ContentCreator, Account}
import videos.Video

import scala.collection.mutable.ArrayBuffer

class ITubeTest extends FunSuite {

  var user: ContentCreator = _
  var video: Video = _
  var app: ITube = _

  override def beforeEach(context: BeforeEach): Unit = {
    user = new ContentCreator("username")
    video = new Video(user)
    app = new ITube
  }

  test("TuTubo can add a video.") {
    assertEquals(app.getVideos.size, 0)
    app.addVideo(video)
    assertEquals(app.getVideos.size, 1)
  }

  test("TuTubo can delete a video.") {
    app.addVideo(video)
    assertEquals(app.getVideos.size, 1)
    app.deleteVideo(video)
    assertEquals(app.getVideos.size, 0)
  }

  test("TuTubo has published videos.") {
    app.addVideo(video)
    assertEquals(app.getVideos, ArrayBuffer[Video](video))
  }

}
