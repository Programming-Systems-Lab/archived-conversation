
package psl.conversation.keywords2;

import psl.conversation.ConversationLogIterator;
import psl.conversation.ConversationMessage;
import psl.conversation.User;

/**
 * Singleton. 
 */
public class TestDataGenerator {
	private static TestDataGenerator gen = null;
	/**
	 * Constructor for TestDataGenerator.
	 */
	private TestDataGenerator() {
	}
	
	public static TestDataGenerator getInstance() {
		if(gen == null) {
			gen = new TestDataGenerator();
		}
		return gen;
	}

	public ConversationLogIterator getConversation()
	{
		implConLogIterator it = new implConLogIterator();
		User dummyUser = new User();
		it.addMessage(new ConversationMessage(dummyUser, "British Sugar Plc was forced to shut its Ipswich sugar factory on Sunday " +
			"afternoon due to an acute shortage of beet supplies, a spokesman said, responding to a Reuter inquiry " +
    		"Beet supplies have dried up at Ipswich due to a combination " +
			"of very wet weather, which has prevented most farmers in the " +
			"factory's catchment area from harvesting, and last week's " +
			"hurricane which blocked roads.The Ipswich factory will remain closed until roads are " + 
			"cleared and supplies of beet build up again.This is the first time in many years that a factory has " +
			"been closed in mid-campaign, the spokesman added. Other factories are continuing to process beet normally, " +
			"but harvesting remains very difficult in most areas. Ipswich is one of 13 sugar factories operated by British " +
			"Sugar. It processes in excess of 500,000 tonnes of beet a year out of an annual beet crop of around eight mln tonnes. " +
    		"Despite the closure of Ipswich and the severe harvesting problems in other factory areas, British Sugar is maintaining " +
			"its estimate of sugar production this campaign at around 1.2 mln tonnes, white value, against 1.34 mln last year, the " +
			"spokesman said.    British Sugar processes all sugar beet grown in the U.K.The sugar beet processing campaign, which began last month, " +
			"is expected to run until the end of January. Sugar factories normally work 24 hours a day, seven days a week during the " +
			"campaign. As of October 11, 12 pct of the U.K. Sugar crop had been harvested, little different to the same stage last year when 13 " +
			"pct had been lifted. Since then, however, very wet weather has severely restricted beet lifting. Harvesting figures for the week to October 18 are not yet " +
			"available. Reuter "));
		it.addMessage(new ConversationMessage(dummyUser, "A sharp rise in Soviet sugar consumption " +
		it.addMessage(new ConversationMessage(dummyUser, "sugar sugar sugar sugar sugar"));
		return it; 
	}
}