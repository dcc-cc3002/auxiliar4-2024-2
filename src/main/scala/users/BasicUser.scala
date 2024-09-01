package users
import scala.collection.mutable.ArrayBuffer


class BasicUser(name: String) extends GenericUser(name) {
  private val subscriptions: ArrayBuffer[Account] = ArrayBuffer[Account]()

  def getSubscriptions=
  def subscribeTo(contentCreator: ContentCreator):Unit=contentCreator.subscribeTo(this)
}
