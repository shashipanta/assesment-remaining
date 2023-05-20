package timer;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class ConsoleTimer {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
			
		long twoMinuteInMilliSeconds = 2 * 60 * 1000; 
		
		TimerTask loggingTask = new TimerTask() {
			
			@Override
			public void run() {
				int lt = LocalTime.now().getMinute();
				System.out.println("Time : " + lt);
				
			}
		};
		
		timer.schedule(loggingTask,0, twoMinuteInMilliSeconds);
		
	}
}
