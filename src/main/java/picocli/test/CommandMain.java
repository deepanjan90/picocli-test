package picocli.test;

import picocli.CommandLine;

@CommandLine.Command(name = "plugin", helpCommand = true, subcommands = { SubCommand1.class, SubCommand2.class })
public class CommandMain implements Runnable {

    @Override
    public void run() {
        System.out.println("\n -> Command Main running !!");
    }
}
