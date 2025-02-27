/* (C) Robolancers 2025 */
package frc.robot.subsystems.algaeIntakePivot;

import static edu.wpi.first.units.Units.Degrees;
import static edu.wpi.first.units.Units.Meters;
import static edu.wpi.first.units.Units.Volts;

import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.Voltage;

@Logged
public class AlgaeIntakePivotConstants {
  // TODO: get all these constants

  // motor, encoder, sensor IDs
  public static final int kPivotMotorLeftId = 0;
  public static final int kPivotMotorRightId = 0;
  public static final int kEncoderId = 0;

  // setpoint constants
  public static final Angle kPivotIntakeAngle = Degrees.of(80); // test
  public static final Angle kPivotOuttakeAngle = Degrees.of(90); // test
  public static final Angle kPivotStoreAngle =
      Degrees.of(70); // the angle the pivot will be at by default
  public static final Angle kPivotClimbAngle = Degrees.of(135); // test
  public static final Angle kPivotFloorAngle = Degrees.of(0); // test
  public static final Voltage kPivotClimbVoltage = Volts.of(8); // test

  // motor configurations
  public static final boolean kLeftInverted = false;
  public static final boolean kRightInverted = false;
  public static final int kSmartCurrentLimit = 40;
  public static final double kPivotVelocityConversionFactor = 2; // ask mech
  public static final double kPivotPositionConversionFactor = 120; // ask mech
  public static final Voltage kNominalVoltage = Volts.of(12);

  // physical constants
  public static final double kPivotGearing = 50; // ask mech
  public static final Distance kPivotLength = Meters.of(0.6); // ask CAD
  public static final Angle kPivotMinAngle = Degrees.of(0); // find
  public static final Angle kPivotMaxAngle = Degrees.of(180); // find
  public static final Angle kPivotStartingAngle = Degrees.of(0); // find
  public static final double kPivotMOI = 1; // ask stanley
  public static final Angle kPivotZeroOffsetAngle = Degrees.of(0); // find
}
