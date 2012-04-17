public class MyRule {
	public int ratio(String category) {
	  int ratio = 0;
	  
	  if (category.equals("Senior")) {
	  ratio = 10;
	  }
	  else if (category.equals("Adult1")) {
	  ratio = 15;
	  }
	  else ratio = 20;
	  return ratio;
	}
	
	public static void main(String[] args) {
	  new MyRule().ratio(args[0]);
	}	
}
