// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.OperatorConstants.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix6.hardware.TalonFX;


public class Drivetrain extends SubsystemBase {

  TalonSRX frontLMotor;
  TalonSRX backLMotor;
  TalonSRX frontRMotor;
  TalonSRX backRMotor;

  


  /** Creates a new Drivetrain. */
  public Drivetrain() {
    frontLMotor = new TalonSRX(KfrontLMotorID);
    backLMotor = new TalonSRX(KbackLMotorID);
    frontRMotor = new TalonSRX(KfrontRMotorID);
    backRMotor = new TalonSRX(KbackRMotorID);
  }

  public void runLeftMotorGroup(double power) {
    frontLMotor.set(ControlMode.PercentOutput, power);
    backLMotor.set(ControlMode.PercentOutput, power);
   
  }

  public void runRightMotorGroup(double power) {
    frontRMotor.set(ControlMode.PercentOutput, power);
    backRMotor.set(ControlMode.PercentOutput, power);
  }

  public void driveForward(double power) {
    runLeftMotorGroup(power);
    runRightMotorGroup(power);
  }


  public void runDifferentialDriveTrain(double leftY, double rightY) {
    double leftPower = -leftY;
    double rightPower = -rightY;
    // System.out.println(leftPower);
    // System.out.println(rightPower);

    runLeftMotorGroup(leftPower);
    runRightMotorGroup(rightPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
