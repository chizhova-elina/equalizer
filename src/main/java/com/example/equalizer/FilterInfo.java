package com.example.equalizer;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public final class FilterInfo {

    public final static short COUNT_OF_COEFS = 601;
    private static double[] getCoef(String band) throws FileNotFoundException {
        double[] coefs = new double[COUNT_OF_COEFS];
        String separator = File.separator;
        String path0 = separator+"Users"+separator+"elina"+separator+"OneDrive"+separator+"Документы"+separator+"6 семестр"+separator+"нирс цос"+separator+"коэффициенты 600"+separator+"band"+band+".txt";
        File coefficientsFile0 = new File(path0);
        Scanner scanner;
        scanner = new Scanner(coefficientsFile0);
        int i = 0;
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            coefs[i++] = Double.parseDouble(data);
        }
        scanner.close();
        return coefs;
    }
    public static final double[] COEFS_OF_BAND_0;
    public static final double[] COEFS_OF_BAND_1;
    public static final double[] COEFS_OF_BAND_2;
    public static final double[] COEFS_OF_BAND_3;
    public static final double[] COEFS_OF_BAND_4;
    public static final double[] COEFS_OF_BAND_5;
    public static final double[] COEFS_OF_BAND_6;
    public static final double[] COEFS_OF_BAND_7;
    public static final double[] COEFS_OF_BAND_8;
    public static final double[] COEFS_OF_BAND_9;

    static {
        try {
            COEFS_OF_BAND_0 = getCoef(String.valueOf(0));
            COEFS_OF_BAND_1 = getCoef(String.valueOf(1));
            COEFS_OF_BAND_2 = getCoef(String.valueOf(2));
            COEFS_OF_BAND_3 = getCoef(String.valueOf(3));
            COEFS_OF_BAND_4 = getCoef(String.valueOf(4));
            COEFS_OF_BAND_5 = getCoef(String.valueOf(5));
            COEFS_OF_BAND_6 = getCoef(String.valueOf(6));
            COEFS_OF_BAND_7 = getCoef(String.valueOf(7));
            COEFS_OF_BAND_8 = getCoef(String.valueOf(8));
            COEFS_OF_BAND_9 = getCoef(String.valueOf(9));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

