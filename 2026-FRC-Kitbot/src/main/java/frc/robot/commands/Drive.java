// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

import static frc.robot.Constants.OperatorConstants.kDEADZONE;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class Drive extends Command {
  /** Creates a new Drive. */
  Drivetrain drivetrain;
  

  public Drive(Drivetrain drive) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drivetrain = drive;
    addRequirements(drive);
  }

  public double applyDeadZone(double input) {
    if (Math.abs(input - 0.5) >= kDEADZONE) {
      return input;
    }
    return 0.0;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftY = Robot.m_robotContainer.getLeftY();
    double rightY = Robot.m_robotContainer.getRightY();
    
    drivetrain.runDifferentialDriveTrain(leftY, rightY);
    // System.out.println("Running Execute");
  }

  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
