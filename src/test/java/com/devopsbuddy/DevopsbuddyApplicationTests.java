package com.devopsbuddy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devopsbuddy.web.i18n.I18NService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

	@Autowired I18NService i18NService;
	
	@Test
	public void testMessageByLocalService() {
		String expectedResult = "Bootstrap starter template";
		String actual = i18NService.getMessage("index.main.callout");
		System.out.println("actual " + actual);
		assertEquals("The actual and expected strings doesnt match", expectedResult, actual);
	}

}
