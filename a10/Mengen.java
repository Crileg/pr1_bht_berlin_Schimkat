package pr1.a10;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Mengen {

	public static void showAandB() {
		List<Point> pointsA = Convert.intsToPoints(Convert.fileToSet("Data/A.txt"));
		List<Point> pointsB = Convert.intsToPoints(Convert.fileToSet("Data/B.txt"));
		Convert.show(pointsA);
		Convert.show(pointsB);
	}

	public static void showCirclesAndSquares() {
		List<Point> pointsA = Convert.intsToPoints(Convert.fileToSet("Data/A.txt"));
		CircleFilter filterA = new CircleFilter();
		pointsA = Convert.filter(pointsA, filterA);
		List<Point> pointsB = Convert.intsToPoints(Convert.fileToSet("Data/B.txt"));
		SquareFilter filterB = new SquareFilter();
		pointsB = Convert.filter(pointsB, filterB);
		Convert.show(pointsA);
		Convert.show(pointsB);
	}

	public static void showVereinigungsmenge() {
		List<Point> pointsA = Convert.intsToPoints(Convert.fileToSet("Data/A.txt"));
		CircleFilter filterA = new CircleFilter();
		pointsA = Convert.filter(pointsA, filterA);
		List<Point> pointsB = Convert.intsToPoints(Convert.fileToSet("Data/B.txt"));
		SquareFilter filterB = new SquareFilter();
		pointsB = Convert.filter(pointsB, filterB);
		pointsA.addAll(pointsB);
		Convert.show(pointsA);
	}
	
	public static void showSchnittmenge() {
		List<Point> points = Convert.intsToPoints(Convert.fileToSet("Data/A.txt"));
		List<Point> points1 = Convert.intsToPoints(Convert.fileToSet("Data/B.txt"));
		points.addAll(points1);
		CircleFilter filterA = new CircleFilter();
		points = Convert.filter(points, filterA);
		SquareFilter filterB = new SquareFilter();
		points = Convert.filter(points, filterB);
		Convert.show(points);
	}

	public static void showDifferenzmenge() {
		List<Point> points1 = Convert.intsToPoints(Convert.fileToSet("Data/A.txt"));
		List<Point> points2 = Convert.intsToPoints(Convert.fileToSet("Data/B.txt"));
		List<Point> pointsA = new ArrayList<>(points1);
		List<Point> pointsB = new ArrayList<>(points2);
		points1.addAll(points2);
		CircleFilter filterA = new CircleFilter();
		pointsA = Convert.filter(pointsA, filterA);
		points1 = Convert.filter(points1, filterA);
		SquareFilter filterB = new SquareFilter();
		points1 = Convert.filter(points1, filterB);
		pointsB = Convert.filter(pointsB, filterB);
		for (Point point : pointsB) {
			pointsA.add(point);
		}
		pointsA.addAll(pointsB);
		for (Point point : points1) {
			pointsA.remove(point);
		}
		Convert.show(pointsA);
	}
}
