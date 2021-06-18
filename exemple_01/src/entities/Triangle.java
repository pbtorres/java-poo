package entities;

public class Triangle {
	public double a, b, c, area;
	
	public double calcArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p -c));
	}

	public void checkArea(double aX, double aY ){
		if(aX > aY)
			System.out.println("A área do triângulo X é maior.");
		else if(aX < aY)
			System.out.println("A área do triângulo Y é maior.");
		else if(aX == aY)
			System.out.println("A área dos triângulos são iguais.");

	}

}
