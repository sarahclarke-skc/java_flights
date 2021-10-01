package person;

public class Pilot extends Person {

    private Rank rank;
    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name);
        this.licenceNumber = licenceNumber;
        this.rank = rank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

   public Rank getRank() {
        return rank;
   }

    public String flyPlane() {
        return "I am king of the skies!";
    }
}
