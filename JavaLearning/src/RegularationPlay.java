import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularationPlay {
	  public static void main(String[] args) {
		    Pattern pattern = Pattern.compile("JackeyLove", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("JackeyLove");
		    Matcher matcherNew = pattern.matcher("JackeyLoveAS");
		    boolean matchFound = matcher.find();
		    boolean matchNewFound = matcherNew.find();

		    if(matchFound) {
		    	System.out.println("Match found");
		    	if(matchNewFound) {
		    		System.out.println("Match New found");
		    	}		      
		    } else {
		      System.out.println("Match not found");
		    }
		  }
		}