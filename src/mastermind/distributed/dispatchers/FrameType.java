package mastermind.distributed.dispatchers;

public enum FrameType {
	START,
	STATE,
	RESULT,
	PROPOSITION,
	IS_WINNER,
	ATTEMPT,
	UNDO,
	REDO,
	IS_UNDOABLE,
	IS_REDOABLE,
	END,
	RESUME,
	CLOSE;
	
	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if(frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
}
