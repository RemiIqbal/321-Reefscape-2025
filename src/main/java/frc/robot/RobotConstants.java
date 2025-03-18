/* (C) Robolancers 2025 */
package frc.robot;

import static edu.wpi.first.units.Units.Seconds;

import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Rectangle2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.units.measure.Time;
import edu.wpi.first.wpilibj.TimedRobot;

public class RobotConstants {
  public static final Time kRobotLoopPeriod = Seconds.of(TimedRobot.kDefaultPeriod);

  public static final AprilTagFieldLayout kAprilTagFieldLayout =
      AprilTagFieldLayout.loadField(AprilTagFields.k2025ReefscapeWelded);
  // Coordinates of barge safety area (including pibot from center of robot)
  public static final Translation2d kBargeRightCorner = new Translation2d(10, 8);
  public static final Translation2d kBargeLeftCorner = new Translation2d(7.6, 0);
  // Creates rectangle of barge area
  public static final Rectangle2d kBargeZone = new Rectangle2d(kBargeLeftCorner, kBargeRightCorner);
}
