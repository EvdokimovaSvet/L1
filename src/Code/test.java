package Code;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Code.Code;
import Code.Code.Circle;


public class test {

	public static double EPS = 0.0000001;
	

	@Test(dataProvider = "circleProvider")
	public void circleTest(double p1, Circle p3) {
		assertEquals(new Code().findCircle(p1).D, p3.D);
		assertEquals(new Code().findCircle(p1).L, p3.L);
	}

	@DataProvider
	public Object[][] circleProvider() {
		Circle a = new Circle(3.0, 9.42);
		return new Object[][] {{ 7.065, a } };
	}


	@Test(dataProvider = "diameterProvider")
	public void diameterTest(double p1, double p3) {
		assertEquals(new Code().findDiameter(p1), p3);
	}

	@DataProvider
	public Object[][] diameterProvider() {
		return new Object[][] {{ 7.065, 3.0 } };
	}

	@Test(dataProvider = "lenghtProvider")
	public void lenghtTest(double p1, double p3) {
		assertEquals(new Code().findLenght(p1), p3);
	}

	@DataProvider
	public Object[][] lenghtProvider() {
		return new Object[][] {{ 7.065, 9.42 } };
	}

	@Test(dataProvider = "changeProvider")
	public void changeTest(int p1, int p3) {
		assertEquals(new Code().changeNumber(p1), p3);
	}

	@DataProvider
	public Object[][] changeProvider() {
		return new Object[][] {{ 145, 415 }, {512, 152}};
	}

	@Test(dataProvider = "booleanProvider")
	public void ooleanTest(int p1, int p2, int p3, boolean p4) {
		assertEquals(new Code().booleanTask(p1,p2,p3), p4);
	}

	@DataProvider
	public Object[][] booleanProvider() {
		return new Object[][] {{ 1,-1,4,true },{ 1,1,4,false },{ -1,-1,4,false }};
	}

	@Test(dataProvider = "ifProvider")
	public void ifTest(double p1, double p2, double p3, double p4) {
		assertEquals(new Code().ifTask(p1,p2,p3), p4);
	}

	@DataProvider
	public Object[][] ifProvider() {
		return new Object[][] {{ 4, 1, 2, 6.0 },{ 1, 4, 4, 8.0 },{ 4, 4, 4, 8.0 } };
	}

	@Test(dataProvider = "caseProvider")
	public void caseTest(int p1, int p2, String p3) {
		assertEquals(new Code().cardsTask(p1,p2), p3);
	}

	@DataProvider
	public Object[][] caseProvider() {
		return new Object[][] {{12,4,"queen heart"} };
	}

	@Test(dataProvider = "forProvider")
	public void forTest(double p1, int p2, double p3) {
		assertEquals(new Code().powTask(p1,p2), p3);
	}

	@DataProvider
	public Object[][] forProvider() {
		return new Object[][] {{ 2, 3, 8.0 } };
	}

	@Test(dataProvider = "whileProvider")
	public void whileTest(float p1, int p2) {
		assertEquals(new Code().contributionTask(p1), p2);
	}

	@DataProvider
	public Object[][] whileProvider() {
		return new Object[][] {{ 4,3 } };
	}

	@Test(dataProvider = "arrayProvider")
	public void arrayTest(int p1, float[] p2, float p3) {
		assertEquals(new Code().arrayTask(p1, p2), p3);
	}

	@DataProvider
	public Object[][] arrayProvider() {
		float[] a= {6,2,1,4};
		return new Object[][] {{4,a,1 }};
	}

	@Test(dataProvider = "matrixProvider")
	public void matrixTest(int n, int m, int[][] p1,int k,int[][] p2) {
		int[][] p3=new Code().matrixTask(n,m,p1,k);
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<m;j++) {
			assertEquals(p3[i][j], p2[i][j]);
			}
		}	
	}

	@DataProvider
	public Object[][] matrixProvider() {
		int[][] c= {{1,2,3},{2,3,4},{3,4,5}};
		int[][] b= {{2,3,4},{3,4,5}};
		return new Object[][] {{3,3,c,1,b}};
	}
}
