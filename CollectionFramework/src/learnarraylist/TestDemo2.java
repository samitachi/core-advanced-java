package learnarraylist;

import java.util.HashMap;
import java.util.Map;

public class TestDemo2 {
	public static void main(String[] args) {
		Map<String, Object> outer = new HashMap<>();

		Map<String, String> inner = new HashMap<>();
		inner.put("caTid", "register");
		inner.put("caTa", "abcd1");
		inner.put("caId", "abcd");
		inner.put("posCode", "05");
		inner.put("posEntryMode", "019");
		inner.put("mcc", "6012");

		outer.put("transactioninfo", inner);

//		for (Map.Entry<String, Map<String, String>> entry : outer.entrySet()) {
//            System.out.println("Key: " + entry.getKey());
//            Map<String, String> innerMap = entry.getValue();
//            for (Map.Entry<String, String> innerEntry : innerMap.entrySet()) {
//                System.out.println(innerEntry.getKey() + ": " + innerEntry.getValue());
//            }
//        }
		
		System.out.println(outer);
    }
}