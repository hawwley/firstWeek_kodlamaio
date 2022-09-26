package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 0;
		int remainder = number % 2; // 25 mod 2.
		System.out.println(remainder);
		boolean isPrime = true; // En basta asal kabul ettik.
		
		if(number == 1) {
			System.out.println("Sayi asal degildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Gecersiz sayi.");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				}
		}	
			// if(isPrime == true)
			if (isPrime) {
				System.out.println("Sayi asaldir.");

			} else {
				System.out.println("Sayi asal degildir.");
			}

		}

	}


