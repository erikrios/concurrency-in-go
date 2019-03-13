package com.erikriosetiawan;

import java.util.Scanner;

public class Main {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        programTitle();
        askForRun();
    }

    private static void programTitle() {
        System.out.printf("%s\n", "======== PROGRAM KONVERSI SUHU ========");
        System.out.print("\n");
        System.out.printf("\t%s : %s\n", "Created by", "Erik Rio Setiawan");
        System.out.printf("\t%s : %s\n", "Created on", "March 13, 2019");
        System.out.printf("%s\n", "---------------------------------------");
    }

    private static void askForRun() {
        String answer;
        boolean condition = true;
        while (condition) {
            System.out.printf("%s : ", "Apakah Anda ingin menjalankan program ini? (Y/T)");
            answer = userInput.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                prosesKonversiSuhu();
                condition = false;
            } else if (answer.equalsIgnoreCase("T")) {
                System.out.printf("%s", "Terimakasih karena telah menggunakan program kami.");
                condition = false;
            } else {
                System.out.printf("%s\n", "Masukkan jawaban dengan benar! Coba kembali.");
            }
        }
    }

    private static int pemilihanKonversiSuhu() {
        int pilihan;
        System.out.printf("%s\n", "------------------------");
        System.out.printf("%s\n", "1. Kelvin Ke Celcius");
        System.out.printf("%s\n", "2. Kelvin Ke Fahrenheit");
        System.out.printf("%s\n", "3. Kelvin Ke Reaumur");
        System.out.printf("%s\n", "------------------------");
        System.out.printf("%s\n", "4. Celcius Ke Kelvin");
        System.out.printf("%s\n", "5. Celcius Ke Fahrenheit");
        System.out.printf("%s\n", "6. Celcius Ke Reaumur");
        System.out.printf("%s\n", "------------------------");
        System.out.printf("%s\n", "7. Fahrenheit Ke Kelvin");
        System.out.printf("%s\n", "8. Fahrenheit Ke Celcius");
        System.out.printf("%s\n", "9. Fahrenheit Ke Reaumur");
        System.out.printf("%s\n", "------------------------");
        System.out.printf("%s\n", "10. Reaumur Ke Kevin");
        System.out.printf("%s\n", "11. Reaumur Ke Celcius");
        System.out.printf("%s\n", "12. Reaumur Ke Fahrenheit");
        System.out.printf("%s\n", "------------------------");
        System.out.printf("%s: ", "Masukkan pilihan");

        pilihan = userInput.nextInt();

        return pilihan;
    }

    private static void prosesKonversiSuhu() {
        int pilihan;
        double kelvin, celcius, fahrenheit, reaumur;
        double hasilKonversi;
        String messageInputKelvin, messageInputCelcius, messageInputFahrenheit, messageInputReaumur;
        messageInputKelvin = "Masukkan Nilai Kelvin";
        messageInputCelcius = " Masukkan Nilai Celcius";
        messageInputFahrenheit = "Masukkan Nilai Fahrenheit";
        messageInputReaumur = "Masukkan Nilai Reaumur";
        pilihan = pemilihanKonversiSuhu();
        switch (pilihan) {
            case 1:
                System.out.printf("%s : ", messageInputKelvin);
                kelvin = userInput.nextDouble();
                hasilKonversi = Kelvin.kelvinToCelcius(kelvin);
                tampilkanDataKonversi("Kelvin", "Celcius", hasilKonversi, "C");
                askForMoreConvert();
                break;
            case 2:
                System.out.printf("%s : ", messageInputKelvin);
                kelvin = userInput.nextDouble();
                hasilKonversi = Kelvin.kelvinToFahrenheit(kelvin);
                tampilkanDataKonversi("Kelvin", "Fahrenheit", hasilKonversi, "F");
                askForMoreConvert();
                break;
            case 3:
                System.out.printf("%s: ", messageInputKelvin);
                kelvin = userInput.nextDouble();
                hasilKonversi = Kelvin.kelvinToReaumur(kelvin);
                tampilkanDataKonversi("Kelvin", "Reaumur", hasilKonversi, "R");
                askForMoreConvert();
                break;
            case 4:
                System.out.printf("%s: ", messageInputCelcius);
                celcius = userInput.nextDouble();
                hasilKonversi = Celcius.celciusToKelvin(celcius);
                tampilkanDataKonversi("Celcius", "Kelvin", hasilKonversi, "K");
                askForMoreConvert();
                break;
            case 5:
                System.out.printf("%s: ", messageInputCelcius);
                celcius = userInput.nextDouble();
                hasilKonversi = Celcius.celciusToFahrenheit(celcius);
                tampilkanDataKonversi("Celcius", "Fahrenheit", hasilKonversi, "F");
                askForMoreConvert();
                break;
            case 6:
                System.out.printf("%s: ", messageInputCelcius);
                celcius = userInput.nextDouble();
                hasilKonversi = Celcius.celciusToReaumur(celcius);
                tampilkanDataKonversi("Celcius", "Reaumur", hasilKonversi, "R");
                askForMoreConvert();
                break;
            case 7:
                System.out.printf("%s: ", messageInputFahrenheit);
                fahrenheit = userInput.nextDouble();
                hasilKonversi = Fahrenheit.fahrenheitToKelvin(fahrenheit);
                tampilkanDataKonversi("Fahrenheit", "Kelvin", hasilKonversi, "K");
                askForMoreConvert();
                break;
            case 8:
                System.out.printf("%s: ", messageInputFahrenheit);
                fahrenheit = userInput.nextDouble();
                hasilKonversi = Fahrenheit.fahrenheitToCelcius(fahrenheit);
                tampilkanDataKonversi("Fahrenheit", "Celcius", hasilKonversi, "C");
                askForMoreConvert();
                break;
            case 9:
                System.out.printf("%s: ", messageInputFahrenheit);
                fahrenheit = userInput.nextDouble();
                hasilKonversi = Fahrenheit.fahrenheitToReaumur(fahrenheit);
                tampilkanDataKonversi("Fahrenheit", "Reaumur", hasilKonversi, "R");
                askForMoreConvert();
                break;
            case 10:
                System.out.printf("%s: ", messageInputReaumur);
                reaumur = userInput.nextDouble();
                hasilKonversi = Reaumur.reaumurToKelvin(reaumur);
                tampilkanDataKonversi("Reaumur", "Kelvin", hasilKonversi, "K");
                askForMoreConvert();
                break;
            case 11:
                System.out.printf("%s: ", messageInputReaumur);
                reaumur = userInput.nextDouble();
                hasilKonversi = Reaumur.reaumurToCelcius(reaumur);
                tampilkanDataKonversi("Reaumur", "Celcius", hasilKonversi, "C");
                askForMoreConvert();
                break;
            case 12:
                System.out.printf("%s: ", messageInputReaumur);
                reaumur = userInput.nextDouble();
                hasilKonversi = Reaumur.reaumurToFahrenheit(reaumur);
                tampilkanDataKonversi("Reaumure", "Fahrenheit", hasilKonversi, "F");
                askForMoreConvert();
                break;
            default:
                System.out.printf("%s\n", "Masukkan pilihan dengan benar!");
                pemilihanKonversiSuhu();
                prosesKonversiSuhu();
        }
    }

    private static void tampilkanDataKonversi(String dataInput, String dataConvert, Double hasilKonversi, String satuan) {
        System.out.printf("%s %s %s %s %s %f %s\n", "Hasil Konversi Dari", dataInput, "ke", dataConvert, "Adalah", hasilKonversi, satuan);
    }

    private static void askForMoreConvert() {
        String answer;
        System.out.printf("%s ", "Apakah Anda ingin melakukan konversi lagi? (Y/T):");
        answer = userInput.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            prosesKonversiSuhu();
        } else if (answer.equalsIgnoreCase("T")) {
            System.out.printf("%s", "Terimakasih karena telah menggunakan program kami.");
        } else {
            System.out.printf("%s\n", "Masukkan pilihan dengan benar!");
            askForMoreConvert();
        }
    }
}
