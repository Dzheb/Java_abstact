//Урок 3. Классы и объекты
//        1. Построить три класса (базовый и 2 потомка), описывающих
//        некоторых работников с почасовой оплатой (один из потомков)
//        и фиксированной оплатой (второй потомок).
//        а) Описать в базовом классе абстрактный метод для расчёта
//        среднемесячной заработной платы.
//        Для «повременщиков» формула для расчета такова:
//        «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»,
//        для работников с фиксированной оплатой
//        «среднемесячная заработная плата = фиксированная месячная оплата».
//        б) Создать на базе абстрактного класса массив сотрудников
//        и заполнить его.
//        в) ** Реализовать интерфейсы для возможности сортировки
//        массива (обратите ваше внимание на интерфейсы
//        Comparator, Comparable)
//        г) ** Создать класс, содержащий массив сотрудников,
//        и реализовать возможность вывода данных с использованием foreach.

public class Main {
    public static void main(String[] args) {
        WorkerFixed workerF1 = new WorkerFixed("Schoen","Penn",55);
        workerF1.setSalary(2500.45);
        WorkerFixed workerF2 = new WorkerFixed("Tim","Wild",35);
        workerF1.setSalary(2500.45);
        WorkerTemp workerT1 = new WorkerTemp("Arthur","Mcarthy",25);
        workerT1.setRate(2300.45);
        WorkerTemp workerT2 = new WorkerTemp("Vic","Dale",43);
        workerT1.setRate(300.45);
        WorkersRepository staff = new WorkersRepository();
        staff.add((Worker) workerF1);
        staff.add((Worker) workerT1);
        staff.add((Worker) workerF2);
        staff.add((Worker) workerT2);
        staff.getWorkers();
        staff.sortWorkers();
        System.out.println("Workers sorted by age");
        staff.getWorkers();

        }

    }
