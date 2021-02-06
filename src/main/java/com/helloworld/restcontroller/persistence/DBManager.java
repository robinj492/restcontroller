package com.helloworld.restcontroller.persistence;

import java.sql.SQLException;

import org.h2.tools.Server;

public class DBManager {

    private static void startDB() throws SQLException {
        Server.createTcpServer("-tcpPort", "8080", "-tcpAllowOthers").start();


    }

    private static void stopDB() throws SQLException {
        Server.shutdownTcpServer("tcp://localhost:8080", "", true, true);
    }

    public static void main(String[] args) {

        try {
            Class.forName("org.h2.Driver");
//            startDB();
            stopDB();
//            if (args.length > 0) {
//                if (args[0].trim().equalsIgnoreCase("start")) {
//                    startDB();
//                }
//
//                if (args[0].trim().equalsIgnoreCase("stop")) {
//                    stopDB();
//                }
//            } else {
//                System.err
//                        .println("Please provide one of following arguments: \n\t\tstart\n\t\tstop");
//            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
