package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void canGetWhiskeyByYear(){
//		List<Whisky> whiskeyYear = whiskyRepository.findByYear(1995);
//		assertEquals(1,whiskeyYear.size());
//
//	}
}
