package org.usfirst.frc.team1619.robot.states.Hopper;

import org.usfirst.frc.team1619.robot.Constants;
import org.usfirst.frc.team1619.robot.IO;
import org.usfirst.frc.team1619.robot.framework.state.State;
import org.usfirst.frc.team1619.robot.framework.state.StateWrapper;

public class HopperManual extends State {

	public static StateWrapper<HopperManual> WRAPPER = new StateWrapper<HopperManual>(HopperManual.class) {

		@Override
		public boolean isReady() {
			return true;
		}

	};

	@Override
	protected void update() {
		if (in.getBoolean(IO.DRIVER_BUTTONS[Constants.DRIVER_BUTTON_HOPPER_FORWARD])) {
			out.motors.set(IO.HOPPER, 1.0);
		}
		else if (in.getBoolean(IO.DRIVER_BUTTONS[Constants.DRIVER_BUTTON_HOPPER_REVERSE])) {
			out.motors.set(IO.HOPPER, -1.0);
		}
	}

	@Override
	protected boolean isDone() {
		return false;
	}

}
