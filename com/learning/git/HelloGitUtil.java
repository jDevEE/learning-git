package com.learning.git;
public final class HelloGitUtil{
	/** Default constructor for utility classes. **/
	private HelloGitUtil(){
	}
	public static void sayHello(String name){
		System.out.println("Hello " + name);
	}
    public static String doSomething( String string ){
        return string.toUpperCase();
    }
}
