package example;

public class Team {
    int teamID;
    String teamName;
    int grade;
    String address;

    public void showteamInfo(){
        System.out.println(teamName + "," + address);  //첼시
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String name){
        teamName = name;
    }

    public static void main(String[] args) {
        Team studentAhn = new Team();
        studentAhn.teamName = "첼시";

        System.out.println(studentAhn.teamName);
        System.out.println(studentAhn.getTeamName());
    }
}
