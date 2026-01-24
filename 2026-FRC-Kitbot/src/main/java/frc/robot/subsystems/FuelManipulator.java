// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import static frc.robot.Constants.OperatorConstants.*;


public class FuelManipulator extends SubsystemBase {

  TalonSRX conveyerMotorOne;

  /** Creates a new Intake. */
  public FuelManipulator() {
    conveyerMotorOne = new TalonSRX(KintakeMotorOneID);
  }

  public void runIntake(double power) {
    conveyerMotorOne.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
