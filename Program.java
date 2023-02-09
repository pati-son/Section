//import static java.lang.Math;

public class Program{

	public static void main(String[] args){

		Section l = new Section(0,0,4,4);
		l.zoom(2);
		//l.isInside(1,2);
		System.out.println(l.isInside(0,0));
		System.out.println(l);
	}
		
}

class Section{
		
		private int x1;
		private int y1;
		private int x2;
		private int y2;

		public Section(int a1, int b1, int a2, int b2){
			x1 = a1;
			y1 = b1;
			x2 = a2;
			y2 = b2;
		}

		public void zoom(int n){
			int length;
			if (x1 == x2){
				y2 *= n;
			}
			else if (y1 == y2){
				x2 *= n;
			}
			else{
				x2 *= n;
				y2 *= n;
			}
			
		}

		public boolean isInside(int x, int y){
			
			if(x < x1 || x > x2)
				return false;
			else if (y < y1 || y > y2)
				return false;
			else if ((x-x1)*(y2-y1) == (y-y1)*(x2-x1))
				return true;	
			else return false;
		}
		
		public String toString(){
 			String text = "Section: " + x1 + "," + y1 + "," + x2 + "," + y2;
 			return text;
  		}
	

	
	
}
