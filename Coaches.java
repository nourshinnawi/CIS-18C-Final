package nba;

public class Coaches {

    protected String name;
    private Integer record;
    
    public Coaches(String name, Integer record)   {
        this.name = name;
        this.record = record;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }   
    
    @Override
    public String toString()
    {
        return name +" - " + " Coached for: " + record + " years";
    }
}
