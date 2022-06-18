package pr1.a10;

import java.awt.Point;

public class SquareFilter implements PointFilter{
	@Override
	public boolean accept(Point point) {
		return point.x > 250 && point.x < 550 && point.y > 350 && point.y < 650;
	}
}
