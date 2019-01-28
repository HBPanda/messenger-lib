
import java.util.List;

public abstract class StorageProvider {
	private List<Message> messages;
	
	public boolean save(Message message) {
		return true;
	}
	
	public List<Message> retrieveAll(){
		return messages;
	}
	
}
