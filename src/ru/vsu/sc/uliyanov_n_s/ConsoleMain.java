package ru.vsu.sc.uliyanov_n_s;

import ru.vsu.sc.uliyanov_n_s.Utils.ListUtils;

import java.io.PrintStream;
import java.util.List;

public class ConsoleMain {
    public static class CmdParams {
        public String inputFile;
        public String outputFile;
        public boolean error;
        public boolean help;
    }

    public static CmdParams parseArgs(String[] args) {
        ConsoleMain.CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }

            params.inputFile = args[0];

            if (args.length > 1) {
                params.outputFile = args[1];
                return params;
            } else
                params.outputFile = null;


        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }

    public static void main(String[] args) throws Exception {
        CmdParams params = parseArgs(args);
        Highlighter highlighter = new Highlighter();


        if (params.help) {
            printHelpMsg(params);
        } else {
            List<String> list = ListUtils.readListFromFile(params.inputFile);

            if (list == null) {
                System.err.printf("Can't read list from \"%s\"%n", params.inputFile);
                System.exit(2);
            }

           List<String> result = highlighter.highlightText(list);


            if (params.outputFile != null) {
                ListUtils.writeListToFile(params.outputFile, result);
            } else {
                ListUtils.printListInConsole(result);
            }
        }
    }

    private static void printHelpMsg(CmdParams params) {
        PrintStream out = params.error ? System.err : System.out;
        out.println("Usage:");
        out.println("  <cmd> args <placesValue> <input-file> (<output-file>)");
        out.println("  <cmd> --help");
        out.println("  <cmd> --window  // show window");
        System.exit(params.error ? 1 : 0);
    }
}
