package FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int x = 100; x  > 0; x--){
//			if( (x % 3 == 0) && (x %5) == 0){
//				System.out.println("FizzBuzz");
//				System.out.println(x);
//			}
//
//			else if (x % 3 == 0){
//				System.out.println("Fuzz");
//				System.out.println(x);
//			}
//
//			else if( x % 5 == 0){
//				System.out.println("Bizz");
//				System.out.println(x);
//			}
//
//		}

		for (int i = 105; i  > 0; i--) {
			if( (( i % 3 )== 0) && ((i % 5) == 0) && (( i % 7 ) ==0)){
			
				System.out.println("FizzBuzz Bang");
			}

			else if (i % 3 == 0){
			
				System.out.println("Fizz");
			}
			else if( i % 5 == 0){
		
				System.out.println("Buzz");
			}

			else if( i % 7 == 0){
			
				System.out.println("Bang");
			}
			else{
				System.out.println(i);
			}
		}

	}

}
