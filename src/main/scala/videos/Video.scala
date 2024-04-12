package videos

import users.{ContentCreator, User}

import scala.collection.mutable.ArrayBuffer

/**
 * This class represents a video.
 *
 * @param creator this video's creator.
 */
class Video(creator: ContentCreator) {

  private var likes: Set[User] = Set[User]()
  private val comments: ArrayBuffer[(User, String)] = new ArrayBuffer[(User, String)]()

  /** Returns the amount of likes this video has been given.
   *
   * @return the total amount of likes.
   */
  def getLikes: Int = likes.size

  /** Gives this video a like, only if the user hasn't liked it already.
   *
   * @param user the user liking this video.
   */
  def like(user: User): Unit = likes += user

  /** Returns the list of comments given to this video. The list contains a tuple,
   * where the first parameter is the user who's commenting, and the second
   * parameter is the comment given by the user.
   *
   * @return this video's comments.
   */
  def getComments: ArrayBuffer[(User, String)] = comments

  /** Adds a new comment to this video.
   *
   * @param user the user commenting.
   * @param comment the comment given by the user.
   */
  def addComment(user: User, comment: String): Unit = comments += Tuple2(user, comment)

  /** Returns the video's creator.
   *
   * @return this video's creator.
   */
  def getCreator: ContentCreator = creator
}