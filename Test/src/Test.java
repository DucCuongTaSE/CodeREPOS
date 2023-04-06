
/**
 *
 * @author CuongSchmidt
 */
public class Test{		

	public static void main(String[] args){

		int a = 3, b = 0;

		while( a >= 0 ){

			a -= 1;

			while(b<=3 ){

				b += 1;

				if(a < b)

					break;				

				System.out.print(a + " " + b + ", ");

			}

		}

	}	

}