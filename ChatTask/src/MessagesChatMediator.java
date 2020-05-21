
import java.util.ArrayList;
import java.util.List;

public class MessagesChatMediator implements ChatMediator {
	
	private List<User> users;
	
	public MessagesChatMediator() {
		this.users=new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		int userIndex = getIndexByNickname(user.nickname);
		int botIndex = getIndexByNickname("bot");
		for(int i=0;i<this.users.size();i++) {
			if(this.users.get(i)!=user) {
				if(message.equals("cat")) {
					if(i!=botIndex) {
						this.users.get(i).receive(message);
						}
					else {
						this.users.get(i).receive(message+" "+String.valueOf(userIndex)+" "+user.nickname);
					}	
				}
				else {
					this.users.get(i).receive(message);
				}
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void removeUser(int index) {
		this.users.remove(index);
	}
	
	public int getIndexByNickname(String nickname) {
		int index = -1;
		for(int i=0;i<this.users.size();i++) {
			if(this.users.get(i).nickname.equals(nickname)) {
				index = i;
			}
		}
		return index;
	}
}
