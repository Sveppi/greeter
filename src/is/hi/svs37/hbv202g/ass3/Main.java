package is.hi.svs37.hbv202g.ass3;
import is.hi.svs37.hbv202g.ass3.backend.Greeter;
import is.hi.svs37.hbv202g.ass3.frontend.UserInterface;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        UserInterface ui = new UserInterface();
        String greeting;

        greeter.setEnglish();
        greeting=greeter.greet();
        ui.show(greeting);

        greeter.setGerman();
        greeting=greeter.greet();
        ui.show(greeting);
    }

}