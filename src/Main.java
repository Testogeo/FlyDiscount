public class Main {
    public static void main(String[] args) {

        int price = 13676;   // Объявляете переменные для входных данных и
        int M = 20;          // параметров программы: одну для хранения
        int miles = price / M; // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        System.out.println("Вам начислены мили за покупку билета :" + miles);

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}