package pr1.a10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import schimkat.berlin.lernhilfe2021ws.graphics.DirtyPainter;
import schimkat.berlin.lernhilfe2021ws.graphics.Drawable;
import schimkat.berlin.lernhilfe2021ws.graphics.Oval;
import schimkat.berlin.lernhilfe2021ws.io.DirtyFileReader;

import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Convert {

	public static List<Integer> fileToSet(String filename) {
		Scanner in = new Scanner(new DirtyFileReader(filename));
		List<Integer> liste = new ArrayList<>();
		while (in.hasNextInt()) {
			liste.add(in.nextInt());
		}
		in.close();
		return liste;
	}

	public static List<Point> intsToPoints(List<Integer> ints) {
		List<Point> list = new ArrayList<Point>();
		if (ints.size() > 0) {
			for (int i = 0; i < ints.size(); i += 2) {
				list.add(new Point(ints.get(i), ints.get(i + 1)));
			}
		}
		return list;
	}

	public static List<Ellipse2D.Double> pointsToOvals(List<Point> points) {
		List<Ellipse2D.Double> list = new ArrayList<Ellipse2D.Double>();
		for (Point point : points) {
			list.add(new Ellipse2D.Double(point.x, point.y, 5, 5));
		}
		return list;
	}

	public static Drawable ovalsToDrawable(List<Point> points) {
		List<Ellipse2D.Double> ovals = pointsToOvals(points);
		Ellipse2D oval = ovals.get(ovals.size() - 1);
		Point point = points.get(points.size() - 1);
		schimkat.berlin.lernhilfe2021ws.graphics.Point p = new schimkat.berlin.lernhilfe2021ws.graphics.Point((int) point.getX(), (int) point.getY());
		Drawable d1 = new Oval(p, (int) oval.getWidth(), (int) oval.getHeight());
		points.remove(points.size() - 1);
		return d1;
	}

	public static List<Point> filter(List<Point> points, PointFilter filter) {
		List<Point> p = new ArrayList<>();
		for(Point point : points){
			if (filter.accept(point)) {
				p.add(point);
			}
		}
		return p;
	}

	public static void show(List<Point> points) {
		DirtyPainter painter = new DirtyPainter();
		for (int i = 0; i < points.size()*3; i++) {
			painter.add(ovalsToDrawable(points));
		}
		painter.showDrawing();
	}
}
