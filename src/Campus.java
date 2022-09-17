import java.util.Arrays;
import java.util.HashMap;

public class Campus {

    private HashMap<String, Person> personCollection = new HashMap<>();

    public void plan(String[] people, String[] recoveredPeople, String[] oneDosePeople, String[] anotherDosePeople) {

        for (String id : people) {
            Person newPerson = new Person();
            newPerson.setId(id);

            this.personCollection.put(id, newPerson);
        }

        for (String id : recoveredPeople) {
            if (this.personCollection.containsKey(id)) {
                this.personCollection.get(id).setRecovered(true);
            }
        }

        for (String id : oneDosePeople) {
            if (this.personCollection.containsKey(id)) {
                this.personCollection.get(id).setNumDoses(1);
            }
        }

        for (String id : anotherDosePeople) {
            if (this.personCollection.containsKey(id)) {
                this.personCollection.get(id).setNumDoses(2);
            }
        }
    }

    public Boolean isEligible(String id) {
        Person personWithId = this.personCollection.get(id);

        return (personWithId.getRecovered()) || (personWithId.getNumDoses() == 2);
    }

    public int countEligible() {
        int count = 0;

        for (Person p : this.personCollection.values()) {
            if (isEligible(p.getId())) count++;
        }

        return count;
    }
}
