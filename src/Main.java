public class Main {
    public static void main(String[] args) {

        int price = 13676;   // Объявляете переменные для входных данных и
        int condition = 20;          // параметров программы: одну для хранения
        int bonusMiles = price / condition; // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        System.out.println("Вам начислены мили за покупку билета :" + bonusMiles);

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}