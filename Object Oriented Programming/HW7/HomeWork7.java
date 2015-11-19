/*
Sources:
http://examples.javacodegeeks.com/core-java/io/filewriter/java-filewriter-example/
http://www.tutorialspoint.com/java/java_filewriter_class.htm
http://stackoverflow.com/questions/9515505/how-to-get-the-string-after-last-comma-in-java
*/
import java.util.*;
import java.io.*;

public class HomeWork7{
	static int[] tab_count = new int[1];
	public static void main(String[] args) throws IOException{
		File my_tree = new File("dir_tree.txt");
		my_tree.createNewFile();
		PrintWriter fw = new PrintWriter(new FileWriter(my_tree));
		int tab_count = 0;
		
		//fw.write("Test");
		
		File curr_directory = my_tree.getAbsoluteFile().getParentFile();
		File temp_directory = curr_directory;
		
		while(temp_directory!=null){
			temp_directory = curr_directory.getAbsoluteFile().getParentFile();
			
			if (temp_directory != null){
				curr_directory = temp_directory;
			}
			//System.out.println(curr_directory);
			//fw.println(curr_directory);
		}
		fw.println(curr_directory);
		try{
			print_tree(curr_directory, fw, tab_count);
		}
		catch(NullPointerException ex){
			fw.println("Cannot Access Folder");
		}
		finally{
			fw.flush();
		}
	}
	public static void print_tree(File file_f, PrintWriter fw2, int tabs) throws NullPointerException{
		String s;
		File[] dir_arr = file_f.listFiles();
		for(int i = 0; i<dir_arr.length; i++){
			if(dir_arr[i].isDirectory() && dir_arr[i].canRead() && dir_arr[i].canWrite() && dir_arr[i].canExecute() && !dir_arr[i].isHidden()){
				//fw2.print("|");
				if(tabs == 0){
					fw2.print("|-");
				}
				else{
					for(int j = 0; j<tabs; j++){
						fw2.print("  ");
					}
					fw2.print("|-");
				}
				s = dir_arr[i].getPath();
				fw2.println(s.substring(s.lastIndexOf("\\")+1).trim());
				//System.out.println(dir_arr[i]);
				print_tree(dir_arr[i], fw2, tabs+1);
			}
		}
	}
}