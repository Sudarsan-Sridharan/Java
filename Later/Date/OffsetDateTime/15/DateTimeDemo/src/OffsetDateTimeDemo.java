import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{
	    
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
	    String date = "2017-12-03T10:15:30+01:00";
	    
	    /*
		 * Parameters:
		 * 
		 * text - the text to parse, not null
		 * 
		 * formatter - the formatter to use, not nullReturns:the
		 * parsed offset date-time, not null
		 */
	    OffsetDateTime offsetDateTime = OffsetDateTime.parse(date, dateTimeFormatter);
	    System.out.println(offsetDateTime);
	}

}
