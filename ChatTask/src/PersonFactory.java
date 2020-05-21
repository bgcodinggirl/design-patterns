
public abstract class PersonFactory {
	public abstract User createUser(ChatMediator mediator, String nickname);
	public User generateUser(ChatMediator mediator, String nickname){
		User user = createUser(mediator, nickname);
		user.create();
		return user;
	}
}
