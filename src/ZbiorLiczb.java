public class ZbiorLiczb {
    public static void main(String[] args) {
        int [] numbers = {72, 5, -6, 22, -9};
        int i = 0;
        do {
            System.out.println(numbers[i]);
        } while(i < numbers.length-1 && numbers[i++] > 0);    //  przesuwamy i++ z instrukcji po "do" -->[i++] zamiast [i-1] oraz dopisujemy-1 do numbers.length
    }
}

/*
długośc tablicy = 5;

i = 0

wyswietla numbers[0]  // 72
i - 1;
mimo inkremnentacji i++, program sprawdza, czy numbers[i-1] czyli od [0] jest większy od 0 (--> jest bo wynosi 72),
a skoro jest, to idzie dalej i wchodzi ponownie do pętli.


Pętla rozpoczyna od wyświetlenia  numbers[i], a i = 1 po inkrementacji;   // 5
następnie zwiększa i o 1, czyli teraz i = 2; a potem dopiero sprawdza warunek, czyli czy:
- numbers[i] jest mniejsze od dugości tablicy (= 5) oraz czy numbers [1] (--> numbers[i - 1] czyli 5) jest większe od zera,
a jak jest, to wykona ponownie pętlę:


*wyświetli numbers[2], // -6
*zwiększenie i --> i = 3.
następnie sprawdza, czy i=3 jest mniejsze od 5 oraz czy numbers[i-1] czyli numbers[2] jest większe od zera
-- a nie jest bo wynosi -6, więcjest zakończenie pętli.

*/
