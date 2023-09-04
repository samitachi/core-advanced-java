package learnarraylist;

import java.util.HashMap;
import java.util.Map;

public class TestDemo3 {
	public static void main(String[] args) {
		Map<String, Object> outer1 = new HashMap<>();
		Map<String, Object> outer11 = new HashMap<>();
		Map<String, Object> outer12 = new HashMap<>();
		Map<String, Object> outer13 = new HashMap<>();
		Map<String, Object> outer14 = new HashMap<>();
		Map<String, Object> outer15 = new HashMap<>();

		Map<String, Object> inner1 = new HashMap<>();
		Map<String, Object> inner11 = new HashMap<>();
		Map<String, Object> inner111 = new HashMap<>();
		
		
		
		
		Map<String, String> inner111 = new HashMap<>();
		inner111.put("uid", "123454333");
		inner111.put("rc", "Y");
		
		
		Map<String, String> inner111 = new HashMap<>();
		inner111.put("encodedValue", "abcd3");
		inner111.put("type", "X");
		
		Map<String, String> inner112 = new HashMap<>();
		inner131.put("mc", "");
		inner131.put("dpId", "");
		inner131.put("rdsId", "");
		inner131.put("mi", "");
		inner131.put("rdsVer", "");
		inner131.put("dc", "");
		
		Map<String, String> inner141 = new HashMap<>();
		inner141.put("encodedSk", "abcd2");
		inner141.put("ci", "20201030");
		
		Map<String, String> inner151 = new HashMap<>();
		inner151.put("otp", "Y");
		
		
		
		
		
		outer11.put("auth", inner111);
		outer12.put("data", inner121);
		outer13.put("meta", inner131);
		outer14.put("skey", inner141);
		outer15.put("uses", inner151);
1
		
		
		
		
		
		
		Map<String,String> inner2 =new HashMap<>();
		

		outer1.put("kycReqInfo", inner1);
		outer1.put("transactioninfo", inner2);
		

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
