package com.example.mynewpainproject;

import android.graphics.Canvas;
import android.graphics.Paint;

public class DrawRectangle extends Shape {

	public DrawRectangle(Point start, Point end, Paint paint) {
		this.paint = paint;
		pointStart = start;
		pointEnd   = end;
		
		
	}

	@Override
	public void DrawShape(Canvas canvas) {
		Point[] points = points();		
		canvas.drawRect(points[0].x, points[0].y, points[1].x, points[1].y, this.paint);
		
	}
	
}
