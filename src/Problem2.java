public class Problem2 {

    public static void main(String[] args) {
        String[] people = {"s01","s02","s03","s04","s05","s06","s07","s08","s09","s10"};
        String[] recoveredPeople = {"s03","s06","s09"};
        String[] oneDosePeople = {"s02","s04","s06"};
        String[] anotherDosePeople = {"s08", "s06", "s10"};

        Campus campus = new Campus();

        campus.plan(people, recoveredPeople, oneDosePeople, anotherDosePeople);

        int numberOfEligiblePeople = campus.countEligible();

        System.out.println("number of eligible people: " + numberOfEligiblePeople);
    }
}
