package frc.team7461.commands
import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj.Spark
import frc.team7461.Robot
class AutoTurnCommand : Command() {
    var finish : Boolean = false;
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

}