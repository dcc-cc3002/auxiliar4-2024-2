package app

import users.User
import videos.Video

import scala.collection.mutable.ArrayBuffer

/**
 * This class represents a platform to publish videos.
 */
class TuTubo {

  val users: ArrayBuffer[User] = ArrayBuffer[User]()
  val videos: ArrayBuffer[Video] = ArrayBuffer[Video]()


  /** Returns all the videos published in the platform.
   *
   * @return the published videos.
   */
  def getVideos: ArrayBuffer[Video] = videos

  /** Uploads a new video to the platform.
   *
   * @param video the video being uploaded.
   */
  def addVideo(video: Video): Unit = videos += video

  /** Deletes a video on the platform.
   *
   * @param video the video being deleted.
   */
  def deleteVideo(video: Video): Unit = videos -= video

  /** Returns all the users registered in the platform.
   *
   * @return the registered users.
   */
  def getUsers: ArrayBuffer[User] = users

  /** Registers a new user in the platform.
   *
   * @param user the new user.
   */
  def addUser(user: User): Unit = users += user

  /** Deletes a user from the platform.
   *
   * @param user the user being deleted.
   */
  def deleteUser(user: User): Unit = users -= user
}
