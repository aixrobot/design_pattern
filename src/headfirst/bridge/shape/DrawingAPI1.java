package headfirst.bridge.shape;

public class DrawingAPI1 implements DrawingAPI {

	@Override
	public void drawCircle(double x, double y, double radius) {
		// TODO Auto-generated method stub
		System.out.printf("API1.circle at %f:%f radius %f\n",  x, y, radius);
		

	}

}
