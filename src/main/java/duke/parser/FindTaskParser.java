package duke.parser;

import duke.commands.tasks.FindTaskCommand;

public class FindTaskParser implements IParser<FindTaskCommand> {

    @Override
    public FindTaskCommand parse(String arguments) {
        return new FindTaskCommand(arguments);
    }

}
