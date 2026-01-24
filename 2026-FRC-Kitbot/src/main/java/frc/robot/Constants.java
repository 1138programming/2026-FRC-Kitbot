// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int KLogitechPort = 0;
    public static final int kOperatorControllerPort = 1;

    public static final double kDEADZONE = 0.05;

    public static final int KfrontLMotorID = 4;
    public static final int KbackLMotorID = 10;
    public static final int KfrontRMotorID = 5;
    public static final int KbackRMotorID = 1;

    public static final int KintakeMotorOneID = 3;
    public static final int KindexerID = 2;

    public static final double kIntakePowerIn = 0.55;
    public static final double kIntakePowerOut = 1.0;
    public static final double kIndexPowerIn = 1.0;
    public static final double kIndexPowerOut = -1.0;

    public static final int KLogitechButtonX = 1;
    public static final int KLogitechButtonA = 2;
    public static final int KLogitechButtonB = 3;
    public static final int KLogitechButtonY = 4;
    public static final int KLogitechLeftBumper = 5;
    public static final int KLogitechRightBumper = 6;
    public static final int KLogitechLeftTrigger = 7;
    public static final int KLogitechRightTrigger = 8;
    public static final int KLogitechBtnBack = 9;
    public static final int KLogitechRightStart = 10;
    public static final int KLogitechDPADUp = 11;
  }
}
