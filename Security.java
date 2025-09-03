package transport;

public final class Security {
    private Security() {
	}

    public static boolean canFly(String place) {
    	if ("ExamCell".equals(place)) {
            return false;
        }
        return true;
    }
    }

