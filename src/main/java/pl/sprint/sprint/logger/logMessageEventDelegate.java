package pl.sprint.sprint.logger;


@FunctionalInterface
public interface logMessageEventDelegate
{
    void invoke(String logMessage);
}