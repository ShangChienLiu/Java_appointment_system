import java.util.ArrayList;

public class Appointment {
	private int year, month, day;
	private String description;	
	public static ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	public Appointment(int year, int month, int day, String description)
	{
	   this.year = year;
	   this.month = month;
	   this.day = day;
	   this.description = description;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	
	public boolean occursOn(int year,int month, int day)
	{
		return ((year == this.year) && (month == this.month) && (day == this.day));
	}
	
	
	public static Appointment addAppointment(int y,int m,int d, String des, String type)
	{
		char[] t = type.toCharArray();
		Appointment App = new Appointment(y,m,d,des);
		if(t[0] == 'O' || t[0] == 'o')
			App = new Onetime(y,m,d,des);
		if(t[0] == 'D' || t[0] == 'd')
			App = new Daily(y,m,d,des);
		if(t[0] == 'M' || t[0] == 'm')
			App = new Monthly(y,m,d,des);
			appointments.add(App);
		return App;
	}
	
	public static void displayAppointment(int year, int month,int day, ArrayList<Appointment> appointments)
	{
		for(int i = 0; i < appointments.size(); i++){
		if (appointments.get(i).occursOn(year, month, day))
			{
			   System.out.println(appointments.get(i));
            }
		}
	}
	    public String toString() {
	      //return "\n"+"year :" + year +"\n"+"month :" + month +"\n"+ "day:" + day +"\n"+ description;
		  return description;
	    }
	public static void displayAppointment2(int startyear, int startmonth, int startday, int endyear, int endmonth,int endday){
		for(Object arraylist:appointments){
			boolean distinctTheTime =time(startyear,startmonth,startday,endyear,endmonth,endday);
				if (arraylist instanceof Onetime) {
						Onetime ss = (Onetime) arraylist;
						if(locateIn(startyear,startmonth,startday,endyear,endmonth,endday,ss.getYear(), ss.getMonth(), ss.getDay()))
						System.out.printf("%s \n",ss.toString());
			}
				if (arraylist instanceof Daily) {
					if (((Appointment) arraylist).occursOn(endyear, endmonth, endday)) {
						Daily ss = (Daily) arraylist;
						System.out.printf("%s \n",ss.toString());
					}
				}
				if(arraylist instanceof Monthly) {
					Monthly ss=(Monthly)arraylist;
					if(distinctTheTime && ss.getMonth()*30+ss.getYear()*365+ss.getDay()-endyear*365-endmonth*30-endday<0){
						System.out.printf("%s \n",ss.toString());
					}
					else{
							if(startmonth!=endmonth)
							if((startday<ss.getDay()&&ss.getDay()<30) || (endday>ss.getDay()))
							System.out.printf("%s \n",ss.toString());
							if(startmonth==endmonth)
							if(startday<ss.getDay()&&ss.getDay()<endday)
								System.out.printf("%s \n",ss.toString());
					}
				}
			}
		}
		
	
	public static boolean time(int startyear, int startmonth, int startday, int endyear, int endmonth,int endday){
		if(startyear*365+startmonth*30+startday-endyear*365-endmonth*30-endday>30){
		return true;}
		else return false;
	}
	public static boolean locateIn(int startyear, int startmonth, int startday, int endyear, int endmonth,int endday,int currentyear,int currentmonth,int currentday){
        if(startyear*365+startmonth*30+startday<currentday+currentmonth*30+currentyear*365 && currentday+currentmonth*30+currentyear*365<endyear*365+endmonth*30+endday){
            return true;
        }
        else return false;
    }

    public static void deleteAppointment(int year, int month, int day, ArrayList<Appointment> appointments){
        for(int i = 0; i < appointments.size(); i++){
            if (appointments.get(i).occursOn(year, month, day))
                {
                   appointments.remove(i);
                }
            }
    }
}