/*
Define a class baby with the following attributes. 
1. Name 
2. Date of Birth 
3. Date on which bcg injection has to be given(60 days from date of birth)  
4. Date on which polio drops to be given.(45 days from date of birth)  
Write a constructor to construct the baby object. The constructor must find out bcg and 
polio drops dates from the date of birth. In the main function define a baby and display 
its details.
*/
import java.util.*;
class Baby{
    String name;
    int dd,mm,yy;
    int bcg_dd,bcg_mm,bcg_yy;
    int polio_dd,polio_mm,polio_yy;
    Scanner ip = new Scanner(System.in);

    Baby(){
        System.out.print("\nFeel Following baby Birthday Detail :-\nName  : ");
        name = ip.nextLine();
	    int day;
        while(true){
            System.out.print("Day   : ");
            dd = ip.nextInt();
            System.out.print("Month : ");
            mm = ip.nextInt(); 
            System.out.print("Year  : ");
            yy = ip.nextInt();

            if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){day = 31;}
            else if( mm == 2){
                if(yy%4==0 && !(yy%100==0 && yy%400!=0)){day = 29;}
                else{day = 28;}
            }
    		else{day = 30;}

            if(dd>day || mm>12 ){
                System.out.println("Invalid Day or Month try again");
                continue;
            }break;
        }
        bcg_dd = polio_dd = dd;
        bcg_mm = polio_mm = mm;
        bcg_yy = polio_yy = yy;
 
        for(int i = 0 ; i < 60 ; i++){
            if(bcg_mm == 1 || bcg_mm == 3 || bcg_mm == 5 || bcg_mm == 7 || bcg_mm == 8 || bcg_mm == 10 || bcg_mm == 12){day = 32;}
            else if(bcg_mm == 2){
                if(bcg_yy%4==0 && !(bcg_yy%100==0 && bcg_yy%400!=0)){day = 30;}
                else{day = 29;}
            }
            else{day = 31;}
            bcg_dd += 1;
            if(bcg_dd == day){
                bcg_mm += 1;
                bcg_dd = 1;
            }
            if(bcg_mm == 13){
                bcg_yy += 1;
                bcg_mm = 1;
            }
            if(i < 45){
                polio_dd += 1;
                if(polio_dd == day){
                    polio_mm += 1;
                    polio_dd = 1;
                }
                if(polio_mm == 13){
                    polio_yy += 1;
                    polio_mm = 1;
                }
            }
        }
    }
    void display(){
        System.out.println("\n===================================\nBABY Name          : "+name+"\nBABY Birthdate     : "+dd+" / "+mm+" / "+yy+"\nBABY Bcg Injection : "+bcg_dd+" / "+bcg_mm+" / "+bcg_yy+"\nBABY Polio Drops   : "+polio_dd+" / "+polio_mm+" / "+polio_yy);
        System.out.println("===================================");
    }
}
class pro_5_021 {
    public static void main(String a[]){
        Baby b1 = new Baby();
        b1.display();
    }   
}

/*
1 January – 31 days
2 February – 28 days in a common year and 29 days in leap years
3 March – 31 dayss
4 April – 30 days
5 May – 31 days
6 June – 30 days
7 July – 31 days
8 August – 31 days
9 September – 30 days
10 October – 31 days
11 November – 30 days
12 December – 31 days

if(bcg_mm == 1 || bcg_mm == 3 || bcg_mm == 5 || bcg_mm == 7 || bcg_mm == 8 || bcg_mm == 10 || bcg_mm == 12){days = 31;}
else if(bcg_mm == 4 ||bcg_mm == 6 ||bcg_mm == 9 ||bcg_mm == 11){days = 30;}
else{
	if(year%4==0 && !(year%100==0 && year%400!=0)){days = 29;}
	else{days = 28;}
}
What is a leap year? To be a leap year, the year number must be divisible by four – except for end-of-century years, which must be divisible by 400. This means that the year 2000 was a leap year, although 1900 was not. 2020, 2024 and 2028 are all leap years.

year%4==0 && !(year%100==0 && year%400!=0)

*/

