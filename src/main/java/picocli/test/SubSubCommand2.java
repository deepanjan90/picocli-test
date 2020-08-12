package picocli.test;

import picocli.CommandLine;

@CommandLine.Command(name = "ssub2", helpCommand = true)
public class SubSubCommand2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\n -> Sub Sub Command 2 running !!");
    }
}
