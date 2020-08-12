/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package picocli.test;

import picocli.CommandLine;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new CommandMain());
        commandLine.setExecutionStrategy(new CommandLine.RunLast());
        System.out.println(commandLine.execute(args));

        System.out.println(new App().getGreeting());
    }
}
