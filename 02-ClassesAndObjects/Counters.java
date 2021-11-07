public class Counters {
    public static void main(String args[]) {
        Counter CounterOne = new Counter();

        CounterOne.increaseByTen();
        CounterOne.increaseByTen();
        CounterOne.increaseByOne();
        CounterOne.increaseByOne();
        CounterOne.increaseByOne();
        CounterOne.displayValue();
        
        Counter CounterTwo = new Counter();
        for (int i = 0; i < 4; i++) {
            CounterTwo.decreaseByTen();
        }
        for (int i = 0; i < 7; i++) {
            CounterTwo.decreaseByOne();
        }
        CounterTwo.displayValue();
}
}
