public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        int colonIdx = message.indexOf(":");

        machineId = message.substring(0, colonIdx);
        description = message.substring(colonIdx + 1);
    }

    public boolean containsWord(String keyword) {
        int wordIdx = description.indexOf(keyword);

        int desLen = description.length();
        int wordLen = keyword.length();

        if (wordIdx == 0) {
            return true;
        } else if (description.contains(" " + keyword)) {
            return true;
        } else if (wordIdx == desLen - wordLen) {
            return true;
        } else if (description.contains(keyword + " ")) {
            return true;
        } else {
            return false;
        }
    }
}

