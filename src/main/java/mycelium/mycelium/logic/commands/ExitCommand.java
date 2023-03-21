package mycelium.mycelium.logic.commands;

import mycelium.mycelium.logic.uiaction.ExitAction;
import mycelium.mycelium.model.Model;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_EXIT_ACKNOWLEDGEMENT = "Exiting Address Book as requested ...";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(
            MESSAGE_EXIT_ACKNOWLEDGEMENT,
            new ExitAction());
    }

}