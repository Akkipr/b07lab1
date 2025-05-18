
public class Polynomial {
	
	double [] coefficients;
	
	public Polynomial() {
		coefficients = new double[1];
		coefficients[0]=0;
	}
	
	public Polynomial(double[]arr) {
		this.coefficients=arr;
	}
	
	public Polynomial add(Polynomial p) {
		int j = Math.min(this.coefficients.length, p.coefficients.length);
		int h = Math.max(this.coefficients.length, p.coefficients.length);
		int m = -1;
		double[] n = new double[(int) h];
		
		for (int i=0; i<j; i++) {
			n[(int) i] = this.coefficients[(int) i] + p.coefficients[(int) i];
			m=m+1;
		}
		m=m+1;
		
		if (m==h) {
			p.coefficients=n;
			return p;
		} 

		for (int i=m; i < h; i++ ) {
			if (h==this.coefficients.length) {
				n[(int) m] = this.coefficients[(int) m];
			}
			else if (h==p.coefficients.length){
				n[(int) m] = p.coefficients[(int) m];
			}
		}
		p.coefficients=n;
		return p;
	}
	
	public double evaluate(double x) {
		double j = 0;
		for (int i=0; i<this.coefficients.length; i++) {
			j = j + (this.coefficients[i]*(Math.pow(x, i)));
		}
		return j;
	}
	
	
	
	public boolean hasRoot(double x) {
		if (this.evaluate(x)==0) {
			return true;
		}return false;
		
	}
	
	

}	