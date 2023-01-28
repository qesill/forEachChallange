public class Main {
    public static void main(String[] args) {
        /*
        Zapisz tablicę liczb całkowitych od 0 do 5 w zmiennej numbers.
        Uzyj pętli for each aby przejść po całej tablicy
        i dodaj do siebie wszystkie elementy.
        Sumę elementów zaprezentuj po pętli w konsoli.
         */
        int sum = 0;
        int [] intArr = {0, 1, 2, 3, 4, 5};
        for (int i : intArr)
        {
            sum += i;
        }
        System.out.println("Suma liczb w tablicy to: " + sum);
    }
}