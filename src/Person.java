public class Person {
    private String id;
    private Boolean recovered = false;
    private Integer numDoses = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getRecovered() {
        return recovered;
    }

    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }

    public Integer getNumDoses() {
        return numDoses;
    }

    public void setNumDoses(Integer numDoses) {
        this.numDoses = numDoses;
    }
}
