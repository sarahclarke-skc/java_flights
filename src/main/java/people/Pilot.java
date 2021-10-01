package people;

public class Pilot extends Person {

    private Rank rank;
    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name);
        this.licenceNumber = licenceNumber;
        this.rank = rank;
    }


    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }


    public String flyPlane() {
        return "I am king of the skies!";
    }
}
