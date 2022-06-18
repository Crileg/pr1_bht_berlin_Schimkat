package pr1.a10;

import java.awt.Point;

public class CircleFilter implements PointFilter{
	@Override
	public boolean accept(Point point) {
	    double a = Math.abs(point.y - 400);
	    double b = Math.abs(point.x - 300);
	    double dist = Math.hypot(a, b);
	    return dist < 200;
	}
}
