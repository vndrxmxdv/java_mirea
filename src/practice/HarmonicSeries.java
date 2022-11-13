package practice;

public class HarmonicSeries {
    public static void harmonic_series() {
        float[] series;
        series = new float[10];

        for (int i = 1; i < series.length + 1; ++i)
            series[i - 1] = 1/(float)i;


        System.out.print("series: {");
        for (int i = 0; i < series.length; ++i) {
            System.out.printf("%.2f", series[i]);
            if (i + 1 < series.length)
                System.out.print(", ");
        }
        System.out.println("}");

    }
}
