package Exercise2;

import Exercise2.SystemControlSchool.Person.Staff.Staff;
import Exercise2.SystemControlSchool.Person.Students.Students;
import Exercise2.SystemControlSchool.Person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExercise2 {
    public static void exercise2() {
        List<Person> persons = new ArrayList<>();//List hereda de ArrayList
        agreePerson(persons);
        showStudents(persons);
        showStaff(persons);
        showQuantity(persons);
        System.out.println("El profit de la insitución es de: " + getProfit(persons) + " pesos");
    }

    public static void agreePerson(List<Person> persons) {
        Scanner sc = new Scanner(System.in);
        int op;
        char s;
        do {
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    persons.add(getStudent());
                    break;
                }
                case 2 -> {
                    persons.add(getStaff());
                    break;
                }
                case 3 -> {
                    break;
                }
            }
            System.out.println("Desea agregar una nueva persona (S/N)");
            sc.nextLine();
            s = sc.nextLine().charAt(0);
        } while (s == 's');
    }

    public static Students getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        String name = sc.nextLine();
        System.out.println("Apellido:");
        String lastName = sc.nextLine();
        System.out.println("Carrera");
        String career = sc.nextLine();
        System.out.println("Dni:");
        int dni = sc.nextInt();
        System.out.println("Año de ingreso:");
        int year = sc.nextInt();
        System.out.println("Cuota Menual:");
        int fee = sc.nextInt();
        return new Students(name, lastName, dni, year, fee, career);
    }

    public static Staff getStaff() {
        boolean i = false;
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        String name = sc.nextLine();
        System.out.println("Apellido:");
        String lastName = sc.nextLine();
        System.out.println("Dni:");
        int dni = sc.nextInt();
        System.out.println("Salario mensual");
        float salary = sc.nextFloat();
        do {
            System.out.println("1-Turno mañana, 2- Turno tarde");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    i = true;
                }
                case 2 -> {
                }
            }
        } while (op != 1 && op != 2);
        return new Staff(name, lastName, dni, salary, i);
    }

    public static void showStudents(List<Person> persons) {
        for (var students : persons) {
            if (students instanceof Students) {
                System.out.println(((Students) students).toString());
            }
        }
    }

    public static void showStaff(List<Person> persons) {
        for (var staff : persons) {
            if (staff instanceof Staff) {
                System.out.println(((Staff) staff).toString());//Casteo persona a staff ((Tipo de dato)array)
            }

        }
    }

    public static void menu() {
        System.out.println("1- Si sos estudiante");
        System.out.println("2- Si sos del staff");
        System.out.println("3- Salir");

    }

    public static void showQuantity(List<Person> persons) {
        int i = 0;
        int x = 0;
        for (var people : persons) {
            if (people instanceof Staff) {
                i++;
            } else {
                x++;
            }
        }
        System.out.println("Hay " + i + " personas en el staff");
        System.out.println("Hay " + x + " estudiantes");
    }


    public static float getProfit(List<Person> persons) {
        int profit = 0;
        for (var students : persons) {
            if (students instanceof Students) {
                profit += ((Students) students).getFee();
            }

        }
        return profit;
    }

}

