package AmazonOA2021CustomerReview;

/*
Amazon is building a way to help customers search reviews quicker by providing real-0time suggestions to search terms
when the customer starts typing. When given a minimum of two characters into the search field the system will suggest at most three keywords
from the review word repository. As the customer continues to type in the reviews search bar the relevant keyword suggestions will update automatically.

Write an algorithm that will output a maximum of three keyword suggestions after each character is typed by the customer in the search field.

If there are more than three acceptable keywords, return the keywords that are first in alphabetical order.
Only return keyword suggestions afte the customer has entered two characters.
Keyword suggestions must start with the characters already typed.
Both the repository and the customerQuery should be compared in a case-insensitive way.

Input:
The input to the method/function consists of two arguments:
repository, a list of unique strings representing the various keywords from the Amazon review comment section;
customerQuery, a string representing the full search query of the customer.

Output:
Return a list of a list of strings in lower case, where each list represents the keyword suggestions made by the system as the customer types each character of the customerQuery.
Assume the customer types characters in order without deleting or removing any characters. If an output is not possible, return an empty array ([]).

Example:
Input:
repository = ["mobile", "mouse", "moneypot", "monitor", "mousepad"]
customerQuery = "mouse"

Output:
["mobile", "moneypot", "monitor"]
["mouse", "mousepad"]
["mouse", "mousepad"]
["mouse", "mousepad"]

Explanation:
The chain of words that will generate in the search box will be mo, mou, mous, mouse and each line from output shows the suggestion of
"mo", "mou", "mous", "mouse", respectively in each line.
For the keyword suggestions made by the system that are generated for 'mo', the atches that will be generated are: ["mobile", "mouse", "moneypot", "monitor", "mousepad"]
Alphabetically, they will be reordered to ["mobile", "moneypot", "monitor", "mouse", "mousepad"].
Thus the keyword suggestions made by the system are ["mobile", "moneypot", "monitor"].
 */
public class Main {
}
