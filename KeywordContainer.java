package psl.conversation;

import java.util.ArrayList;

/**
 * @author jg253
 */
public class KeywordContainer {
	
	private ArrayList _keywords;
	private SuggestionManagerKeywordCallback _smkc;
	
	public KeywordContainer(SuggestionManagerKeywordCallback smkc) {
		_keywords = new ArrayList();
		_smkc = smkc;
	}
	
	public void add(Keyword s) {
		_keywords.add(s);
		System.out.println("KEYWORD_CONTAINER: ADD " + s.getWord());
	}
	
	public int size() {
		return _keywords.size();
	}
	
	public Keyword get(int i) {
		return (Keyword) _keywords.get(i);
	}
	
	public void close() {
		_smkc.signal(this);
	}
}