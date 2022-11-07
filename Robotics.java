
public class Robotics {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Robotics Rock");
		System.out.println("[](/b32)");
		System.out.println(Robotics.addNums(5, 6));
		System.out.println("Good-bye, world.");
	}

	public static int addNums(int a, int b){
		if(b == 0){
			return a;
		}else{
			a++;
			b--;
			return addNums(a,b);
		}
	}
}
