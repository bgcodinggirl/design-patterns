
public class Bot extends User {

	public Bot(ChatMediator mediator, String nickname) {
		super(mediator, nickname);
	}

	@Override
	public void send(String message) {
		
	}

	@Override
	public void receive(String message) {
		if(message.contains("cat")){
			String[] parts=message.split(" ");
			int i = Integer.valueOf(parts[1]);
			mediator.removeUser(i);
			mediator.sendMessage("The user with nickname "+parts[2]+" was removed from the chat room.", this);
			String banMessage = "a message from "+nickname+": The word cat is banned in this chat!!!";
			mediator.sendMessage(banMessage, this);
		}
	}

	@Override
	public void create() {
		System.out.println("A bot is created!");
	}

}
