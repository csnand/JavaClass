package exam2015;


public class PolarPoint {

    protected Point point = new Point(0,0);

    private double distance;
	private double angle;
	
	public PolarPoint(double distance, double angle) {
		this.distance = distance;
		this.angle = angle;
	}

    public Point toCartesian(){
        
        double x = distance * Math.cos(angle) + point.X;
        double y = distance * Math.sin(angle) + point.Y;

        return new Point(x, y);
    }

    public PolarPoint fromCartesian(Point point){

		double distance = Math.sqrt( (point.X - this.point.X) * (point.X - this.point.X) +
									 (point.Y - this.point.Y) * (point.Y - this.point.Y) );
		double angle = Math.atan2( (point.Y - this.point.Y), (point.X - this.point.X) );

		return new PolarPoint( distance, angle );

	}
	
	public double straightLineDistance(PolarPoint ppoint){
		
		double x = 0;
		double y = 0;

		Point thisCartesian = this.toCartesian();
		Point ppointCartesian = ppoint.toCartesian();

		if (thisCartesian.X > ppointCartesian.X) {
			x = thisCartesian.X - ppointCartesian.X;
		} else {
			x = ppointCartesian.X - thisCartesian.X;
		}

		if (thisCartesian.Y > ppointCartesian.Y) {
			y = thisCartesian.Y - ppointCartesian.Y;
		} else {
			y = ppointCartesian.Y - thisCartesian.Y;
		}

		return Math.sqrt( x * x + y * y );
		
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

    



    




}
