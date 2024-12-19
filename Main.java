import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner ingod = new Scanner(System.in);

       String adiniz, soyadiniz, numaraniz;
        int secimyap;
        int yeniyap;
        int yapyeni;
        Scanner bakyeni;

        System.out.println("2023 - 2024 ALGORITMA VE PROGRAMLAMA DERSİ PROJE ÖDEVİ");
        System.out.print("Adınız:");
        adiniz = ingod.next();
        System.out.print("Soyadınız:");
        soyadiniz = ingod.next();
        System.out.print("Numaranız:");
        numaraniz = ingod.next();
        System.out.print("Merhaba " + adiniz + " " + soyadiniz);
        System.out.println(" Lütfen işlem yapmak istediğin grubu seçer misin");
        System.out.println("1- SAYI GRUBU ALGORITMALARI");
        System.out.println("2- SIRALAMA ALGORITMALARI");
        System.out.println("3- ARAMA ALGORITMALARI");
        System.out.print("Seçiminizi yapınız:");
        secimyap = ingod.nextInt();
        switch (secimyap) {
            case 1:
                System.out.println("SEÇİMİNİZ : SAYI GRUBU ALGORITMALARI");
                System.out.println("ÇALIŞMAK İSTEDİĞİNİZ SAYI GRUBUNU SEÇİNİZ");
                System.out.println("1- Girdiğiniz sayının mükemmel sayı olup olmadığını belirten program");
                System.out.println("2- Fibonacci Sayıları");
                System.out.println("3- Armstrong Sayıları");
                System.out.println("4- Tribonacci Sayıları");
                System.out.println("5- Palindrom Sayıları");
                System.out.println("6- Cullen Sayıları");
                System.out.println("7- Lasa Sayıları");
                System.out.println("8- Fermat Sayıları");
                System.out.println("9- Dost Sayıları");
                System.out.println("10- Zengin Sayılar");
                System.out.println("11- Lucas Serisi");
                System.out.println("12- Tetranacci Sayıları");
                System.out.println("13- İkiz Sayılar");
                System.out.println("14- Weodal Sayılar");
                System.out.println("15- Mersanne Sayılar");
                System.out.println("16- Harshad Sayılar");
                System.out.println("17- Cyclic(Döngüsel) Sayılar");
                System.out.println("18- Tav Sayılar");
                System.out.println("19- Bağdaşık Sayılar(Amicable)");
                System.out.println("20- 6174 Sayısı");
                System.out.print("Seçiminizi yapınız:");
                yeniyap = ingod.nextInt();

                switch (yeniyap) {

                    case 1:
                        main.mukemmelSayilar();
                        break;
                        case 2:
                        main.fibonacciSayilari();
                        break;
                    case 3:
                        main.armStrongSayilari();
                        break;
                    case 4:
                        main.tribonacciSayilari();
                        break;
                    case 5:
                        PalindromSayilar.main();
                        break;
                    case 6:
                        main.cullenSayilari();
                        break;
                    case 7:
                        lasaSayilari.main();
                        break;
                    case 8:
                        fermatSayilar.main();
                        break;
                    case 9:
                        dostSayilar.main();
                        break;
                    case 10:
                        ZenginSayilar.main();
                        break;
                    case 11:
                        LucasSerisi.main();
                        break;
                    case 12:
                        TetranacciSayilari.main();
                        break;
                    case 13:
                        ikizSayilar.main();
                        break;
                    case 14:
                        break;
                    case 15:
                        mersanneSayilari.main();
                        break;
                    case 16:
                        HarshadSayi.main();
                        break;
                    case 17:
                        CyclicSayilar.main();
                        break;
                    case 18:
                        break;
                    case 19:
                        main.bagdasikSayilar();
                        break;
                    case 20:
                        Sonsayi.main();
                        break;
                }
                break;
                case 2:
                System.out.println("SEÇİMİNİZ : SIRALAMA ALGORITMALARI");
                    System.out.println("ÇALIŞMAK İSTEDİĞİNİZ SIRALAMA ALGORITMASINI SEÇİNİZ");
                    System.out.println("1- Insertion Sort");
                System.out.println("2- Selection Sort");
                System.out.println("3- Bubble Sort");
                System.out.println("4- Divide and Conquer Sort");
                System.out.println("5- Shell Sort");
                System.out.println("6- Merge Sort");
                System.out.println("7- Quick Sort");
                System.out.println("8- Quick Sort3");
                System.out.println("9- Heap Sort");
                System.out.println("10- Radix Sort");
                System.out.println("11- Shaker Sort");
                System.out.println("12- Random Sort");
                System.out.println("13- Lucky Sort");
                System.out.println("14- Stooge Sort");
                System.out.println("15- Flash Sort");
                System.out.println("16- Comb Sort");
                System.out.println("17- Gnome Sort");
                System.out.println("18- Permutation Sort");
                System.out.println("19- Strand Sort");
                System.out.println("20- Bucket Sort");
                yapyeni = ingod.nextInt();
                        switch (yapyeni) {
                            case 1:
                                InsertionSort.main();
                                break;
                            case 2:
                                SelectionS.main();
                                break;
                            case 3:
                                Bubblesort.main();
                                break;
                            case 4:
                                DivideSort.main();
                                break;
                            case 5:
                                ShellSort.main();
                                break;
                            case 6:
                                MergeSort.main();
                                break;
                            case 7:
                                QuickSort.main();
                                break;
                            case 8:
                                break;
                            case 9:
                                HeapSort.main();
                                break;
                            case 10:
                                Radix.main();
                                break;
                            case 11:
                                ShakerSort.main();
                                break;
                            case 12:
                               RandomSort.main();
                               break;
                            case 13:
                                LuckySort.main();
                                break;
                            case 14:
                                StoogeSort.main();
                                break;
                            case 15:
                                FlashSort.main();
                                break;
                            case 16:
                                CombSort.main();
                                break;
                            case 17:
                                GnomeSort.main();
                                break;
                            case 18:
                                PermutationSort.main();
                            case 19:
                                StrandSort.main();
                            case 20:
                                BucketSort.main();
                                break;
                        }
                        break;
            case 3:
                System.out.println("SEÇİMİNİZ : ARAMA ALGORITMALARI");
                System.out.println("ÇALIŞMAK İSTEDİĞİNİZ ARAMA ALGORITMASINI SEÇİNİZ");
                System.out.println("1- Doğrusal Arama");
                System.out.println("2- İkili Arama");
                System.out.println("3- Ara Değer Araması");
                System.out.println("4- Şekiller Üzerinde Çalışan Algoritmalar");
                System.out.println("5- Sabit Maliyetli Arama");
                System.out.println("6- Floyd Warshall Algoritması");
                System.out.println("7- Prim's Algoritması");
                System.out.println("8- Kruskal Algoritması");
                System.out.println("9- Dijkstra Algoritması");
                System.out.println("10- Bellman Ford Algoritması");
                System.out.println("11- İkili Arama Ağacı");
                System.out.println("12- Prüfer Dizilimi");
                System.out.println("13- Metin Arama Algoritmaları");
                System.out.println("14- Horspool Arama Algoritmaları");
                System.out.println("15- Kaba Kuvvet Metin Arama Algoritması");
                bakyeni = ingod;
                break;
        }

    }

    public void mukemmelSayilar() {
        Scanner ingod = new Scanner(System.in);
        int toplammk1 = 0;
        System.out.println("Seçiminiz : Girdiğiniz Sayı Mükemmel Sayı Mıdır?");
        //Matematikte bazı pozitif tam sayıların pozitif bölenleri toplamı,
        // sayının kendisinin iki katına eşittir.
        // Bu tür sayılara “mükemmel sayı” denir.
        System.out.print("Bir sayı giriniz:");
        int x = ingod.nextInt();
        for (int muk1 = 1; muk1 < x; muk1++) {
            if (x % muk1 == 0) {
                toplammk1 += muk1;
            }
        }
        if (toplammk1 == x) {
            System.out.println(x + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(x + " Mükemmel bir sayı değildir.");
        }
    }

    public void fibonacciSayilari() {
        //Fibonacci serisi, ardışık iki sayının toplamını kapsayan sayılardır. ,
        // Sayılarımızdan birinci elemanı 0 ikinci elemanı 1 olarak ele alırsak:
        // ilk iki elemanın toplamı 1'dir. 1'den bir önceki sayı 1, 1+ 1 = 2,
        // sonraki sayıyı elde etmek için de 1+ 2= 3 örüntüsünde 5, 8, 13 olarak

        // sayılar birbirini takip eder.
        System.out.println("Seçiminiz : Kaç adet Fibonacci Serisi görmek istersiniz? ");
        Scanner ingod = new Scanner(System.in);
        int fibonacci = ingod.nextInt();
        int f1 = 0, f2 = 1, toplamfb;
        int fbi;
        System.out.print("Girdiğiniz " + fibonacci + " değerinin Fibonacci Serisi: ");
        for (fbi = 1; fbi <= fibonacci; fbi++) {
            System.out.print(f1 + " , ");
            toplamfb = f1 + f2;
            f1 = f2;
            f2 = toplamfb;
        }
    }

    public void armStrongSayilari() {
        //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
        // sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        System.out.println("Seçiminiz : Armstrong Sayıları:");
        Scanner ingod = new Scanner(System.in);
        int strong1, armst, armbirler, armyuzler, armonlar, armtoplam;
        for (strong1 = 100; strong1 <= 999; strong1++) {
            armst = strong1;
            armbirler = armst % 10;
            armst /= 10;
            armonlar = armst % 10;
            armst /= 10;
            armyuzler = armst % 10;
            armst /= 10;
            armtoplam = (armbirler * armbirler * armbirler) + (armyuzler * armyuzler * armyuzler) + (armonlar * armonlar * armonlar);

            if (armtoplam == strong1) {
                System.out.println(strong1 + " Bir Armstrong sayıdır.");
            }
        }
    }

    public void tribonacciSayilari() {
        //Tribonacci dizisi, genel olarak fibonacci dizisinin üçlü hali olarak düşünülebilir.
        // N. elemanı bulabilmek için (n-1)+(n-2)+(n-3) formülü kullanılır.
        int btrb = 0, itrb = 1, utrb = 1, dtrb = btrb + itrb + utrb;
        System.out.println("Seçiminiz : Tribonacci Dizileri - Sayıları");
        System.out.println("Kaç Adet Tribonacci Dizisi Görmek İstiyorsunuz ?");
        Scanner ingod = new Scanner(System.in);
        int sayi = ingod.nextInt();
        System.out.println("Tribonacci Dizisi :");
        System.out.print(btrb + " " + itrb + " " + utrb + " ");
        while (sayi - 3 > 0) {
            sayi--;
            btrb = itrb;
            itrb = utrb;
            utrb = dtrb;
            dtrb = btrb + itrb + utrb;
            System.out.print(dtrb + " ");
        }

    }


    private void cullenSayilari() {
        Scanner ingod = new Scanner(System.in);
        System.out.println("Seçiminiz : Cullen Sayıları.");
        System.out.printf("Kaç adet Cullen Sayısı görmek istersiniz?: ");
        int cull = ingod.nextInt();
        for (int i = 0; i < cull; i++) {
            long cullenSay = (long) i * (1 << i) + 1;
            System.out.println(+cullenSay);
        }
    }

    private void bagdasikSayilar() {
        Scanner ingod = new Scanner(System.in);
        int say1, say2, toplam, onlarb, onlari;
        System.out.println("Seçiminiz : Bağdaşık sayılar");
        System.out.println("Lütfen birinci sayıyı giriniz.");
        say1 = ingod.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        say2 = ingod.nextInt();
        while (say1 > 99 || say1 < 10 || say2 < 10 || say2 > 99) {
            System.out.println("Lütfen iki basamaklı sayı giriniz");
            say1 = ingod.nextInt();
            System.out.println("Lütfen iki basamaklı sayı giriniz");
        }
        toplam = (say1 % 10) + (say2 % 10);
        onlarb = say1 / 10;
        onlari = say2 / 10;
        if (toplam == 10 && onlarb == onlari) {
            System.out.println("Girdiğiniz sayılar Bağdaşık Sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayılar Bağdaşık Sayı değildir.");
        }

    }
}

