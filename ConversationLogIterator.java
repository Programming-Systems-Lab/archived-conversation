package psl.conversation;

import java.util.Iterator;

/**
 * @author jg253
 */
public interface ConversationLogIterator extends Iterator {

	/**
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext();

	/**
	 * @see java.util.Iterator#next()
	 */
	public Object next();

	/**
	 * @see java.util.Iterator#remove()
	 */
	public void remove();

	/**
	 * Method next2.
	 * @return ConversationMessage
	 */
	public ConversationMessage next2();
}
