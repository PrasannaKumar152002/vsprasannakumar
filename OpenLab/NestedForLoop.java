
public class NestedForLoop {
	public static void main(String[] args) {
		System.out.println("Nested forloop");
		for(int i=1;i<=5;i++){
			System.out.println(i);
			for(int j=1;j<=5;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	} 
}
