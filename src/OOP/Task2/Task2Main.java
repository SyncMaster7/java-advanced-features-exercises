package OOP.Task2;

public class Task2Main {
    public static void main(String[] args) {
        Person peeter = new Student("Peeter", "Hullumullu 2", "Weekends",
                2022, 2967.90f);
        System.out.println(peeter);

        System.out.println("\n========= Lecturer Annely =========");

        Lecturer annely = new Lecturer();
        annely.setName("Annely");
        annely.setAddress("Annelinn");
        annely.setSalary(1890.9f);
        annely.setSpecialization("Computer Science");
        System.out.println("Hei, my name is " + annely.getName() + ". My specialization is " + annely.getSpecialization() + ".");
    }
}
