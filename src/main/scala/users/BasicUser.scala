package users
import scala.collection.mutable.ArrayBuffer


class BasicUser(name: String) extends GenericUser(name) {
  private val subscriptions: ArrayBuffer[Account] = ArrayBuffer[Account]()

  def getSubscriptions: ArrayBuffer[Account]=subscriptions
  def subscribeTo(contentCreator: ContentCreator):Unit=contentCreator.subscribeTo(this)
}
