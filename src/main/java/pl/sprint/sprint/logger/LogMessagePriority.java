package pl.sprint.sprint.logger;


import java.util.HashMap;

public enum LogMessagePriority
{
	Emergency(5),
	Error(4),
	Info(2),
	Debug(1);

	public static final int SIZE = java.lang.Integer.SIZE;

	private final int intValue;
	private static volatile HashMap<Integer, LogMessagePriority> mappings;
	private static java.util.HashMap<Integer, LogMessagePriority> getMappings()
	{            
            HashMap<Integer, LogMessagePriority> _mappings = LogMessagePriority.mappings;
            
            if (_mappings == null)
            {
                    synchronized (LogMessagePriority.class)
                    {
                        LogMessagePriority.mappings = _mappings;                        
                        if (_mappings == null)
                        {
                                LogMessagePriority.mappings = new java.util.HashMap<>();
                        }
                    }
            }
            return mappings;
	}

	private LogMessagePriority(int value)
	{
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static LogMessagePriority forValue(int value)
	{
		return getMappings().get(value);
	}
}