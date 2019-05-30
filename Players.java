package nba;
import java.util.ArrayList;
import java.util.Comparator;

public class Players implements Comparable<Players> {

    private Teams team;
    private int jerseyNumber;
    private String position;
    private String name;
    
    public Players(Teams team, int jerseyNumber, String position, String name)
    {
        this.team = team;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.name = name;
    }

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   @Override
   public int compareTo(Players o)
   {
       return this.name.compareTo(o.name);
   }   
   
   @Override
   public String toString()
   {
       return name + " - " + jerseyNumber + " - " + position;
   }
}