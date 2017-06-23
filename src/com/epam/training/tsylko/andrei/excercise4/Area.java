package com.epam.training.tsylko.andrei.excercise4;

public class Area implements Cross {
	private Point bottomLeft;
	private Point topRight;

	public Area(Point bottomLeft, Point topRight) {
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}

	@Override
	public boolean isAreaCrossed(Point p) {

		if (p.getX() >= bottomLeft.getX() && p.getX() <= topRight.getX() && p.getY() >= bottomLeft.getY()
				&& p.getY() <= topRight.getY()) {
			return true;
		}
		return false;
}
}
