
public class ChatUser extends User {

	UserFactory userFactory = new UserFactory();
	
	public ChatUser(ChatMediator mediator, String nickname) {
		super(mediator, nickname);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.nickname+" says "+message);
		mediator.sendMessage(message, this);
		if(message.equals("addBot")) {
			mediator.addUser(userFactory.generateUser(mediator, "bot"));
		}
	}

	@Override
	public void receive(String message) {
		System.out.println(this.nickname+" received "+message);
	}

	@Override
	public void create() {
		System.out.println("New chat user is created!");
	}

}
