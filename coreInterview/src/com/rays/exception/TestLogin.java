
package com.rays.exception;

public class TestLogin {
	public void login(String userName, String pass) throws LoginExceptionn {
		String currectUN = "lokesh";
		String currectP = "1122";

//		if (!currectUN.equals(userName)) {
//			throw new LoginExceptionn("invalid User");
//		}
//		if (!currectP.equals(pass)) {
//			throw new LoginExceptionn("invalid Pass");
//		}
//		if(!currectUN.equals(userName)||!currectP.equals(pass)) {
//			throw new LoginExceptionn("invalid username and password");
//		}
//	}
		
		 if (!currectUN.equals(userName) && !currectP.equals(pass)) {
	            throw new LoginExceptionn("Invalid username and password");
	        } else if (!currectUN.equals(userName)) {
	            throw new LoginExceptionn("Invalid username");
	        } else if (!currectP.equals(pass)) {
	            throw new LoginExceptionn("Invalid password");
	        }
	    }

	public static void main(String[] args) {
		TestLogin l = new TestLogin();
		try {
			l.login("lokesh", "1122");
			System.out.println("valid user");
		} catch (LoginExceptionn e) {
			System.out.println(e.getMessage());
		}
	}
}
