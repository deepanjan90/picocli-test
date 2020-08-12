package picocli.test;

import picocli.CommandLine;

@CommandLine.Command(name = "add", helpCommand = true)
public class SubCommand2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\n -> Sub Command 2 running !!");
    }
}
