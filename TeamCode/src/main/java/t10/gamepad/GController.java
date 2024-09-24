package t10.gamepad;

import t10.gamepad.input.types.GButton;
import t10.gamepad.input.types.GTrigger;
import com.qualcomm.robotcore.hardware.Gamepad;

public class GController {
    // Gamepad buttons
    public final GButton x;
    public final GButton y;
    public final GButton a;
    public final GButton b;
    public final GButton rightBumper;
    public final GButton leftBumper;

    // Gamepad D-Pad buttons
    public final GButton dpadUp;
    public final GButton dpadDown;
    public final GButton dpadRight;
    public final GButton dpadLeft;

    // Gamepad joysticks
    public final GButton leftJoystick;
    public final GButton rightJoystick;

    // Gamepad triggers
    public final GTrigger rightTrigger;
    public final GTrigger leftTrigger;

    public GController(Gamepad gamepad) {
        this.x = new GButton(this, () -> gamepad.x);
        this.y = new GButton(this, () -> gamepad.y);
        this.a = new GButton(this, () -> gamepad.a);
        this.b = new GButton(this, () -> gamepad.b);

        this.rightBumper = new GButton(this, () -> gamepad.right_bumper);
        this.leftBumper = new GButton(this, () -> gamepad.left_bumper);

        this.dpadUp = new GButton(this, () -> gamepad.dpad_up);
        this.dpadDown = new GButton(this, () -> gamepad.dpad_down);
        this.dpadLeft = new GButton(this, () -> gamepad.dpad_left);
        this.dpadRight = new GButton(this, () -> gamepad.dpad_right);

        this.leftJoystick = new GButton(this, () -> gamepad.left_stick_button);
        this.rightJoystick = new GButton(this, () -> gamepad.right_stick_button);

        this.leftTrigger = new GTrigger(this, () -> gamepad.left_trigger);
        this.rightTrigger = new GTrigger(this, () -> gamepad.right_trigger);
    }

    public void update() {
        this.x.update();
        this.y.update();
        this.a.update();
        this.b.update();

        this.leftBumper.update();
        this.rightBumper.update();

        this.dpadUp.update();
        this.dpadDown.update();
        this.dpadLeft.update();
        this.dpadRight.update();

        this.leftJoystick.update();
        this.rightJoystick.update();

        this.leftTrigger.update();
        this.rightTrigger.update();
    }
}