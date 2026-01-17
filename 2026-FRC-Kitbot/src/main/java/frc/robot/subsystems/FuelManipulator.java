// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkLowLevel.*;
import static frc.robot.Constants.OperatorConstants.*;


public class FuelManipulator extends SubsystemBase {

  SparkMax conveyerMotorOne;
  SparkMax conveyerMotorTwo;

  /** Creates a new Intake. */
  public FuelManipulator() {
    conveyerMotorOne = new SparkMax(KintakeMotorID, MotorType.kBrushed);
    conveyerMotorTwo = new SparkMax(KintakeMotorID, MotorType.kBrushed);
  }

  public void runIntake(double power) {
    conveyerMotorOne.set(power);
    conveyerMotorTwo.set(power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
