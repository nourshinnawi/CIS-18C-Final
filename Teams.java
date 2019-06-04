package nba;
import java.util.List;
import java.util.ArrayList;

public class Teams {

    private String name;
    private int identifier;
    private final String record;
    
    public Teams(String name, Integer identifier, String record)   {
        this.name = name;
        this.identifier = identifier;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdentifier() {
        return identifier;
    }
    
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }
    
    public List<Players> players = new ArrayList<>(8);
    private Coaches coach;

    public Coaches getCoach() {
        return coach;
    }

    public void setCoach(Coaches coach) {
        this.coach = coach;
    }
    
    @Override
    public String toString()
    {
        return  "  : " + record + "\n";
    }
}
