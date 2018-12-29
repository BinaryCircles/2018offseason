package frc.team7461.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import frc.team7461.RobotMap
import frc.team7461.Robot


class DrivetrainSubsystem : Subsystem() {



    var RBMotor : WPI_TalonSRX = WPI_TalonSRX(RobotMap.RBMotor)
    var RFMotor : WPI_TalonSRX = WPI_TalonSRX(RobotMap.RFMotor)
    var LFMotor : WPI_TalonSRX = WPI_TalonSRX(RobotMap.LFMotor)
    var LBMotor : WPI_TalonSRX = WPI_TalonSRX(RobotMap.LBMotor)

    init {
        LBMotor.follow(LFMotor)
        RBMotor.follow(RFMotor)

    }


    var drive : DifferentialDrive = DifferentialDrive(RFMotor, LFMotor)



    public fun curveDrive(left: Double, right: Double) {
        drive.tankDrive(left, right)

    }

    public override fun initDefaultCommand() {

    }
}
