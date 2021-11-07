public class Lamps {
        public static void main(String args[]) {
            Lamp LampOne = new Lamp(1);
            Lamp LampTwo = new Lamp(2);

        LampOne.switchOn();
        LampTwo.switchOff();

        LampOne.displayInfo();
        LampTwo.displayInfo();
}
}