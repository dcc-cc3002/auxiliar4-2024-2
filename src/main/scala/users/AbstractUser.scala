package users

class AbstractUser(username: String) extends AbstractAccount(username) with User {

  private var subscriptions: Set[ContentCreator] = Set[ContentCreator]()

  def getSubscriptions: Set[ContentCreator] = subscriptions

  def subscribeTo(creator: ContentCreator): Unit = {
    subscriptions += creator
    creator.addSubscriber(this)
  }
}
