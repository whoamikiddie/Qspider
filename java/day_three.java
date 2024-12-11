// javac filename.JAVA --> shows error like (error: class name 'Filename.java', are only accepted processing )
// --> https://github.com/Cyb0r9/SocialBox

// java filename.JAVA --> it will run

class A{
	public static void main(String[] args){
		for(String  s: args )
		System.out.println(s);
		System.out.println(args.length);

	}
}
