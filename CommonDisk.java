package cproject;

import java.util.Random;

public class CommonDisk {
	Random random = new Random();
	int runningTime;
	String director;
	String title;
	int capacity = random.nextInt(10)+1;
	CommonDisk(int runningTime, String director, String title, int capacity){
		this.runningTime = runningTime;
		this.director = director;
		this.title = title;
		this.capacity = capacity;
	}
}
