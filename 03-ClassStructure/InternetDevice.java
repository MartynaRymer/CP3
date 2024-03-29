
/**
16.There are many devices that can use the Internet: a personal computer, laptop, tablet, smartphone, internet radio or TV.
Define an InternetDevice class to describe such devices.
The class should contain attributes: name (device name), connected (whether a device is connected to the Internet),
and connectedDevices (the number of connected devices - static field). Add a constructor InternetDevice(name) and
methods for device manipulation: connect(), disconnect(), isConnected(), displayStatus(), displayConnections() (static method).
Then write a program that creates five different internet devices, three of which are connected to the Internet.
Display the status of each device and information about the number of devices connected to the Internet. 
 */
public class InternetDevice
{
    String name;
    boolean connected = false;
    static int connectedDevices;
    
    public InternetDevice(String name)
    {
        this.name = name;
    }

    void connect(){
        if (connected == false){
          connectedDevices += 1;  
        }
        connected = true;
    }
    void disconnect(){
        if (connected){
          connectedDevices -= 1;  
        }
        connected = false;
    }
    void isConnected(){
        System.out.println("The device " + name + " is " + (connected == false ? "disconnected" : "connected"));
    }
    void displayStatus(){
        System.out.println("The device " + name + " is " + (connected == false ? "disconnected" : "connected"));
    }
    static void displayConnections(){
        System.out.println("There are " + connectedDevices + " devices connected.");
    }
}
