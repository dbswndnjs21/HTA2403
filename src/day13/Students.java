package day13;

public class Students {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Students(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        int sum = kor + eng + math;
        float avg = (float) sum / 3;
        return (name + ", " +  ban  + ", "+  no + ", " +  kor + ", " +  eng + ", " +  math + ", " + sum + ", " + avg);
    }

    int getTotal () {
        return kor + eng + math;
    }

    String getAverage() {
        double num = (double) getTotal() / 3;
        String result5 = String.format("%.1f", num);
        return result5;
    }
}
