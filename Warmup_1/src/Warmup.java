public class Warmup {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        return a + b;
    }

    public int diff21(int n) {
        if (n > 21) {
            return Math.abs(21 - n) * 2;
        }
        return Math.abs(21 - n);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour > 23) {
            return false;
        }

        if (talking == true && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ((a < 0 && b < 0) && negative == true) {
            return true;
        }
        if (((a < 0 && b > 0) || (a > 0 && b < 0)) && negative == false) {
            return true;
        }
        return false;
    }

    public String notString(String str) {
        String not = "not ";
        if (str.length() < 3 && str != null) {
            return not.concat(str);
        }
        String st = str.substring(0, 3);
        if ("not".equals(st)) {
            return str;
        }
        return not.concat(str);
    }

    public String missingChar(String str, int n) {
        if (n > str.length()) {
            return str;
        }

        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1) + str.substring(0, 1);
    }

    public String front3(String str) {
        String st;

        if (str.length() == 0) {
            return str;
        }
        if (str.length() >= 3) {
            st = str.substring(0, 3);
        } else st = str;
        String s = "";
        for (int i = 0; i < 3; i++) {
            s += st;
        }
        return s;
    }

    public String backAround(String str) {

        if (str.length() == 1) {
            return str + str + str;
        }
        return str.substring(str.length() - 1, str.length()) + str + str.substring(str.length() - 1, str.length());
    }

    public boolean or35(int n) {
        if (n < 0) {
            return false;
        }
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }

    public String front22(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.length() == 1) {
            return str + str + str;
        }
        return str.substring(0, 2) + str + str.substring(0, 2);
    }

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String st = str.substring(0, 2);
        if ("hi".equals(st)) {
            return true;
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

    public boolean loneTeen(int a, int b) {
        if (((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) && !((a >= 13 && a <= 19) && (b >= 13 && b <= 19))) {
            return true;
        }
        return false;
    }

    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        String st = str.substring(1, 4);
        if ("del".equals(st)) {
            return str.substring(0, 1) + str.substring(4, str.length());
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String st = str.substring(1, 3);
        if ("ix".equals(st)) {
            return true;
        }
        return false;
    }

    public String startOz(String str) {
        if (str.length() < 2) {
            return str;
        }
        String st = str.substring(0, 1);
        String s = str.substring(1, 2);
        if ("o".equals(st) && "z".equals(s)) {
            return st + s;
        }
        if ("o".equals(st)) {
            return st;
        }
        if ("z".equals(s)) {
            return s;
        }
        return "";
    }

    public int intMax(int a, int b, int c) {
        if (a > b) {
            if (a < c) {
                return c;
            } else {
                return a;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public int close10(int a, int b) {
        if (Math.abs(a - 10) > Math.abs(b - 10)) {
            return b;
        }
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }
        return 0;

    }

    public boolean in3050(int a, int b) {
        if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50))) {
            return true;
        }
        return false;

    }

    public int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
        if (a >= 10 && a <= 20) {
            return a;
        }
        if (b >= 10 && b <= 20) {
            return b;
        }
        return 0;

    }

    public boolean stringE(String str) {
        int p = 0;
        int n = 0;
        while (p != -1) {
            p = str.indexOf("e", p);
            if (p != -1) {
                n++;
                p++;
            }
        }
        if (n >= 1 && n <= 3) {
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        String s = str.substring(str.length() - 3, str.length());
        return str.substring(0, str.length() - 3) + s.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String s = str.substring(0, 1);
        if (str.length() < n) {
            return s;
        }
        int p = 0;
        s = "";

        while (p < str.length()) {
            s = s + str.substring(p, p + 1);
            p += n;
        }
        return s;

    }
}
