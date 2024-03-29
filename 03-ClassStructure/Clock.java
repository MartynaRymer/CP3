
/**
20.Define a class Clock that represents a digital clock. It has two attributes: hour and minute. The hour value ranges from 0 to 23. The minute value
ranges from 0 to 59. Next, define the following constructors:
a.Clock() – initialises clock to 00:00
b.Clock(hour,minute) – initialises clock to hour:minute
Then, define methods:
c.setClock(hour,minute)
d.setClock() - reset clock to 00:00
e.displayTime()
f.addOneMinute()
After that, write a program that:
g.creates a clock with starting time 12:47
h.displays time
i.sets a clock to 18:14
j.displays time
k.sets a clock to 09:03
l.displays time
m.sets a clock to 23:58
n.displays time
o.adds one minute
p.displays time
q.adds one minute
r.displays time

21.Add an alarm function to the clock. Complete the class definition with the attributes: alarmHour, alarmMinute.
Add methods: setAlarm(hour, minute) and runAlarm(), which displays the "beep-beep-beep-beep !!" alarm sound.
Turn on the alarm when the alarm time is the same as the clock time(compare times in the addOneMinute() method). 
 */
public class Clock
{
    int minute;
    int hour;
    int alarmHour;
    int alarmMinute;
    
    public Clock()
    {
        this.minute = 0;
        this.hour = 0;
    }
    public Clock(int hour,int minute)
    {
        this.minute = minute;
        this.hour = hour;
    }

    public void setClock(int hour,int minute)
    {
        
       if (hour < 0 || hour > 23) {
             throw new IllegalArgumentException();
        } else {
          this.hour = hour;
        }        
        
       if (minute < 0 || minute > 59) {
             throw new IllegalArgumentException();
        } else {
          this.minute = minute;
        }          
    }
    
     public void setClock()
    {
        this.minute = 0;
        this.hour = 0;
    }
    
    public void displayTime()
    {
        System.out.println("The time is: " + String.format("%02d",  hour) + ":" + String.format("%02d",  minute));
    }
    
    public void addOneMinute()
    {
        if (this.minute != 59){
            this.minute += 1;}
        else {
            this.minute = 0;
            if (this.hour != 23){
            this.hour += 1;}
            else{
            this.hour = 0;
            }
        }
        
        if (this.hour == this.alarmHour && this.minute == this.alarmMinute){
        runAlarm();}
        }
        
        
    public void setAlarm(int hour, int minute){
        this.alarmMinute = minute;
        this.alarmHour = hour;
    }
        
    public void runAlarm(){
        System.out.println("beep-beep-beep-beep!!!");
    }
        
    }    

