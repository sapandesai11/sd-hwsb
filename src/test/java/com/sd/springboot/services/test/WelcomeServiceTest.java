/**
 * 
 */
package com.sd.springboot.services.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sd.springboot.services.WelcomeService;

/**
 * @author SD
 *
 */
public class WelcomeServiceTest {

	private WelcomeService welcomeService;
	
	@Before
	public void initAll() {
		//welcomeService = new WelcomeService();
	}
	@Test
    public void getWelcomeMessageTest() {
        assertEquals("Good Evening...!!", welcomeService.getWelcomeMessage());
    }
}
