import java.util.*;

public class Menu {
    Scanner in = new Scanner(System.in);
    private int comm ;

    /**
     * Приветствие.
     */
    private void sayHello() {
        System.out.println("Добро пожаловать в больницу!");
        System.out.println("Для регистрации введите 1");
        System.out.println("Для записи к врачу введите 2");
        System.out.println("Для завершения программы введите 3");
    }
    /**
     * Главное меню.
     */
    public void menuHospital() {
        sayHello();
        Patients one = new Patients("Пупкина Анна Витальевна", "Ж", 33, 12324);
        Patients two = new Patients("Пузырькин Алексей Витальевич", "М", 66, 34528);
        Patients three = new Patients("Жорина Анастасия Игоревна", "Ж", 61, 87676);
        Patients four = new Patients("Котиков Валерий Серафимович", "М", 23, 57428);
        Patients five = new Patients("Аникеев Андрей Борисович", "М", 45, 56130);
        Patients six = new Patients("Лопкина Мария Геннадьевна", "Ж", 74, 70583);
        Patients seven = new Patients("Волдырева Ксения Ивановна", "Ж", 54, 74205);
        Patients eight = new Patients("Бурдашев Сергей Александрович", "М", 19, 27985);
        Patients nine = new Patients("Коровин Александр Петрович", "Ж", 23, 68902);
        Patients ten = new Patients("Бубликов Павел Павлович", "М", 73, 42301);
        comm = 0;
        while (comm != 3) {
            System.out.println("Выберите пункт меню: ");
            comm = in.nextInt();
            if (comm == 1) {
                System.out.println("Вы выбрали " + comm + "-й пункт меню.");

                LinkedHashMap<String, String> mapPatients = new LinkedHashMap<>();
                mapPatients.put(one.getID(), one.getPatient());
                mapPatients.put(two.getID(), two.getPatient());
                mapPatients.put(three.getID(), three.getPatient());
                mapPatients.put(four.getID(), four.getPatient());
                mapPatients.put(five.getID(), five.getPatient());
                mapPatients.put(six.getID(), six.getPatient());
                mapPatients.put(seven.getID(), seven.getPatient());
                mapPatients.put(eight.getID(), eight.getPatient());
                mapPatients.put(nine.getID(), nine.getPatient());
                mapPatients.put(ten.getID(), ten.getPatient());
                int i = 1;
                for (Map.Entry entery : mapPatients.entrySet()) {
                    System.out.println("Порядковый номер: " + i + "; " + "Данные пациента: " + entery);
                    i++;

                }
            }
            if (comm == 2) {
                System.out.println("Вы выбрали " + comm + "-й пункт меню.");
                System.out.println("Вот это очередь тут выстроилась:");


                Comparator<Patients> ncom = new NewAgeComparator();

                TreeSet <Patients> queue = new TreeSet<> (ncom);
                queue.add(one);
                queue.add(two);
                queue.add(three);
                queue.add(four);
                queue.add(five);
                queue.add(six);
                queue.add(seven);
                queue.add(eight);
                queue.add(nine);
                queue.add(ten);
                int i=0;
                for (Patients p: queue) {
                    System.out.println("Порядковый номер: " + i + "; "+ "ID: " + p.getID() + ", "+ "Данные пациента: " + p.getPatient());
                    i++;
                }
            }
        }
    }
}

