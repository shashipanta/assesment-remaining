package com.assignment2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Set;
import java.util.TimeZone;

public class DateTimeConverter {
	
public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
public static final ZoneId systemZoneId = ZoneId.systemDefault();

	
	public static LocalDateTime toUTC(LocalDateTime localDateTime) {
		
		ZonedDateTime localZonedDateTime = localDateTime.atZone(systemZoneId);
		ZonedDateTime utcZonedDateTime = localZonedDateTime.withZoneSameInstant(systemZoneId);
		return utcZonedDateTime.toLocalDateTime();
	}
	
	public static void main(String[] args) {
//		Calendar
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
		
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		LocalDateTime localDateTime = LocalDateTime.now();
		
		LocalDateTime utcDateTime = LocalDateTime.now(ZoneOffset.UTC);
		ZonedDateTime utcZonedDateTime = utcDateTime.atZone(ZoneOffset.UTC);
		ZonedDateTime localZonedDateTime = utcZonedDateTime.withZoneSameInstant(ZoneId.systemDefault());
		LocalDateTime currentTime = localZonedDateTime.toLocalDateTime();
		
		
		System.out.println("UTC time : " + utcDateTime.format(dateTimeFormatter));
		System.out.println("UTC Zone : " + utcZonedDateTime.format(dateTimeFormatter));
		System.out.println("local Zone : " + localZonedDateTime.format(dateTimeFormatter));
		System.out.println("Current Date time : " + currentTime);
		
		System.out.println("Local Time : " + localDateTime.toLocalDate() + localDateTime.toLocalTime());		
		System.out.println("UTC time : " + toUTC(localDateTime));

	}

}
