// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants.*;
import frc.robot.commands.Autos;
import frc.robot.commands.Drive;
import frc.robot.commands.FuelCommand;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.FuelManipulator;

import static frc.robot.Constants.OperatorConstants.*;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drivetrain drivetrain = new Drivetrain();
  private final FuelManipulator manipulator = new FuelManipulator();
  
  private final CommandXboxController driveController = new CommandXboxController(kDriverControllerPort);
  private final CommandXboxController operatorController = new CommandXboxController(kOperatorControllerPort);

  private final Drive drive = new Drive(drivetrain);
  private final FuelCommand fuelMove = new FuelCommand(manipulator, operatorController, kIntakePower);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */

  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    // new Trigger(drivetrain::exampleCondition)
    //     .onTrue(new ExampleCommand(drivetrain));

    // // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // // cancelling on release.
    //m_driverController.b().whileTrue(drivetrain.exampleMAuethodCommand());
    operatorController.b().whileTrue(fuelMove);
    drivetrain.setDefaultCommand(drive);
  }

  public double getLeftY() {
    return driveController.getLeftY();
  }

  public double getRightY() {
    return driveController.getRightY();
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    // return Autos.exampleAuto(drivetrain);
    return new Command() {
      
    };
  }
}
