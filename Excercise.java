import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Excercise {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String names[] = {"abcaaaaaaaaaa","defd","dsdfds"};
		for(int i=0;i<names.length;i++){
			String name = names[i];
			HashSet set = new HashSet();
			for(int j=0;j<name.length();j++){
				set.add(name.charAt(j));
			}
			char ch[] = new char[set.size()];
			Iterator it = set.iterator();
			while(it.hasNext()){
				for(int k=0;k<ch.length;k++){
					ch[k] = (char)it.next();
				}
			}
			System.out.println(name);
			for(int l=0;l<ch.length;l++){
				int count = 0;
				for(int m=0;m<name.length();m++){
					if(ch[l] == name.charAt(m)){
						count++;
					}
				}
				
				System.out.println(ch[l]+"  comes "+count+" times");
			}
		}

	}
}
