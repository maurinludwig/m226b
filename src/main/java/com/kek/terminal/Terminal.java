package com.kek.terminal;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.impl.Arguments;
import net.sourceforge.argparse4j.inf.ArgumentParser;

/**
 *
 */
public class Terminal {

    public static void main(String[] args) {
        ArgumentParser parser = ArgumentParsers.newFor("terminal").build()
                .description("Process bus destinations and dates.");
        parser.addArgument("--start")
                .metavar("ZURICH/BERN/BASEL/MELS")
                .required(true)
                .help("Start location");
        parser.addArgument("--destination")
                .metavar("CHUR/WINTERTHUR/RAPPERSWIL/GENF")
                .required(true)
                .help("Destination");
        parser.addArgument("--departure-time")
                .metavar("XX:XX")
                .required(true)
                .help("Departure time");



    }


}
