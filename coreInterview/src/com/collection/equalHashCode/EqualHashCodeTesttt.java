
package com.collection.equalHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EqualHashCodeTesttt {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(1, "lokesh", 120);
		EqualHashCode e2 = new EqualHashCode(1, "lokesh", 120);
		EqualHashCode e3 = new EqualHashCode(1, "lokesh", 120);
		EqualHashCode e4 = new EqualHashCode(10, "lokesh", 120);
//
//		Set s = new HashSet();
//		s.add(e1);
//		s.add(e2);
//		s.add(e4);
//		System.out.println(s);
//		s.remove(e1);
//		System.out.println("afterremove" + s);
//		System.out.println(s.remove(e2));
//		System.out.println(s);
	 	System.out.println("------------------------------------------------------------------------");
//      " Jab Set me e1 add hota hai aur phir e2 add karte hain, Set pehle hashCode check karta hai 
//		aur phir equals() se compare karta hai. Agar dono same hain,
//		to Set duplicate samajh ke e2 ko add nahi karta."

	 			Map m = new HashMap<>();
		m.put(1, e1);
		m.put(2, e2);
		m.put(1, e3);
		System.out.println(m);
		m.remove(e3);
		System.out.println("afterremove" + m);
//		Map me hashCode() aur equals() sirf key ke liye check hota hai,
//		value ke liye nahi.
//		Isliye remove(e3) (value) kuch nahi hatata.
		System.out.println("-------------------------List-----------------------------------------------");

//		List list = new ArrayList();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		list.add(e4);
//		System.out.println(list);

//	}
//
//}
	}
}
