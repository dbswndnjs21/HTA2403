package day17_5_9.Ex7_15;

public class Ex7_15 {
    public static void main(String[] args) {
        Outer2 oc = new Outer2();
        Outer2.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer2.StaticInner.cv : " + Outer2.staticInner.cv);

        Outer2.staticInner si = new Outer2.staticInner();
        System.out.println("si.iv :" + si.iv);
    }
}
