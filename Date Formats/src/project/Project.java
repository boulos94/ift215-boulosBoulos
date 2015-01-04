
package project;


public class Project {
    
    private int day ;
    private int month;
    private int year;
    private String Type;
    private boolean shortDate;
    private boolean longDate;
    private String txtShortDate;
    private String txtLongDate;
    private String shortDate2;
    private String longDate2;
    
    public Project (int day,int month,int year, String type,
                    boolean shortDate,boolean longDate,String txtShortDate, String txtLongDate,String shortDate2,String longDate2){
        
        this.day=day;
        this.month=month;
        this.year=year;
        this.Type=type;
        this.shortDate=shortDate;
        this.longDate=longDate;
        this.txtLongDate=txtLongDate;
        this.txtShortDate=txtShortDate;
        this.shortDate2=shortDate2;
        this.longDate2=longDate2;
        
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
       return Type;
   }
   public void setType(String type){
       this.Type=type;
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
   
    public String getTxtShortDate(){
       return txtShortDate;
   }
   public void setTxtShortDate(String txtShortDate){
       this.txtShortDate=txtShortDate;
   }
   
    public String getTxtLongDate(){
       return txtLongDate;
   }
   public void setTxtLongDate(String txtLongDatee){
       this.txtLongDate=txtLongDate;
   }
   
    public String getShortDate2(){
       return shortDate2;
   }
   public void setShortDate2(String shortDate2){
       this.shortDate2=shortDate2;
   }
   
   
    public String getLongDate2(){
       return longDate2;
   }
   public void setLongDate2(String longDate2){
       this.longDate2=longDate2;
   }
   
   public String longMonth (){
       String longM = null ;
       switch (month){
           case 1:
               this.month=1;
               longM = "january";
               break;
           case 2:
               this.month=2;
               longM = "february";
               break;
           case 3:
               this.month=3;
               longM = "march";
               break;
           case 4:
               this.month=4;
               longM = "april";
               break;
           case 5:
               this.month=5;
               longM = "may";
               break;
           case 6:
               this.month=6;
               longM = "june";
               break;
           case 7:
               this.month=7;
               longM = "july";
               break;
           case 8:
               this.month=8;
               longM = "august";
               break;
           case 9:
               this.month=9;
               longM = "september";
               break;
           case 10:
               this.month=10;
               longM = "october";
               break;
           case 11:
               this.month=11;
               longM = "novemver";
               break;
           case 12:
               this.month=12;
               longM = "december";
               break;
           default: longM=" ";
               
       }
        return longM;
   }
   
   public String zeroM(){
       String zeroM =null;
       if((this.month>=1)&&(this.month<=9))
           zeroM ="0"+this.month;
       else this.month=this.month;
       return zeroM;
       
   }
   

   
   public String zeroD(){
       String zeroD= null;
      if((this.day>=1)&&(this.day<=9))
          zeroD="0"+this.day;
      else this.day=this.day;
      return zeroD;
   }
   
   
   public String getShortDates12(){
       String shortDates12;
       shortDates12=" ";
       return shortDates12;
   }
   
   
   public String getShortDates1(){
       String shortDates1;
       shortDates1=zeroM()+"/"+zeroD()+"/"+year;
       return shortDates1;
   }
   
 
   public String getShortDates2(){
       String shortDates2;
       shortDates2=year+"-"+zeroM()+"-"+zeroD();
       return shortDates2;
   }
   
  public String getDateForm(){
        String dateForm = null;
        if (txtShortDate == "MM/dd/yy")
            dateForm=getShortDates1();
        else if(txtShortDate == "yyyy-MM-dd")
            dateForm=getShortDates2();
        return dateForm;
  }
        
        
   public String getLongDates12(){
        String longDates12;
        longDates12=" ";
        return longDates12;}
   
   
   
   public String getLongDates(){
        String longDates;
        longDates=longMonth()+" "+zeroD()+","+year;
        return longDates;
    }
   
   
}