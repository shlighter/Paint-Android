package com.example.mynewpainproject;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class DrawCircle extends Shape {
	
	float Radius;
	float center;

	public DrawCircle(Point start, Point end, Paint paint) {
		this.paint = paint;
		pointStart = start;
		pointEnd = end;
		
	}

	@Override
	public void DrawShape(Canvas canvas) {

		float x = Math.abs(pointStart.x - pointEnd.x);
		float y = Math.abs(pointStart.y - pointEnd.y);
		
		if(x>y)
			Radius = x;
		else 
			Radius = y;
		
		canvas.drawCircle(pointStart.x,pointStart.y, Radius, this.paint);
//		RectF rf=new RectF(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y)

//		canvas.drawOval(rf, paint);//(rf, 2, 2, true, paint);

	}

	@Override
	public String toString() {
		return "DrawCircle [Radius=" + Radius + ", paint=" + paint
				+ ", PointOnMouseUp=" + pointStart + ", PointOnMouseDown="
				+ pointEnd + "]";
		
	}
	
	

}
