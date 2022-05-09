public class SomaMatrizes {
    public static void main(String args[]) {
        double[][] matrizA = {{1, 8}, {2, -7}};
        double[][] matrizB = {{5, -4}, {9, 4}};
        double[][] matrizC = new double[2][2];
        somarMatrizes(matrizA, matrizB, matrizC);

        for (int linha=0 ; linha<matrizA.length ; linha++) {
            for (int coluna=0 ; coluna<matrizA[0].length ; coluna++) {
                System.out.print(matrizC[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void somarMatrizes(double[][] matrizA, double[][] matrizB, double[][] soma) {
        for (int linha=0 ; linha<matrizA.length ; linha++) {
            for (int coluna=0 ; coluna<matrizA[0].length ; coluna++) {
                soma[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }
            System.out.println();
        }
    }
}