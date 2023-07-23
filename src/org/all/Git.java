package org.all;

public class Git {
	
public static void main(String[] args) {
		
		String S= "Welcome+To-The$Java/Class@123#";
		
		int capscount=0,smallcount=0,digitcount=0,specialcount=0;
		
		String caps="",small="",digit="",special="";
		
		for(int i=0; i<S.length(); i++) {
			
			char c = S.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				capscount++;
				caps = caps+c;
			}
			
			else if (c >= 'a' && c <= 'z'){
				smallcount++;
				small = small+c;
				}
			
			else if (c >= 0 && c <= 9) {
				digitcount++;
				digit= digit+c;
			}
			else {
				specialcount++;
				special=special+c;
			}
		}
			
			System.out.println(caps+ " " +capscount);
			System.out.println(small+ " " +smallcount);
			System.out.println(digit+ " " +digitcount);
			System.out.println(special+ " " +specialcount);
		}
	}


	
	


