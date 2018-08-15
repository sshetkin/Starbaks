public class Main {
    public static void main (String args []) {

        People[] people = {new People("Ivan", "late"), new People("Serg", "capuchino"),
                new People("Zam", "espresso")};

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].name + " - "+ people[i].coffe);
        }
        

    }
}
