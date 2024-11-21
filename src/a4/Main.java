package a4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int size = 4;

//        Corners
        Triangle t1 = new Triangle(4, (double) 0 /16, 0);
        Triangle t2 = new Triangle(4, (double) 15 /16, 0);
        Triangle t3 = new Triangle(4, (double) 7.5 /16, 15* Math.sqrt(3)/32);
//        (1/16, 0)
        Triangle t4 = new Triangle(4, (double) 1 /16, 0);
        Triangle t5 = new Triangle(4, (double) 14.5 /16, Math.sqrt(3)/32);
        Triangle t6 = new Triangle(4, (double) 7 /16, 14* Math.sqrt(3)/32);
//        (2/16, 0)
        Triangle t7 = new Triangle(4, (double) 2 /16, 0);
        Triangle t8 = new Triangle(4, (double) 14 /16, 2* Math.sqrt(3)/32);
        Triangle t9 = new Triangle(4, (double) 6.5 /16, 13* Math.sqrt(3)/32);
//        (3/16, 0)
        Triangle t10 = new Triangle(4, (double) 3 /16, 0);
        Triangle t11 = new Triangle(4, (double) 13.5 /16, 3* Math.sqrt(3)/32);
        Triangle t12 = new Triangle(4, (double) 6 /16, 12* Math.sqrt(3)/32);
//        (4/16, 0)
        Triangle t13 = new Triangle(4, (double) 4 /16, 0);
        Triangle t14 = new Triangle(4, (double) 13 /16, 4* Math.sqrt(3)/32);
        Triangle t15 = new Triangle(4, (double) 5.5 /16, 11* Math.sqrt(3)/32);
//        (5/16, 0)
        Triangle t16 = new Triangle(4, (double) 5 /16, 0);
        Triangle t17 = new Triangle(4, (double) 12.5 /16, 5* Math.sqrt(3)/32);
        Triangle t18 = new Triangle(4, (double) 5 /16, 10* Math.sqrt(3)/32);
//        (6/16, 0)
        Triangle t19 = new Triangle(4, (double) 6 /16, 0);
        Triangle t20 = new Triangle(4, (double) 12 /16, 6* Math.sqrt(3)/32);
        Triangle t21 = new Triangle(4, (double) 4.5 /16, 9* Math.sqrt(3)/32);
//        (7/16, 0)
        Triangle t22 = new Triangle(4, (double) 7 /16, 0);
        Triangle t23 = new Triangle(4, (double) 11.5 /16, 7* Math.sqrt(3)/32);
        Triangle t24 = new Triangle(4, (double) 4 /16, 8* Math.sqrt(3)/32);
//        (8/16, 0)
        Triangle t25 = new Triangle(4, (double) 8 /16, 0);
        Triangle t26 = new Triangle(4, (double) 11 /16, 8* Math.sqrt(3)/32);
        Triangle t27 = new Triangle(4, (double) 3.5 /16, 7* Math.sqrt(3)/32);
//        (9/16, 0)
        Triangle t28 = new Triangle(4, (double) 9 /16, 0);
        Triangle t29 = new Triangle(4, (double) 10.5 /16, 9* Math.sqrt(3)/32);
        Triangle t30 = new Triangle(4, (double) 3 /16, 6* Math.sqrt(3)/32);
//        (10/16, 0)
        Triangle t31 = new Triangle(4, (double) 10 /16, 0);
        Triangle t32 = new Triangle(4, (double) 10 /16, 10* Math.sqrt(3)/32);
        Triangle t33 = new Triangle(4, (double) 2.5 /16, 5* Math.sqrt(3)/32);
//        (11/16, 0)
        Triangle t34 = new Triangle(4, (double) 11 /16, 0);
        Triangle t35 = new Triangle(4, (double) 9.5 /16, 11* Math.sqrt(3)/32);
        Triangle t36 = new Triangle(4, (double) 2 /16, 4* Math.sqrt(3)/32);
//        (12/16, 0)
        Triangle t37 = new Triangle(4, (double) 12 /16, 0);
        Triangle t38 = new Triangle(4, (double) 9 /16, 12* Math.sqrt(3)/32);
        Triangle t39 = new Triangle(4, (double) 1.5 /16, 3* Math.sqrt(3)/32);
//        (13/16, 0)
        Triangle t40 = new Triangle(4, (double) 13 /16, 0);
        Triangle t41 = new Triangle(4, (double) 8.5 /16, 13* Math.sqrt(3)/32);
        Triangle t42 = new Triangle(4, (double) 1 /16, 2* Math.sqrt(3)/32);
//        (14/16, 0)
        Triangle t43 = new Triangle(4, (double) 14 /16, 0);
        Triangle t44 = new Triangle(4, (double) 8 /16, 14* Math.sqrt(3)/32);
        Triangle t45 = new Triangle(4, (double) 0.5 /16, Math.sqrt(3)/32);
//        (2.5/16, Math.sqrt(3)/32)
        Triangle t46 = new Triangle(4, (double) 2.5 /16, Math.sqrt(3)/32);
        Triangle t47 = new Triangle(4, (double) 13 /16, 2* Math.sqrt(3)/32);
        Triangle t48 = new Triangle(4, (double) 7 /16, 12* Math.sqrt(3)/32);
//        (4.5 /16, Math.sqrt(3)/32)
        Triangle t49 = new Triangle(4, (double) 4.5 /16, Math.sqrt(3)/32);
        Triangle t50 = new Triangle(4, (double) 12 /16, 4* Math.sqrt(3)/32);
        Triangle t51 = new Triangle(4, (double) 6 /16, 10* Math.sqrt(3)/32);
//        (6.5 /16, Math.sqrt(3)/32)
        Triangle t52 = new Triangle(4, (double) 6.5 /16, Math.sqrt(3)/32);
        Triangle t53 = new Triangle(4, (double) 11 /16, 6* Math.sqrt(3)/32);
        Triangle t54 = new Triangle(4, (double) 5 /16, 8* Math.sqrt(3)/32);
//        (8.5 /16, Math.sqrt(3)/32)
        Triangle t55 = new Triangle(4, (double) 8.5 /16, Math.sqrt(3)/32);
        Triangle t56 = new Triangle(4, (double) 10 /16, 8* Math.sqrt(3)/32);
        Triangle t57 = new Triangle(4, (double) 4 /16, 6* Math.sqrt(3)/32);
//        (10.5 /16, Math.sqrt(3)/32)
        Triangle t58 = new Triangle(4, (double) 10.5 /16, Math.sqrt(3)/32);
        Triangle t59 = new Triangle(4, (double) 9 /16, 10* Math.sqrt(3)/32);
        Triangle t60 = new Triangle(4, (double) 3 /16, 4* Math.sqrt(3)/32);
//        (12.5 /16, Math.sqrt(3)/32)
        Triangle t61 = new Triangle(4, (double) 12.5 /16, Math.sqrt(3)/32);
        Triangle t62 = new Triangle(4, (double) 8 /16, 12* Math.sqrt(3)/32);
        Triangle t63 = new Triangle(4, (double) 2 /16, 2* Math.sqrt(3)/32);
//        (5 /16, 2* Math.sqrt(3)/32)
        Triangle t64 = new Triangle(4, (double) 5 /16, 2* Math.sqrt(3)/32);
        Triangle t65 = new Triangle(4, (double) 11 /16, 4* Math.sqrt(3)/32);
        Triangle t66 = new Triangle(4, (double) 6.5 /16, 9* Math.sqrt(3)/32);
//        (6 /16, 2* Math.sqrt(3)/32);
        Triangle t67 = new Triangle(4, (double) 6 /16, 2* Math.sqrt(3)/32);
        Triangle t68 = new Triangle(4, (double) 10.5 /16, 5* Math.sqrt(3)/32);
        Triangle t69 = new Triangle(4, (double) 6 /16, 8* Math.sqrt(3)/32);
//        (9 /16, 2* Math.sqrt(3)/32)
        Triangle t70 = new Triangle(4, (double) 9 /16, 2* Math.sqrt(3)/32);
        Triangle t71 = new Triangle(4, (double) 9 /16, 8* Math.sqrt(3)/32);
        Triangle t72 = new Triangle(4, (double) 4.5 /16, 5* Math.sqrt(3)/32);
//        (10 /16, 2* Math.sqrt(3)/32)
        Triangle t73 = new Triangle(4, (double) 10 /16, 2* Math.sqrt(3)/32);
        Triangle t74 = new Triangle(4, (double) 8.5 /16, 9* Math.sqrt(3)/32);
        Triangle t75 = new Triangle(4, (double) 4 /16, 4* Math.sqrt(3)/32);
//        (5.5 /16, 3* Math.sqrt(3)/32)
        Triangle t76 = new Triangle(4, (double) 5.5 /16, 3* Math.sqrt(3)/32);
        Triangle t77 = new Triangle(4, (double) 10 /16, 4* Math.sqrt(3)/32);
        Triangle t78 = new Triangle(4, (double) 7 /16, 8* Math.sqrt(3)/32);
//        (9.5 /16, 3* Math.sqrt(3)/32)
        Triangle t79 = new Triangle(4, (double) 9.5 /16, 3* Math.sqrt(3)/32);
        Triangle t80 = new Triangle(4, (double) 8 /16, 8* Math.sqrt(3)/32);
        Triangle t81 = new Triangle(4, (double) 5 /16, 4* Math.sqrt(3)/32);



        ArrayList<Triangle> triangles = new ArrayList<Triangle>(81);
        triangles.add(t1);
        triangles.add(t2);
        triangles.add(t3);
        triangles.add(t4);
        triangles.add(t5);
        triangles.add(t6);
        triangles.add(t7);
        triangles.add(t8);
        triangles.add(t9);
        triangles.add(t10);
        triangles.add(t11);
        triangles.add(t12);
        triangles.add(t13);
        triangles.add(t14);
        triangles.add(t15);
        triangles.add(t16);
        triangles.add(t17);
        triangles.add(t18);
        triangles.add(t19);
        triangles.add(t20);
        triangles.add(t21);
        triangles.add(t22);
        triangles.add(t23);
        triangles.add(t24);
        triangles.add(t25);
        triangles.add(t26);
        triangles.add(t27);
        triangles.add(t28);
        triangles.add(t29);
        triangles.add(t30);
        triangles.add(t31);
        triangles.add(t32);
        triangles.add(t33);
        triangles.add(t34);
        triangles.add(t35);
        triangles.add(t36);
        triangles.add(t37);
        triangles.add(t38);
        triangles.add(t39);
        triangles.add(t40);
        triangles.add(t41);
        triangles.add(t42);
        triangles.add(t43);
        triangles.add(t44);
        triangles.add(t45);
        triangles.add(t46);
        triangles.add(t47);
        triangles.add(t48);
        triangles.add(t49);
        triangles.add(t50);
        triangles.add(t51);
        triangles.add(t52);
        triangles.add(t53);
        triangles.add(t54);
        triangles.add(t55);
        triangles.add(t56);
        triangles.add(t57);
        triangles.add(t58);
        triangles.add(t59);
        triangles.add(t60);
        triangles.add(t61);
        triangles.add(t62);
        triangles.add(t63);
        triangles.add(t64);
        triangles.add(t65);
        triangles.add(t66);
        triangles.add(t67);
        triangles.add(t68);
        triangles.add(t69);
        triangles.add(t70);
        triangles.add(t71);
        triangles.add(t72);
        triangles.add(t73);
        triangles.add(t74);
        triangles.add(t75);
        triangles.add(t76);
        triangles.add(t77);
        triangles.add(t78);
        triangles.add(t79);
        triangles.add(t80);
        triangles.add(t81);

        System.out.println(triangles);

        double minRatio = 1;
        TriangleComparator triangleComparator = new TriangleComparator();

        ArrayList<Triangle> subset = new ArrayList<>();

        for (int i = 1; i < (1<<27); i++) {
            subset.clear();
            for (int j = 0; j < 27; j++) {
                if ((i >> j) % 2 == 1) {
                    subset.add(triangles.get(3*j));
                    subset.add(triangles.get(3*j+1));
                    subset.add(triangles.get(3*j+2));
                }
            }
            triangleComparator.setTriangles(subset);
            if (triangleComparator.ratio() < minRatio) {
                minRatio = triangleComparator.ratio();
                System.out.println(subset);
                System.out.println(minRatio);
            }

        }

        System.out.println(minRatio);

    }

}
