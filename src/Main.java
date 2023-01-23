public class Main { public static void main(String[] args) {
    int score1 = 100; // исходный счет
    int account; // всего на счету
    int score2 = 1100; //сумма пополнения
    int score3 = score2 / 100; // промежуточная переменная (каждые 100 рублей)
    if (score2 >=1000 ){
        account=score3+score1+score2;
        System.out.println("На вашем счету "+account);
        System.out.println("Вы пополнили счет на "+score2);
        System.out.println("Бонусы составили "+score3 + " рублей");
    }
    else {
        account=score1+score2;
        System.out.println("На вашем счету"+account);
        System.out.println("Вы пополнили счет на "+score2);
        System.out.println("Бонусы составили "+score3 + " рублей");
    }
}}
