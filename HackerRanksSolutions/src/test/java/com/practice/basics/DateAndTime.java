package com.practice.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.testng.annotations.Test;

public class DateAndTime {
	@Test
	public void getDayDemo() {

		LocalDate ld=LocalDate.of(2015, 8, 5);
		ld.getDayOfWeek().getValue();
	}

}
