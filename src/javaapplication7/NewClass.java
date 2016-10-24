/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.HashMap;

/**
 *
 * @author Kasun Kalhara
 */
public class NewClass {

    static HashMap page_data = new HashMap();

    public static void main(String[] args) {

        int arre0[] = {1, 2, 3, 4, 89, 89, 45, 22, 33, 22, 12, 89, 89, 45, 222, 3, 4, 89, 89, 45, 22, 33};

        double dala_length = arre0.length;
        int page = (int) Math.ceil(dala_length / 10);

        page_data.clear();
        int data[] = null;

        for (int i = 0; i < dala_length; i++) {

            if (i % 10 < 10) {

//                System.out.println(((i / 10) + 1) + "--" + (i % 10) + "--" + arre0[i]);

                if (i % 10 == 0) {
                    data = new int[10];
                }

                data[i % 10] = arre0[i];

                if (i % 10 == 9) {
                    page_data.put(((i / 10) + 1), data);
                }
                if (i == dala_length - 1) {
                    page_data.put(((i / 10) + 1), data);
                }
            }

        }

        getHmData(2);

    }

    private static void getHmData(int i) {

        System.out.println(page_data.size());
        System.out.println(page_data);

//        System.out.println(page_data.get(2));
        int data[] = (int[]) page_data.get(i);

        for (int j : data) {
            System.out.println(j);
        }
    }

}
