/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7461

import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.GenericHID
import java.math.MathContext

//import edu

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
class OI {
    var cont : XboxController = XboxController(RobotMap.drivejoystick)
    val turnConstant = 0.5

    fun getDriveSpeedRight() : Double {
        return (0.5* cont.getY(GenericHID.Hand.kLeft)) + (0.5*cont.getY(GenericHID.Hand.kLeft) * turnConstant * cont.getX(GenericHID.Hand.kRight))
    }

    fun getDriveSpeedLeft() : Double {
        return (0.5*cont.getY(GenericHID.Hand.kLeft)) - (0.5*cont.getY(GenericHID.Hand.kLeft) * turnConstant * cont.getX(GenericHID.Hand.kRight))
    }

}
