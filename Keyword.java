package psl.conversation;

/**
 * @author jg253
 */
public class Keyword {
	
	private Context _context;
	private String word; // <-- Add this because it seems like the Keyword object should contain a keyword.
	
	public Keyword(Context c) {
		_context = c;
	}
	
	public Keyword(String k, Context c) {
		_context = c;
		word = k;
	}
	
	public void changeContext(Context c) {
		_context = c;
	}
	
	public Context getContext() {
		return _context;
	}
	/**
	 * Returns the word.
	 * @return String
	 */
	public String getWord() {
		return word;
	}

	/**
	 * Sets the word.
	 * @param word The word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

}