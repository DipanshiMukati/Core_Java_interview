package com.collection.equalHashCode;
public class EqualHashCodeTest {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(1, "kapil", 120);
		EqualHashCode e2 = new EqualHashCode(1, "kapil", 120);

		if (e1.equals(e2)) {
			if (e1.hashCode() == e2.hashCode()) {
				System.out.println("Equals");
			}
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
	}
}
//" Jab Set me e1 add hota hai aur phir e2 add karte hain, Set pehle hashCode check karta hai 
//aur phir equals() se compare karta hai. Agar dono same hain,
//to Set duplicate samajh ke e2 ko add nahi karta."

