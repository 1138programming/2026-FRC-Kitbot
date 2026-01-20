// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.OperatorConstants.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;


public class Drivetrain extends SubsystemBase {

  TalonFX frontLMotor;
  TalonFX backLMotor;
  TalonFX frontRMotor;
  TalonFX backRMotor;


  /** Creates a new Drivetrain. */
  public Drivetrain() {
    frontLMotor = new TalonFX(KfrontLMotorID);
    backLMotor = new TalonFX(KbackLMotorID);
    frontRMotor = new TalonFX(KfrontRMotorID);
    backRMotor = new TalonFX(KbackRMotorID);
  }

  public void runLeftMotorGroup(double power) {
    frontLMotor.set(power);
    backLMotor.set(power);
  }

  public void runRightMotorGroup(double power) {
    frontRMotor.set(power);
    backRMotor.set(power);
  }

  public void driveForward(double power) {
    runLeftMotorGroup(power);
    runRightMotorGroup(power);
  }


  public void runDifferentialDriveTrain(double leftY, double rightY) {
    double leftPower = leftY;
    double rightPower = rightY;
    System.out.println(leftPower);
    System.out.println(rightPower);

    runLeftMotorGroup(leftPower);
    runRightMotorGroup(rightPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
