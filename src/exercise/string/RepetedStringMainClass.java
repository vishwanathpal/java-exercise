package exercise.string;

public class RepetedStringMainClass {

	public static void main(String[] args) {

		String name = "communication";
		String commonCh = "";
		System.out.println("word: "+name);
		char[] chName = name.toCharArray();
		char firstCh;
		char secondCh;
		
		for(int i=0; i<chName.length; i++) {
			firstCh = chName[i];
			
			for(int j=i+1; j<chName.length; j++) {
				secondCh = chName[j];
				if(firstCh==secondCh) {
					commonCh = commonCh.concat(firstCh+"");
				}
			}
		}
		System.out.println("common string: "+commonCh);
	}
	
}
