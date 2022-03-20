package Exercise5;

public class Hour {
    private int hour;
    private int minutes;
    private int seconds;

    public Hour() {
    }

    public Hour(int hour, int minutes, int seconds) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minutes > 59 || minutes < 0) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
        if (seconds > 59 || seconds < 0) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds() {
        this.seconds = seconds;
    }

    public void plusSecond() {
        if (this.seconds >= 59) {
            plusMinutes();
            this.seconds = 0;
        } else {
            this.seconds++;
        }
    }

    public void downSecond() {
        if (this.seconds <= 0) {
            downMinutes();
            this.seconds = 59;
        } else {
            this.seconds--;
        }
    }

    public void plusMinutes() {
        if (this.minutes >= 59) {
            this.minutes = 0;
            plusHour();
        } else {
            this.minutes++;
        }
    }

    public void downMinutes() {
        if (this.minutes <= 0) {
            this.minutes = 59;
            downHour();
        } else {
            this.minutes--;
        }
    }

    public void plusHour() {
        if (this.hour >= 23) {
            this.hour = 0;
        } else {
            this.hour++;
        }
    }

    public void downHour() {
        if (this.hour <= 0) {
            this.hour = 23;
        } else {
            this.hour--;
        }
    }

    @Override
    public String toString() {
        String hh = String.format("%02d", hour);
        String mm = String.format("%02d", minutes);
        String ss = String.format("%02d", seconds);
        return hh + " : " + mm + " : " + ss;


    }
}
