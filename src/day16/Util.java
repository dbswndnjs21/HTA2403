package day16;

public class Util {
    private String jumin;

    public Util(String jumin) {
        this.jumin = jumin;
    }

    public boolean isJuminCheck() {
        String chkJumin = this.jumin.replace("-", ""); // -를 제외한 모든 주민번호

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(chkJumin.substring(i, i + 1)) * arr[i];
        }

        int lastNum = Integer.parseInt(chkJumin.substring(12, 13));

        int resultNum = (11 - (sum % 11)) % 10;

        if (lastNum == resultNum) {
            return true;
        } else {
            return false;
        }

    }
}
