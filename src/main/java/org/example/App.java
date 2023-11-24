package org.example;

import org.example.proxy.CommandExecutor;
import org.example.proxy.CommandExecutorProxy;

public class App {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Admin", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception message:" + e.getMessage());
        }
    }
}
