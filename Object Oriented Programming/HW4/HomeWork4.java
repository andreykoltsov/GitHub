/*Sources

http://stackoverflow.com/questions/5785745/make-copy-of-array-java
http://cs-fundamentals.com/java-programming/java-arrays-clone-shallow-deep-copy.php
http://stackoverflow.com/questions/11727019/finding-the-size-of-a-char-array-in-java
http://unicode-table.com/en/#0041
http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#String%28char[]%29
http://stackoverflow.com/questions/11208444/java-public-stringchar-value
http://www.tutorialspoint.com/java/java_string_valueof.htm 
http://stackoverflow.com/questions/12192805/convert-a-integer-to-character-array-java
http://www.dreamincode.net/forums/topic/194699-how-to-make-array-for-characters/
http://www.tutorialspoint.com/java/lang/system_arraycopy.htm

*/

import java.util.*;
public class HomeWork4{
	public static class MyString{
		
		char[] words;
		int len;
		
		public MyString(){
			
		}
		
		public MyString(char[] chars){
			len = chars.length;
			words = new char[len];
			
			System.arraycopy(chars,0,words,0,len);
		}
		
		public char charAt(int index){
			char a = words[index];
			return a;
		}
		
		public int length(){
			return len;
		}
		
		public MyString substring(int begin, int end){
			int howbig = end-begin;
			char[] subchar = new char[howbig];
			
			System.arraycopy(words,begin,subchar,0,howbig);
			words = subchar;
			len = howbig;
			return this;
		}
		
		public MyString toLowerCase(){
			for(int i=0; i<len; i++){
				if(words[i] > 65 && words[i] < 90){
					words[i] = (char)(words[i]+32);
				}
			}
			return this;
		}
		
		public MyString toUpperCase(){
			for(int i=0; i<len; i++){
				if(words[i] > 97 && words[i] < 122){
					words[i] = (char)(words[i]-32);
				}
			}
			return this;
		}
		
		public boolean equals(MyString s){
			if(s.len != len){
				return false;
			}
			for(int i=0; i<len; i++){
				if(words[i] != s.words[i]){
					return false;
				}
			}
			return true;
		}
		
		public MyString getMyString(){
			return this;
		}
		
		public String toString(){
			String a = new String(words);
			//^This is a constructor.
			return a;
		}
		
		public static MyString valueOf(int i){
			/*char[] a = new char[1];
			a = (char) i;
			a = a+32
			*/
			char[] a = ("" + i).toCharArray();
			
			MyString val = new MyString(a);
			return val;
		}
	}
	
	public static void main(String[] args){
	
	char[] newchar1 = {'n','e','w',' ','O','B','J'};
	char a;
	int b;
	boolean c;
	int d = 566785;
	
	MyString test1 = new MyString(newchar1);
	MyString test2 = new MyString(newchar1);
	
	c = test1.equals(test2);
	System.out.println("test1 equals test 2? " + c);
	
	a = test1.charAt(5);
	System.out.println("What char is at position 5? " + a);
	
	b = test1.length();
	System.out.println("Test for length: " + b);
	
	test1.toLowerCase();
	System.out.println("Test for toLowerCase: " + test1);
	
	test1.toUpperCase();
	System.out.println("Test for toUpperCase: " + test1);
	
	c = test1.equals(test2);
	System.out.println("test1 equals test 2 now? "  + c);
	
	test1.substring(2,6);
	System.out.println("After substring change: " + test1);
	
	//MyString test3 = new MyString.valueOf(d);
	System.out.println("Test of valueOf: "+MyString.valueOf(d));
	
	}
}
