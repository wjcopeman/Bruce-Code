package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{

    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    /**
     * From this point forward DriveStick shall refer to the Driver's joystick,
     * and GunStick shall refer to the Button Monkey's joystick. This is not
     * necessarily final terminology, but for the point of this coding, it will
     * work. --Gabe
     */
    private final Joystick DriveStick = new Joystick(1); //X & Y is drive control
    private final Button DB1 = new JoystickButton(DriveStick, 1), //NOT 180 turn
	    DB2 = new JoystickButton(DriveStick, 2), //Shift up
	    DB3 = new JoystickButton(DriveStick, 3), //Shift down
	    DB4 = new JoystickButton(DriveStick, 4), //NOT 90 left
	    DB5 = new JoystickButton(DriveStick, 5), //NOT 90 right
	    DB6 = new JoystickButton(DriveStick, 6),
	    DB7 = new JoystickButton(DriveStick, 7),
	    DB8 = new JoystickButton(DriveStick, 8),
	    DB9 = new JoystickButton(DriveStick, 9),
	    DB10 = new JoystickButton(DriveStick, 10),
	    DB11 = new JoystickButton(DriveStick, 11);

    private final Joystick GunStick = new Joystick(2);//+ Y lowers Jaw, - Y raises
    private final Button GB1 = new JoystickButton(GunStick, 1), //Fire
	    GB2 = new JoystickButton(GunStick, 2), //Dump
	    GB3 = new JoystickButton(GunStick, 3), //Load
	    GB4 = new JoystickButton(GunStick, 4),
	    GB5 = new JoystickButton(GunStick, 5),
	    GB6 = new JoystickButton(GunStick, 6), //Jaw Up
	    GB7 = new JoystickButton(GunStick, 7), //Jaw Down
	    GB8 = new JoystickButton(GunStick, 8),
	    GB9 = new JoystickButton(GunStick, 9),
	    GB10 = new JoystickButton(GunStick, 10), //Alternate Jaw Up
	    GB11 = new JoystickButton(GunStick, 11); //Alternate Jaw Down

    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public double getDriveX()
    {
	return DriveStick.getX();
    }

    public double getDriveY()
    {
	return DriveStick.getY();
    }

    public double getDriveZ()
    {
	return DriveStick.getZ();
    }

    public double getGunX()
    {
	return GunStick.getX();
    }

    public double getGunY()
    {
	return GunStick.getY();
    }

    public double getGunZ()
    {
	return GunStick.getZ();
    }

    public boolean getGB1()
    {
	return GB1.get();
    }

    public boolean getGB2()
    {
	return GB2.get();
    }

    public boolean getGB3()
    {
	return GB3.get();
    }

    public boolean getGB4()
    {
	return GB4.get();
    }

    public boolean getGB5()
    {
	return GB5.get();
    }

    public boolean getGB6()
    {
	return GB6.get();
    }

    public boolean getGB7()
    {
	return GB7.get();
    }

    public boolean getGB8()
    {
	return GB8.get();
    }

    public boolean getGB9()
    {
	return GB9.get();
    }

    public boolean getGB10()
    {
	return GB10.get();
    }

    public boolean getGB11()
    {
	return GB11.get();
    }

    public boolean getDB1()
    {
	return DB1.get();
    }

    public boolean getDB2()
    {
	return DB2.get();
    }

    public boolean getDB3()
    {
	return DB3.get();
    }

    public boolean getDB4()
    {
	return DB4.get();
    }

    public boolean getDB5()
    {
	return DB5.get();
    }

    public boolean getDB6()
    {
	return DB6.get();
    }

    public boolean getDB7()
    {
	return DB7.get();
    }

    public boolean getDB8()
    {
	return DB8.get();
    }

    public boolean getDB9()
    {
	return DB9.get();
    }

    public boolean getDB10()
    {
	return DB10.get();
    }

    public boolean getDB11()
    {
	return DB11.get();
    }
}
