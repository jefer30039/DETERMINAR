public class generador {
    //genera un sistema de ecuaciones lineales 3x3 no homogeneo, usar numeros enteros entre -10 y 10
    public static int[][] generar(String[] args) {
        int a1 = (int) (Math.random() * 21) - 10;
        int b1 = (int) (Math.random() * 21) - 10;
        int c1 = (int) (Math.random() * 21) - 10;
        int d1 = (int) (Math.random() * 21) - 10;
        int a2 = (int) (Math.random() * 21) - 10;
        int b2 = (int) (Math.random() * 21) - 10;
        int c2 = (int) (Math.random() * 21) - 10;
        int d2 = (int) (Math.random() * 21) - 10;
        int a3 = (int) (Math.random() * 21) - 10;
        int b3 = (int) (Math.random() * 21) - 10;
        int c3 = (int) (Math.random() * 21) - 10;
        int d3 = (int) (Math.random() * 21) - 10;

        //guarda en una matriz los coeficientes de las ecuaciones
        int[][] matriz = new int[3][4];
        matriz[0][0] = a1;
        matriz[0][1] = b1;
        matriz[0][2] = c1;
        matriz[0][3] = d1;
        matriz[1][0] = a2;
        matriz[1][1] = b2;
        matriz[1][2] = c2;
        matriz[1][3] = d2;
        matriz[2][0] = a3;
        matriz[2][1] = b3;
        matriz[2][2] = c3;
        matriz[2][3] = d3;

        //verifica si el determinante de la matriz es distinto de 0, para que el sistema tenga solucion unica
        int det = calcularDeterminante(matriz);

        if (det == 0) {
            generar(args);
        }

        //imprime la matriz generada en formato de sistema de ecuaciones
        System.out.println("Sistema de ecuaciones:");
        System.out.println(matriz[0][0] + "x + " + matriz[0][1] + "y + " + matriz[0][2] + "z = " + matriz[0][3]);
        System.out.println(matriz[1][0] + "x + " + matriz[1][1] + "y + " + matriz[1][2] + "z = " + matriz[1][3]);
        System.out.println(matriz[2][0] + "x + " + matriz[2][1] + "y + " + matriz[2][2] + "z = " + matriz[2][3]);

        return matriz;
    }

    public static int calcularDeterminante (int[][] matriz) {
        //verifica si el determinante de la matriz es distinto de 0
        int det = matriz[0][0] * matriz[1][1] * matriz[2][2] + matriz[0][1] * matriz[1][2] * matriz[2][0] + matriz[0][2] * matriz[1][0] * matriz[2][1] - matriz[0][2] * matriz[1][1] * matriz[2][0] - matriz[0][1] * matriz[1][0] * matriz[2][2] - matriz[0][0] * matriz[1][2] * matriz[2][1];
        return det;
    }
}
