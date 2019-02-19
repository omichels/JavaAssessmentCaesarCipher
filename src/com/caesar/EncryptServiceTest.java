package com.caesar;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncryptServiceTest {

	@Test
	public void testEncryption() {
		EncryptService svc = new EncryptService();

		assertEquals("shifts 3 chars", "D", svc.encryptData("A"));
		assertEquals("shifts 3 chars and uppercase", "D", svc.encryptData("a"));
		assertEquals("shifts 3 chars", "DEFGH", svc.encryptData("ABCDE"));
		assertEquals("wraps around at end of alphabet", "XYZABC", svc.encryptData("uvwxyz"));

	}

}
