import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		Robot Ryan = new Robot();
    Ryan.penDown(); 	
    Ryan.setSpeed(100);
Ryan.setPenColor(Color.BLACK);
Ryan.sparkle();
Ryan.setWindowColor(Color.GREEN);
	}
}
