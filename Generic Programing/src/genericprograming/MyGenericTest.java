/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericprograming;

import javax.swing.JButton;

/**
 *
 * @author LABKOM
 */
public class MyGenericTest {

    public static void main(String[] args) {
        MyGeneric<JButton> iOb = new MyGeneric<>(new JButton("OK"));
        iOb.showType();
    }
}
