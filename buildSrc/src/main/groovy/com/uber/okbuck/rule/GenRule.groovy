package com.uber.okbuck.rule

final class GenRule extends BuckRule {

    private final String lintw
    private final Set<String> inputs
    private final Set<String> bashCmds
    private final boolean globSrcs
    private final String output

    GenRule(String name,
            List<String> inputs,
            List<String> bashCmds,
            boolean globSrcs = false,
            String output = "${name}_out") {
        super("genrule", name)
        this.lintw = lintw
        this.inputs = inputs
        this.bashCmds = bashCmds
        this.globSrcs = globSrcs
        this.output = output
    }

    @Override
    final void printContent(PrintStream printer) {
        if (!inputs.empty) {
            printer.println(globSrcs ? "\tsrcs = glob([" : "\tsrcs = [")
            for (String input : inputs) {
                printer.println("\t\t'${input}',")
            }
            printer.println(globSrcs ? "\t])," : "\t],")
        }

        printer.println("\tout = '${output}',")
        printer.println("\tbash = '' \\")
        bashCmds.each {
            printer.println("\t'${it} ' \\")
        }
        printer.println("\t'',")
    }
}
