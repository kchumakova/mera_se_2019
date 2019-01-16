public class ReverseListofArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Аргументы метода main в обратном порядке: ");
		for (int i = args.length-1; i >=0; i--) {
			System.out.print( args [i] + " ");
		}
	}

}
