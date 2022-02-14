package javaoop.access_specifiers.p1;

import javaoop.access_specifiers.p2.DiffPackageObj;

/**
 * @author zh-hq
 * @Description
 * @date 2022/2/14
 */
public class ThisObj extends DiffPackageObj{
    public String this_pub = "this_public";
    protected String this_pro = "this_protected";
    String this_def = "this_default";
    private String this_pri = "this_private";

    public static void main(String[] args) {
        System.out.println("====当前类(能访问所有成员)===");
        ThisObj thisObj = new ThisObj();
        System.out.println(thisObj.this_pub);
        System.out.println(thisObj.this_pro);
        System.out.println(thisObj.this_def);
        System.out.println(thisObj.this_pri);

        System.out.println("====同一个包(能访问除 private 外的所有成员)===");
        SamePackageObj samePackageObj = new SamePackageObj();
        System.out.println(samePackageObj.pub);
        System.out.println(samePackageObj.pro);
        System.out.println(samePackageObj.def);
        // System.out.println(samePackageObj.pri);  // private   无法访问


        System.out.println("====子类[不同包](能访问 public、protected 成员)===");
        System.out.println(thisObj.pub);
        // 子类可以访问继承过来的 protected 成员
        System.out.println(thisObj.pro);
        // System.out.println(thisObj.def);  // default   无法访问
        // System.out.println(thisObj.pri);  // private   无法访问

        System.out.println("====不同包(只能访问 public 成员)===");
        DiffPackageObj diffPackageObj = new DiffPackageObj();
        System.out.println(diffPackageObj.pub);
        // System.out.println(diffPackageObj.pro);  // protected 无法访问
        // System.out.println(diffPackageObj.def);  // default   无法访问
        // System.out.println(diffPackageObj.pri);  // private   无法访问

    }
}
