import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
        //Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
        //Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.




                Scanner input = new Scanner(System.in);

                // Matris boyutlarını kullanıcıdan al
                System.out.print("Matrisin satır sayısı: ");
                int satir = input.nextInt();

                System.out.print("Matrisin sütun sayısı: ");
                int sutun = input.nextInt();


                int[][] matris = new int[satir][sutun];


                System.out.println("Matris elemanlarını girin:");
                for(int i=0; i<satir; i++) {
                    for(int j=0; j<sutun; j++) {
                        matris[i][j] = input.nextInt();
                    }
                }


                int[][] transpoz = new int[sutun][satir];
                for(int i=0; i<satir; i++) {
                    for(int j=0; j<sutun; j++) {
                        transpoz[j][i] = matris[i][j];
                    }
                }

                System.out.println("Matrisin transpozu:");
                for(int i=0; i<sutun; i++) {
                    for(int j=0; j<satir; j++) {
                        System.out.print(transpoz[i][j] + " ");
                    }
                    System.out.println();
                }

                input.close();
            }

        }








