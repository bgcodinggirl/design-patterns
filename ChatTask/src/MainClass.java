
public class MainClass {

	public static void main(String[] args) {
		ChatMediator mediator = new MessagesChatMediator();
		UserFactory userFactory = new UserFactory();

		User user1=userFactory.generateUser(mediator,"Sani");
		User user2=userFactory.generateUser(mediator,"Alex");
		User user3=userFactory.generateUser(mediator,"William");
		user1.send("addBot");
		user3.send("cat");
		user2.send("hello");
	}

}
