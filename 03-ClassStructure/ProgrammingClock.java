
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

 */
public class ProgrammingClock
{
    public static void main(String args[]) {
        Clock Clock1 = new Clock(12,47);
        Clock1.displayTime();
        Clock1.setClock(18,14);
        Clock1.displayTime();
        Clock1.setClock(9,3);
        Clock1.displayTime();
        Clock1.setClock(23,58);
        Clock1.displayTime();   
        Clock1.addOneMinute();
        Clock1.displayTime(); 
        Clock1.addOneMinute();
        Clock1.displayTime();     
}
    
}
