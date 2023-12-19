import java.util.Scanner;
import java.util.ArrayList;

public class AppointmentTester {

	public static void main(String[] args) {
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		while(true)
		{
			System.out.println("請輸入一個選擇   A/D/S/X (A for add; D for display that day; S for delete; X for display a period of time)");
			Scanner first = new Scanner(System.in);
			char choose = (char) first.next().charAt(0);
			if(choose == 'A' || choose == 'a')
			{
				 System.out.println("輸入一個要新增的appointment :");
                    Scanner in = new Scanner(System.in);
                    System.out.println("請輸入敘述:");
                    String description = in.nextLine();
                    System.out.println("請輸入型態(o代表onetime,d代表daily,m代表monthly):");
                    String type = in.next();
                    System.out.println("請輸入西元年份:");
                    int year = in.nextInt();
                    System.out.println("請輸入月份:");
                    int month = in.nextInt();
                    System.out.println("請輸入日期:");
                    int day = in.nextInt();
                    if(month>12|day>31|day<1|month<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==1&&day>31|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==2&&day>28|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==3&&day>31|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==4&&day>30|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==5&&day>31|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==6&&day>30|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==7&&day>31|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==8&&day>31|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==9&&day>30|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==10&&day>31|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==11&&day>30|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else if(month==12&&day>31|day<1){System.out.println("你在輸三小,輸入錯誤請再次輸入");}
                    else
                    appointments.add(Appointment.addAppointment(year,month,day,description,type));
			}
			else if(choose == 'D' || choose == 'd')
			{
				 System.out.println("輸入一個日期 :");
                 Scanner in = new Scanner(System.in);
                    System.out.println("請輸入欲查詢西元年份:");
                    int year = in.nextInt();
                    System.out.println("請輸入欲查詢月份:");
                    int month = in.nextInt();
                    System.out.println("請輸入欲查詢日期:");
                    int day = in.nextInt();
			      Appointment.displayAppointment(year,month,day,appointments);
            }
            else if(choose == 'S' || choose == 's'){
                Scanner in = new Scanner(System.in);
                    System.out.println("請輸入欲刪除西元年份:");
                    int year = in.nextInt();
                    System.out.println("請輸入欲刪除月份:");
                    int month = in.nextInt();
                    System.out.println("請輸入欲刪除日期:");
                    int day = in.nextInt();
			      Appointment.deleteAppointment(year,month,day,appointments);
            }
            else if(choose == 'X' || choose == 'x'){
                Scanner in = new Scanner(System.in);
                System.out.println("請輸入開始西元年份:");
                    int startyear = in.nextInt();
                    System.out.println("請輸入開始月份:");
                    int startmonth = in.nextInt();
                    System.out.println("請輸入開始日期:");
                    int startday = in.nextInt();
                    System.out.println("請輸入結束西元年份:");
                    int endyear = in.nextInt();
                    System.out.println("請輸入結束月份:");
                    int endmonth = in.nextInt();
                    System.out.println("請輸入結束日期:");
                    int endday = in.nextInt();
                    Appointment.displayAppointment2(startyear, startmonth, startday, endyear, endmonth, endday);
            }
			else
			{
				System.out.println("輸入錯誤請再次輸入 ");
			}
	}
}
}