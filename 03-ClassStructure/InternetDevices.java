/**
16.There are many devices that can use the Internet: a personal computer, laptop, tablet, smartphone, internet radio or TV.
Define an InternetDevice class to describe such devices.
The class should contain attributes: name (device name), connected (whether a device is connected to the Internet),
and connectedDevices (the number of connected devices - static field). Add a constructor InternetDevice(name) and
methods for device manipulation: connect(), disconnect(), isConnected(), displayStatus(), displayConnections() (static method).
Then write a program that creates five different internet devices, three of which are connected to the Internet.
Display the status of each device and information about the number of devices connected to the Internet. 
 */

public class InternetDevices{
    public static void main(String args[]) {
        InternetDevice PC = new InternetDevice("PC");
        InternetDevice laptop = new InternetDevice("laptop");
        InternetDevice tablet = new InternetDevice("tablet");
        InternetDevice smartphone = new InternetDevice("smartphone");
        InternetDevice TV = new InternetDevice("TV");
        
        PC.connect();
        laptop.connect();
        tablet.disconnect();
        smartphone.connect();
        TV.disconnect();
        
        PC.displayStatus();
        laptop.displayStatus();
        tablet.displayStatus();
        smartphone.displayStatus();
        TV.displayStatus();
        
        InternetDevice.displayConnections();
    }
}
