import java.util.ArrayList;

public class PrimeDirective {
    public PrimeDirective() {

    }

    public boolean isPrime(int number) {
        if (number == 1 || number == 0) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public ArrayList<Integer> onlyPrimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int integer : numbers) {
            if (isPrime(integer)) {
                primes.add(integer);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        PrimeDirective prime = new PrimeDirective();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(17);
        numbers.add(21);
        numbers.add(197);
        System.out.println(prime.onlyPrimes(numbers));
    }
}
