/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgrieskirchen.pos.dreia.eongun18;


import java.util.Scanner;

/**
 *
 * @author eongu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        System.out.println("1...HalloJavaMitForEach");
        System.out.println("2...numberTesterM");
        System.out.println("3...AbstractCalculatorM");
        int ausw = Integer.parseInt(sc.nextLine());
        switch(ausw){
            case 1:
                main.HalloJavaMitForEachM();
                break;
            case 2:
                main.numberTesterM();
                break;
            case 3:
               
                break;
            default:
                System.out.println("FEHLER!!");
        }
    }

    private int auswUnterM() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Operation");
        System.out.println("1 - add");
        System.out.println("2 - substract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter Numbers again");
        return Integer.parseInt(sc.nextLine());
    }

    private void AbstractCalculatorM() {
        RationalCalculator rc = new RationalCalculator(
                (Number x, Number y) -> {
                    Number n = new Number(x.getA() + y.getA(), 1);
                    double newNenner = x.getB() * y.getB();
                    double newZforX = x.getA() * y.getB();
                    double newZforY = y.getA() * x.getB();

                    return new Number(newZforX + newZforY, newNenner);
                }, (Number x, Number y) -> {
                    Number n = new Number(x.getA() + y.getA(), 1);
                    double newNenner = x.getB() * y.getB();
                    double newZforX = x.getA() * y.getB();
                    double newZforY = y.getA() * x.getB();

                    return new Number(newZforX - newZforY, newNenner);
                }, (Number x, Number y) -> {
                    return new Number(x.getA() * y.getA(), x.getB() * y.getB());
                }, (Number x, Number y) -> {
                    return new Number(x.getA() * y.getB(), x.getB() * y.getA());
                });

        VectorCalculator vc = new VectorCalculator(
                (Number x, Number y) -> {
                    return new Number(x.getA() + y.getA(), x.getB() + y.getB());
                }, (Number x, Number y) -> {
                    return new Number(x.getA() - y.getA(), x.getB() - y.getB());
                }, (Number x, Number y) -> {
                    //Kruez
                    return new Number((x.getA() * y.getB()) - (x.getB() * y.getA()), 0);
                }, (Number x, Number y) -> {
                    //Skalar
                    return new Number((x.getA() * y.getA()) + (x.getB() * y.getB()), 0);
                });

        ComplexCalculator cc = new ComplexCalculator(
                (Number x, Number y) -> {
                    return new Number(x.getA() + y.getA(), x.getB() + y.getB());
                }, (Number x, Number y) -> {
                    return new Number(x.getA() - y.getA(), x.getB() - y.getB());
                }, (Number x, Number y) -> {
                    Number n = new Number(x.getA() * y.getA(), x.getA() * y.getB());
                    Number n2 = new Number(x.getB() * y.getA(), x.getB() * y.getB());
                    return new Number(n.getA() + n2.getB() * (-1), n.getB() + n2.getA());
                }, (Number x, Number y) -> {
                    Number a = new Number(x.getA() * y.getA(), x.getA() * y.getB() * (-1));
                    Number a2 = new Number(x.getB() * y.getA(), x.getB() * y.getB() * (-1));
                    Number a3 = new Number(a.getA() + a2.getB() * (-1), a.getB() + a2.getA());

                    Number e = new Number(y.getA() * y.getA(), y.getA() * y.getB() * (-1));
                    Number e2 = new Number(y.getB() * y.getA(), y.getB() * y.getB() * (-1));
                    Number e3 = new Number(e.getA() * e2.getB() * (-1), 0);

                    return new Number(a3.getA() / e3.getA(), a3.getB() / e3.getA());
                });

        Scanner sc = new Scanner(System.in);
        int auswM;
        do {
            System.out.println("Choose Calculator");
            System.out.println("1 - RationalCalculator");
            System.out.println("2 - VectorCalculator");
            System.out.println("3 - ComplexCalculator");
            System.out.println("4 - Exit");
            auswM = Integer.parseInt(sc.nextLine());
            if (auswM == 4) {
                break;
            }
            Main m = new Main();

            //RationalC
            System.out.println("A/X");
            int ax = Integer.parseInt(sc.nextLine());
            System.out.println("A/Y");
            int ay = Integer.parseInt(sc.nextLine());
            Number x = new Number(ax, ay);

            System.out.println("B/X");
            int bx = Integer.parseInt(sc.nextLine());
            System.out.println("B/Y");
            int by = Integer.parseInt(sc.nextLine());
            Number y = new Number(bx, by);

            switch (auswM) {
                case 1:
                    switch (m.auswUnterM()) {
                        case 1:
                            //Add
                            System.out.println(rc.add(x, y).getA() + "/" + rc.add(x, y).getB());
                            break;
                        case 2:
                            //Sub
                            System.out.println(rc.substract(x, y).getA() + "/" + rc.substract(x, y).getB());
                            break;
                        case 3:
                            //Mult
                            System.out.println(rc.multiply(x, y).getA() + "/" + rc.multiply(x, y).getB());
                            break;
                        case 4:
                            //Div
                            System.out.println(rc.divide(x, y).getA() + "/" + rc.divide(x, y).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    //VectorCalculator
                    switch (m.auswUnterM()) {
                        case 1:
                            System.out.println(vc.add(x, y).getA() + "/" + vc.add(x, y).getB());
                            break;
                        case 2:
                            System.out.println(vc.substract(x, y).getA() + "/" + vc.substract(x, y).getB());
                            break;
                        case 3:
                            System.out.println(vc.multiply(x, y).getA() + "/" + vc.multiply(x, y).getB());
                            break;
                        case 4:
                            System.out.println(vc.divide(x, y).getA() + "/" + vc.divide(x, y).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    //ComplexCalculator
                    switch (m.auswUnterM()) {
                        case 1:
                            System.out.println(cc.add(x, y).getA() + "/" + cc.add(x, y).getB());
                            break;
                        case 2:
                            System.out.println(cc.substract(x, y).getA() + "/" + cc.substract(x, y).getB());
                            break;
                        case 3:
                            System.out.println(cc.multiply(x, y).getA() + "/" + cc.multiply(x, y).getB());
                            break;
                        case 4:
                            System.out.println(cc.divide(x, y).getA() + "/" + cc.divide(x, y).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;
            }
        } while (auswM != 4);
    }

    private void numberTesterM() {
        NumberTester nt = new NumberTester("NumbersForTest.txt");

        nt.setOddEvenTester((n) -> {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        });

        nt.setPrimeTester((n) -> {
            for (int i = 2; i < n; i++) {
                int a = n % i;
                if (a == 0) {
                    return false;
                }
            }
            return true;
        });

        nt.setPalindromeTester((n) -> {
            String zahl = n+"";
            char[] arr = zahl.toCharArray();
            int len =  arr.length-1;
            for(int y=0, j = len; y<len; y++, j--){
                if(arr[y] != arr[j]){
                    return false;
                }
            }
            return true;
        });

        nt.testFile();
    }

    private void HalloJavaMitForEachM() {
        HalloJavamitForEach e = new HalloJavamitForEach();
        e.printList();
        e.printList2();
        e.printList3();
        e.printList4();
    }
}
