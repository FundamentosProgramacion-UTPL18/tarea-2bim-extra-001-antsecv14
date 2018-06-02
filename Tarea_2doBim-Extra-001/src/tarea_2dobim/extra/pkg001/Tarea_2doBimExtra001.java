package tarea_2dobim.extra.pkg001;

public class Tarea_2doBimExtra001 {

    public static void main(String[] args) {
        // inicializacion de arreglos y variables a usar
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        double total_de_ventas = 0;
        // salida de meses, total y promedio de la tabla
        System.out.printf("\t\t%s\t\t%s\t\t%s\t Total\t\t Promedio\n", meses[0], meses[1], meses[2]);
        //  calculo del total de ventas de cada mes de sucursal y su respectivo promedio
        for (int contador = 0; contador <= 3; contador++) {
            double suma = ventas_mes_1[contador] + ventas_mes_2[contador] + ventas_mes_3[contador];
            double promedio = suma / 3;
            venta_total_sucursal[contador] = suma;
            venta_promedio_sucursal[contador] = promedio;
            total_de_ventas = total_de_ventas + venta_total_sucursal[contador];
        }
        // salida de valores de los arreglos junto con el total y el promedio 
        for (int contador = 0; contador <= 3; contador++) {
            System.out.printf("%s \t%.2f \t%.2f \t%.2f  \t%.2f  \t %.2f\n", sucursales[contador], ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador], venta_total_sucursal[contador], venta_promedio_sucursal[contador]);
        }
        System.out.printf("\nTotal de ventas de todas las sucursales es: %.2f \n", total_de_ventas);

    }

}
