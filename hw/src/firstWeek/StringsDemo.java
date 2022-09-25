package firstWeek;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);

		/*
		System.out.println("Eleman sayisi = " + mesaj.length());
		System.out.println("5. eleman = " + mesaj.charAt(4)); //charAt
		System.out.println(mesaj.concat(" Yasasin!")); //concat
		System.out.println(mesaj); //mesaj hala ayni.
		System.out.println(mesaj.startsWith("B")); 		//B ile basliyor mu? (Java case sensitive bir dildir.)
		System.out.println(mesaj.endsWith("."));		//. ile bitiyor mu?
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a'));			//a kacinci eleman? (ilk a)
		System.out.println(mesaj.indexOf("av"));		
		System.out.println(mesaj.lastIndexOf('a'));	//Aramaya en sagdan baslar.Ama index sayisi soldan sayar.
		*/
		
		
		//Bugun hava cok guzel.
		System.out.println(mesaj.replace(' ', '-')); //Bosluk yerine -.
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));		//2. indexten itibaren kes.
		System.out.println(mesaj.substring(2, 5));
		
		//split
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println("-----------------------------");
		String mesaj2 = "     Bugun hava cok guzel.";
		System.out.println(mesaj2);
		System.out.println(mesaj2.trim());
		System.out.println("-----------------------------");
		
		
		
		
		
		
		
		

	}

}
