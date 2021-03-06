package org.usfirst.frc.team1619.robot.framework.util;

public class Timer {

	private long startTime = -1;
	private long time;

	public void start(int time) {
		this.time = time;
		this.startTime = System.currentTimeMillis();
	}

	public void reset() {
		this.startTime = -1;
	}

	public boolean isStarted() {
		return this.startTime > -1;
	}

	public boolean isDone() {
		return startTime != -1 && System.currentTimeMillis() - startTime >= time;
	}

}
