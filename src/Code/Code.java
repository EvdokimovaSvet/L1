package Code;

public class Code {
	
	private double rezult;
	public static class Circle{
		double D;
		double L;
		public Circle(double d1, double l1)
		{
			D=d1;
			L=l1;
		}
	}
	
	
	/**
	 * 
	 * @param S is square 
	 * @return class Circle with D-diameter, L-lenght
	 */
	public Circle findCircle(double S) {
		return new Circle(Math.sqrt(S/3.14)*2,2*Math.sqrt(S/3.14)*3.14);
		
	}
	/**
	 * 
	 * @param S is square 
	 * @return diameter
	 */
	
	public double findDiameter(double S) {
		assert S>0: "S must be >0";
		return Math.sqrt(S/3.14)*2;
	}
	/**
	 * 
	 * @param S is square 
	 * @return lenght
	 */
	
	public double findLenght(double S) {
		assert S>0: "S must be >0";
		return 2*Math.sqrt(S/3.14)*3.14;
	}

	/**
	 * 
	 * @param n is three-digit number
	 * @return altered number
	 */

	public int changeNumber(int n) {
		assert (n/100)>0: "must be 1000>n>99 ";
		return ((n/10-n/100*10)*100+(n/100)*10+n%10);
	}

	/**
	 * 
	 * @param A, B, C - number
	 * @return true, if 2 of 3 numbers is possitive
	 */
	public boolean booleanTask(int A, int B, int C) {
		assert A!=0 && B!=0 && C!=0: "A,B,C>0 or <0";
		return ((A>0)&&(B>0)&&(C<0)||(A<0)&&(B>0)&&(C>0)||(A>0)&&(B<0)&&(C>0));
	}
	
	
	/**
	 * 
	 * 
	 * @param a,b,c is double numbers
	 * @return sum of the two largest
	 */
	public double ifTask(double a,double b,double c) {
		if(b>=a)
			if(a>=c) return a+b;
			else return b+c;
		if(c>=b)
			if(b>=a) return c+b;
			else return c+a;
		if(a>=c)
			if(c>=b) return a+c;
			else return a+b;
		return 0;
	}


	
	/**
	 * 
	 * @param A is double number, n is exponent
	 * @return A^n
	 */
	public double powTask(double A, int n) {
		assert n>0: "n must be >0";
		double rez=1;
		for(int i=0;i<n;i++)
			rez=rez*A;
		return rez;
	}


	public String cardsTask(int n, int m) {
		assert n>5 && n<15 && m>0 && m<5: " must be 15>n>5 and 5>m>0";
		String s = null;
		switch(n) {
	    	case 6:
	    		s="six";
	    		break;
	    	case 7:
	    		s="seven";
	    		break;
	    	case 8:
	    		s="eight";
	    		break;
	    	case 9:
	    		s="nine";
	    		break;
	    	case 10:
	    		s="ten";
	    		break;
	    	case 11:
	    		s="jack";
	    		break;
	    	case 12:
	    		s="queen";
	    		break;
	    	case 13:
	    		s="king";
	    		break;
	    	case 14:
	    		s="ace";
	    		break;
	    	}
		switch(m) {
		case 1: 
			return s+" spade";
		case 2: 
			return s+" club";
		case 3: 
			return s+" diamond";
		case 4: 
			return s+" heart";
		}
		return s;
	}
	public int contributionTask(float P) {
		assert P>0 && P<25: "month must be  less 25 and more 0";
		int k=0;
		rezult = 1000;
		while(rezult<1100)
		{
			rezult=rezult*(1+P/100);
			k++;
		}
		return k;
	}
	public float arrayTask(int n, float[] a) {
		for(int i=1;i<n-1;i++) {
			if((a[i]<a[i+1])&&(a[i]<a[i-1])) {
				return a[i];
			}
		}
		return 0;
	}
	public int[][] matrixTask(int n, int m, int[][] matrix, int k) {
		assert k>0 && k<m+1: "must be k from 1 to m";
		int[][] newmatrix=new int[n-1][m];
		k=k-1;
		for(int i=0;i<k;i++) {
			for(int j=0;j<m;j++)
				newmatrix[i][j]=matrix[i][j];
		}
		for(int i=k;i<n-1;i++) {
			for(int j=0;j<m;j++)
				newmatrix[i][j]=matrix[i+1][j];
		}
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(p2[i][j]);
//			}
//		}
		return newmatrix;
	}
	
}
