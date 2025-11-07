	package com.collection.equalHashCode;
	
	public class EqualHashCode {
		int id;
		String name;
		int salary;
	
		public EqualHashCode(int id, String name, int salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
	
		// hashcode will not apply in primitive data type
		@Override
		public int hashCode() {
			
			
		    System.out.println("hashCode() called for " + name);
	
			String s = this.id + this.name + this.salary;
			return s.hashCode();
		}
	
		@Override
		public boolean equals(Object obj) {
		    System.out.println("equals() called for " + name);
	
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof EqualHashCode)) {
				return false;
			}
			EqualHashCode e = (EqualHashCode) obj;
			
			String s1 = this.id + this.name + this.salary;
			String s2 = e.id + e.name + e.salary;
		
			return s1.equals(s2);
		}
	
		@Override
		public String toString() {
			String s = this.id + " " + this.name + " " + this.salary;
			return s;
		}
	}
