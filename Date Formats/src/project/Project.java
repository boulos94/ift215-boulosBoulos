
package project;


public class Project {
    
    private int day ;
    private int month;
    private int year;
    private String type;
    private boolean shortDate;
    private boolean longDate;
    private String shortdate2;
    private String longDate2;
    
    public Project (int day,int month,int year, String type,
                    boolean shortDate,boolean longDate){
        
        this.day=day;
        this.month=month;
        this.year=year;
        this.type=type;
        this.shortDate=shortDate;
        this.longDate=longDate;
        
    }

    Project(String shortDate2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getDay (){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }
    
    
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month=month;
   }
    
   
   public int getYear(){
       return year;
   } 
   public void setYear(int year){
       this.year=year;
   }
   
   
   public String getType(){
       return type;
   }
   public void setType(String type){
       this.type=type;
   }
   
   
   public boolean getShortDate(){
       return shortDate;
   }
   public void setShortDate(boolean shortDate){
       this.shortDate=shortDate;
   }
   
   
   public boolean getLongDate(){
       return longDate;
   }
   public void setLongDate(boolean longDate){
       this.longDate=longDate;
   }
   
   
}