package duke.parser;

import duke.commands.tasks.MarkTaskCommand;
import duke.domain.task.TaskIndex;
import duke.exceptions.ParseException;

public class MarkTaskParser implements IParser<MarkTaskCommand> {

    public MarkTaskCommand parse(String arguments) throws ParseException {
        if (ParserUtil.isNumeric(arguments)) {
            TaskIndex taskIndex = TaskIndex.fromOneBased(Integer.parseInt(arguments));
            return new MarkTaskCommand(taskIndex);
        } else {
            throw new ParseException(
                    "Sorry the second argument is not a number");
        }
    }

}
