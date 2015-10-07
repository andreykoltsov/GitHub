/*Sources
http://www.thejavageek.com/2013/07/21/using-javac-and-java-commands-to-compile-and-launch-java-programs/
*/

package pack2;
import pack1.class1;

public class class2 extends class1{
	public void createit(){
		System.out.println("The 'a' value is: "+a+".");
	}
	public static void main(String[] args){
		class2 newval = new class2();
		newval.createit();
	}
}
