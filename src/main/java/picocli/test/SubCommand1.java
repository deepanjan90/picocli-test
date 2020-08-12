package picocli.test;

import picocli.CommandLine;

@CommandLine.Command(name = "list", helpCommand = true, subcommands = { SubSubCommand1.class, SubSubCommand2.class })
public class SubCommand1 implements Runnable {

    @Override
    public void run() {
        System.out.println("\n -> Sub Command 1 running !!");
    }
}
