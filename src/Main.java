public class Main {
    public static void main(String[] args) {

        //Задача 1
        boolean clientOS = true;
        if(clientOS == true){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 2
        int clientDeviceYear = 2015;
        if(clientOS == true && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == true && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == false && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3
        int year = 2021;
        if (year >= 1584){
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " год является високосным.");
            }else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("В " + year + " году не было понятия високосного года.");
        }

        //Задача 4
        int deliveryTime = 1;
        int deliveryDistance = 95;
        if(deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if(deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет.");
        }

        // Задача 5
        int monthNumber = 13;
        switch (monthNumber){
            case 1:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}