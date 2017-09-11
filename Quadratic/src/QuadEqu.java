import java.lang.*;
public class QuadEqu {
	private int a;
	private int b;
	private int c;
	private String rootsDescrip="";
	private int[] roots = new int[2];
	private int d;
	
	public QuadEqu(int x, int y, int z) {
		if (x==0)
			throw new IllegalArgumentException();
		a= x;
	    b=y;
	    c=z;
	    discrim();
	}
   public int[] quadEqu() {
	   int[] output= new int[2];
	   if (d>0)
		   
	   
   }
   public int discrim() {
	   d =(int) (Math.pow(b, 2)- 4*a*c);
	   if (d>0)
		   rootsDescrip="two distinct real roots";
	   else if(d<0) {
		   roots = null;
		   rootsDescrip="two distinct complex roots";
	   }
	   else if(d==0)
		   rootsDescrip="one distinct real roots";
     return d;
   }
}

