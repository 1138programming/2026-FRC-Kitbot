// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.OperatorConstants.*;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase; 
import com.revrobotics.spark.SparkLowLevel.*;


public class Drivetrain extends SubsystemBase {

  SparkMax frontLMotor;
  SparkMax backLMotor;
  SparkMax frontRMotor;
  SparkMax backRMotor;


  /** Creates a new Drivetrain. */
  public Drivetrain() {
    frontLMotor = new SparkMax(KfrontLMotorID, MotorType.kBrushed);
    backLMotor = new SparkMax(KbackLMotorID, MotorType.kBrushed);
    frontRMotor = new SparkMax(KfrontRMotorID, MotorType.kBrushed);
    backRMotor = new SparkMax(KbackRMotorID, MotorType.kBrushed);
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

  private double convertInputToPower(double input) {
    return (input - 0.5) * 2;

  }

  public void runDifferentialDriveTrain(double leftY, double rightY) {
    double leftPower = convertInputToPower(leftY);
    double rightPower = convertInputToPower(rightY);

    runLeftMotorGroup(leftPower);
    runRightMotorGroup(rightPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
