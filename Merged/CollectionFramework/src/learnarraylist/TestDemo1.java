package learnarraylist;

import java.util.HashMap;
import java.util.Map;

public class TestDemo1 {
public static void main(String[] args) {
	Map<String, String> name = new HashMap<>();
	name.put("respCoderespCode","901");
	name.put("respMsg","Request Processed.");
	name.put("processCode","215");
	name.put("instCode","UNBI");
	name.put("reqMsgId","522035583240842596");
	name.put("reqId","091545532868762039");
	
	
	for (Map.Entry<String, String> entry : name.entrySet()) {
	      System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
