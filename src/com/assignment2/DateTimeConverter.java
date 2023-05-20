package com.assignment2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeConverter {
	
public static final ZoneId systemZoneId = ZoneId.systemDefault();
public static final ZoneId UTCZoneId = ZoneId.of("UTC");
private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	
	public static LocalDateTime toUTC(LocalDateTime localDateTime) {
		
		ZonedDateTime localZonedDateTime = localDateTime.atZone(systemZoneId);
		ZonedDateTime utcZonedDateTime = localZonedDateTime.withZoneSameInstant(UTCZoneId);
		return utcZonedDateTime.toLocalDateTime();
	}
	
	public static LocalDateTime toLocal(LocalDateTime utcDateTime) {
		
		ZonedDateTime utcZonedDateTime = utcDateTime.atZone(UTCZoneId);
		ZonedDateTime localZonedDateTime = utcZonedDateTime.withZoneSameInstant(systemZoneId);
		return localZonedDateTime.toLocalDateTime();
	}
	
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime utcLocalDateTime = LocalDateTime.now(UTCZoneId);

		System.out.println("Local Date Time      : " + ldt.format(formatter));
		System.out.println("Into UTC Date Time   : " + toUTC(ldt).format(formatter));
		
		System.out.println();

		System.out.println("UTC Date Time        : " + utcLocalDateTime.format(formatter));
		System.out.println("Into Local Date Time : " + toLocal(utcLocalDateTime).format(formatter));
		

	}

}
