package day8_2;

import day8.AccessModifiers;

public class NextPackage extends AccessModifiers {
    public static void main(String[] args)
    {
        NextPackage nxtpkg=new NextPackage();
        System.out.println(nxtpkg.pub);
        System.out.println(nxtpkg.pro);
        nxtpkg.pub();
        nxtpkg.pro();
    }
}
