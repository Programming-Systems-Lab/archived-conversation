package psl.conversation;

/**
 * @author jg253
 */
public interface KeywordFinder extends Runnable {
	
	/**
	 * Start the underlying analysis algorithm.
	 * 
	 * @param xmlc Contains an implementation of XMLContainer with the
	 * parameters for a particular KeywordFinder implementation
	 * @throws Exception If the XMLContainer is not of the correct type for this
	 * KeywordFinder implementation
	 */
	public void start(XMLContainer xmlc, ConversationLogIterator cli) throws Exception;
	
	/**
	 * For some algorithms, the concept of a "reset" is useful. This forces the
	 * underlying implementation to ignore all information prior to the reset.
	 * This can be thought of as a restart where the algorithm's config remains
	 * unchanged.
	 */
	public void reset();
	
	/**
	 * Same as reset() except we load up the algorithm with a different
	 * configuration.
	 * 
	 * @param xmlc Contains an implementation of XMLContainer with the
	 * parameters for a particular KeywordFinder implementation
	 * @throws Exception If the XMLContainer is not of the correct type for this
	 * KeywordFinder implementation
	 */
	public void reset(XMLContainer xmlc) throws Exception;
	
	/**
	 * This signals the analysis algorithm for the most recent keywords.
	 * 
	 * @param kc
	 * @throws Exception
	 */
	public void signal(KeywordContainer kc) throws Exception;
}