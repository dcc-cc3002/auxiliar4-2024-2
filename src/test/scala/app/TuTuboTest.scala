package app

import munit.FunSuite
import users.{ContentCreator, User}
import videos.Video

import scala.collection.mutable.ArrayBuffer

class TuTuboTest extends FunSuite {

  var user: ContentCreator = _
  var video: Video = _
  var app: TuTubo = _

  override def beforeEach(context: BeforeEach): Unit = {
    user = new ContentCreator
    video = new Video(user)
    app = new TuTubo
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
