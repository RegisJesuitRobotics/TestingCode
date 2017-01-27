package org.usfirst.frc.team3729.robot.commands;

import edu.wpi.first.wpilibj.Talon;

public class motorCommand {

	Talon shootingMotor1, shootingMotor2;
	XboxControler _xbox;
	double x;
	
	public motorCommand(XboxControler xbox) {
		x = 0.5;
		shootingMotor1 = new Talon(0);
		//shootingMotor2 = new Talon(1);
		this._xbox = xbox;
	}
	
	public void motorFloop(){
		if(_xbox.GetA() == true && x < 1){
			x = x + 0.05;
		}
		if(_xbox.GetB() == true && x > 0){
			x = x - 0.05;
		}
		if(_xbox.GetX() == true){
			shootingMotor1.set(x);
			//shootingMotor2.set(x);
			
			//X needs to be a value between 0 and 1
			//Increase it by hitting A and decrease it with B
			
		}
	}
}
