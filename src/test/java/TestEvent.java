import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;


public class TestEvent {

    public Locale localRus() {
        return new Locale("ru", "RU");
    }

    public Locale localEn() {
        return new Locale("en", "EN");
    }

    @Test
    public void testNightFirstLocal(){

        HelloWorld event = new HelloWorld(15);

        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый день, Мир! в 9.00 - 19.00");
    }

    @Test
    public void testNightSecondLocal(){

        HelloWorld event = new HelloWorld(5);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Доброй ночи, Мир! в 23.00 - 6.00");
    }

    @Test
    public void testNightFirst(){

        HelloWorld event = new HelloWorld(23);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Доброй ночи, Мир! в 23.00 - 6.00");
    }

    @Test
    public void testNightSecond(){

        HelloWorld event = new HelloWorld(3);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good night, World! in 23.00 - 6.00");
    }

    @Test
    public void testNightThree(){
        HelloWorld event = new HelloWorld(1);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good night, World! in 23.00 - 6.00");
    }

    @Test
    public void testNightFour(){
        HelloWorld event = new HelloWorld(2);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good night, World! in 23.00 - 6.00");
    }

    @Test
    public void testMorningFirst(){
        HelloWorld event = new HelloWorld(6);
        Assert.assertEquals(event.getWorld(), "morning");
    }

    @Test
    public void testMorningSecond(){
        HelloWorld event = new HelloWorld(8);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Доброе утро, Мир! в 6.00 - 9.00");
    }

    @Test
    public void testMorningThree(){
        HelloWorld event = new HelloWorld(7);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good morning, World! in 6.00 - 9.00");
    }


    @Test
    public void testDayFirst(){
        HelloWorld event = new HelloWorld(9);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый день, Мир! в 9.00 - 19.00");
    }

    @Test
    public void testDaySecond(){
        HelloWorld event = new HelloWorld(18);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good day, World! in 9.00 - 19.00");
    }

    @Test
    public void testDayThree(){
        HelloWorld event = new HelloWorld(17);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good day, World! in 9.00 - 19.00");
    }

    @Test
    public void testDayFour(){
        HelloWorld event = new HelloWorld(16);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый день, Мир! в 9.00 - 19.00");
    }

    @Test
    public void testEveningFirst(){
        HelloWorld event = new HelloWorld(19);
        Assert.assertEquals(event.getWorld(), "evening");
    }

    @Test
    public void testEveningSecond(){
        HelloWorld event = new HelloWorld(22);
        Assert.assertEquals(event.getWorld(), "evening");
    }

    @Test
    public void testEveningThree(){
        HelloWorld event = new HelloWorld(21);
        Assert.assertEquals(event.printLocal(event.getWorld(),localRus()), "Добрый вечер, Мир! в 19.00 - 23.00");
    }

    @Test
    public void testEveningFour(){
        HelloWorld event = new HelloWorld(20);
        Assert.assertEquals(event.printLocal(event.getWorld(),localEn()), "Good evening, World! in 19.00 - 23.00");
    }

}
