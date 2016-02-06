public class Sample implements IInt{
	public static void main(String[] args){
		Sample s = new Sample(); //1
		int j = s.theValue; //2
		int k = IInt.theValue; //3
		int l = theValue;	//4
		System.out.println("Het is goed gegaan!");
	}
}