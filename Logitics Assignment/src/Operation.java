package Demo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Operation {
	Scanner sc = new Scanner(System.in);
	Map<String, LocalTime> mp = new HashMap<>();
	String st = null;

	public void add(int n) {
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print("Enter the Destination-" + i + " : ");
				String str = sc.next();
				st = str;
				mp.put(str, LocalTime.of(0, 0));
			} else {
				System.out.print("Enter the Destination-" + i + " : ");
				String str = sc.next();
				System.out
						.print("Enter the Time taken from " + st + " to " + str + " (Enter time in Hours:Minutes) : ");
				String[] b = sc.next().split(":");
				LocalTime lt = LocalTime.of(Integer.parseInt(b[0]), Integer.parseInt(b[1]));
				mp.put(str, lt);
				st = str;
			}
		}
	}

	public void show() {
		for (Map.Entry<String, LocalTime> lt : mp.entrySet()) {
			System.out.println("Destination : " + lt.getKey() + " Time : " + lt.getValue());
		}
	}

	public LocalDateTime deliverytime(LocalDateTime lc) {
		for (Map.Entry<String,LocalTime> lt:mp.entrySet()) {
			lc = lc.plusHours(lt.getValue().getHour()).plusMinutes(lt.getValue().getMinute());
			if (lc.getDayOfWeek() == DayOfWeek.SATURDAY || lc.getDayOfWeek() == DayOfWeek.SUNDAY) {
				if (lc.getDayOfWeek() == DayOfWeek.SATURDAY) {
					lc = lc.plusHours(24).plusMinutes(0);
				}
				if (lc.getDayOfWeek() == DayOfWeek.SUNDAY) {
					lc = lc.plusHours(24).plusMinutes(0);
				}
			} else if (((lc.getMonth() == Month.JANUARY) && (lc.getDayOfMonth() == 1))
					|| ((lc.getMonth() == Month.AUGUST) && (lc.getDayOfMonth() == 15))
					|| ((lc.getMonth() == Month.JANUARY) && (lc.getDayOfMonth() == 26))
					|| ((lc.getMonth() == Month.FEBRUARY) && (lc.getDayOfMonth() == 29))) {
				lc = lc.plusHours(24).plusMinutes(0);
			}
		}
		return lc;
	}

}
