package psl.conversation;
/**
 * @author jg253
 */
public class ConversationMessage {

	private User _sender;

	private String _message;
	
	/**
	 * CTOR
	 * @param sender
	 * @param message
	 */
	public ConversationMessage(User sender, String message) {
		_sender = sender;
		_message = message;
	}
	
	/**
	 * Method getUser.
	 * @return User
	 */
	public User getUser() {
		return _sender;
	}
	
	/**
	 * Method getMessage.
	 * @return String
	 */
	public String getMessage() {
		return _message;
	}
}
