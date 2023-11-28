package centerstage.auto;

import com.pocolifo.robobase.Alliance;
import com.pocolifo.robobase.BuildProperties;
import com.pocolifo.robobase.vision.NovelYCrCbDetection;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Blue " + BuildProperties.VERSION)
public class BlueProductionAuto extends BaseProductionAuto {
    public BlueProductionAuto() {
        super(new NovelYCrCbDetection(1), Alliance.BLUE);
    }
}
