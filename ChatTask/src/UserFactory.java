
public class UserFactory extends PersonFactory {

	@Override
	public User createUser(ChatMediator mediator, String nickname) {
		User user = null;
		if(nickname.toLowerCase().equals("bot")) {
			user = new Bot(mediator,nickname);
		}
		else {
			user = new ChatUser(mediator, nickname);
		}
		return user;
	}

}
