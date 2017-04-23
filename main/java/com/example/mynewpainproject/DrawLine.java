package com.example.mynewpainproject;

import android.graphics.Canvas;
import android.graphics.Paint;

public class DrawLine extends Shape{
	


	public DrawLine(Point start,Point end, Paint paint) {
		this.paint = paint;
		pointEnd = start;
		pointStart =   end;
	}

	@Override
	public void DrawShape(Canvas canvas) {

		canvas.drawLine(
				pointEnd.x, 
				pointEnd.y, 
				pointStart.x, 
				pointStart.y, this.paint);
		
		
	}

	@Override
	public String toString() {
		return "DrawLine [PointOnMouseUp="
				+ pointStart + ", PointOnMouseDown=" + pointEnd
				+ "]";
	}
	
	

}
