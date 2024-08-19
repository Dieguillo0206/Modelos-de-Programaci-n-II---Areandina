public class FcBarcelona {
    int foundationYear;
    String stadium;
    String coach;
    String president;
    String country = "Spain";
    String league = "La Liga";
    String internationalCompetition = "UEFA Champions League";



    public static void main(String[] args) {
        FcBarcelona FcBarcelona = new FcBarcelona();
        FcBarcelona.foundationYear = 1899;
        FcBarcelona.stadium = "Camp Nou";
        FcBarcelona.president = "Joan Laporta";
        FcBarcelona.coach = "Hansi Flick";
        FcBarcelona.country = "Spain";
        FcBarcelona.league = "La Liga";
        FcBarcelona.internationalCompetition = "UEFA Champions League";
        FcBarcelona.show();
    }

    public void show() {
        System.out.println("Foundation Year: " + foundationYear);
        System.out.println("Stadium: " + stadium);
        System.out.println("Coach: " + coach);
        System.out.println("President: " + president);
        System.out.println("Country: " + country);
        System.out.println("League: " + league);
        System.out.println("International Competition: " + internationalCompetition);
    }
}
