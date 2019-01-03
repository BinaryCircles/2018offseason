package frc.team7461.commands
import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj.Spark
import frc.team7461.Robot
import edu.wpi.first.wpilibj.PIDController
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import frc.team7461.subsystems.DrivetrainSubsystem

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;





class AutoTurnCommand : Command(), PIDOutput{

    var finish : Boolean = false
    var turnController : PIDController = PIDController(Robot.drivetrainSubsystem.kP, Robot.drivetrainSubsystem.kI, Robot.drivetrainSubsystem.kD, Robot.drivetrainSubsystem.ahrs, this)


    init {
        requires(Robot.drivetrainSubsystem)
    }
    override fun initialize()
    {
        
    }
    override fun execute()
    {

    }
    override fun isFinished() : Boolean
    {
        return finish
    }
    override fun end()
    {}
    override fun interrupted()
    {}

    override fun pidWrite(p0: Double) {

    }


}