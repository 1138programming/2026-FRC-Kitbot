// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;
import static frc.robot.Constants.OperatorConstants.*;


public class Indexer extends SubsystemBase {
  TalonFX indexer;
  /** Creates a new Indexer. */
  public Indexer() {
    indexer = new TalonFX(KindexerID);
  }

  public void runIndex(double power) {
    indexer.set(power);
  }
    
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
