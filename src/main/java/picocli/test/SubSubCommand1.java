package picocli.test;

import picocli.CommandLine;

@CommandLine.Command(name = "ssub1", helpCommand = true)
public class SubSubCommand1 implements Runnable {

    @Override
    public void run() {
        System.out.println("\n -> Sub Sub Command 1 running !!");
    }
}
