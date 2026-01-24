// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.OperatorConstants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class Indexer extends SubsystemBase {
  TalonSRX indexer;
  /** Creates a new Indexer. */
  public Indexer() {
    indexer = new TalonSRX(KindexerID);
  }

  public void runIndex(double power) {
    indexer.set(ControlMode.PercentOutput,power);
  }
    
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
