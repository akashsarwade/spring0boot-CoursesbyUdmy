package com.java.basic.string;

import java.util.Scanner;

public class PasswordValidator {

	private static String currentUsername = "Akash!2fhc32";
	private static String curresntPassword = "1234qwe";

	public static void main(String[] args) {

		printPasswordRules();

		Scanner sc = new Scanner(System.in);
		boolean valid;

		do {
			System.out.println("Ente the Password:");
			String proposedPass = sc.nextLine();
			valid = changePassword(proposedPass);
		} while (!valid);
		System.out.println("Proposed Password is  Valid...");
		sc.close();

	}

	public static void printPasswordRules() {
		System.out.println("Your new Password must meet with following rules:");
		System.out.println("* at leat 8 character long:");
		System.out.println("* contain an uppercase:");
		System.out.println("* contain a special character:");
		System.out.println("* not contain username:");
		System.out.println("* not same as the old password:");

	}

	public static boolean changePassword(String newPassword) {

		boolean valid = true;
		String erroMsg = "";
		if (newPassword.length() < 8) {
			valid = false;
			erroMsg = "\n your password must be at least 8 character";
		}

		// Alternative

		if (newPassword.equals(newPassword.toLowerCase())) {
			valid = false;
			erroMsg = "your password must contains uppercase letter";
		}

		if (newPassword.matches("[a-zA-Z0-9]")) {
			valid = false;
			erroMsg = "\n Your Password must contains special character eng(%,$.#,@,.)";

		}

		if (newPassword.equals(curresntPassword)) {
			valid = false;
			erroMsg = "Your new password mus be different that current password ";
		}

		if (!valid) {
			System.out.println(erroMsg);
		}
		return valid;
	}
}
