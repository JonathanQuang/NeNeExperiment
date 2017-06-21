//Screw back propagation


public class NeuralNet{
	double[][] inputMatrix;
	double[][] outputMatrix;
	double[][] weights1;
	double[][] weights2;
	
	
	public NeuralNet(ArrayList<Integer> inputData1,ArrayList<Integer> inputData2,ArrayList<Integer> outputs){
		double[][] inputMatrx = new double[4][2];
		for (int x=0;x<inputData.size();x++){
			inputMatrix[x][1] = (double)(int)inputData1.get(x);
			inputMatrix[x][2] = (double)(int)inputData2.get(x);
		}
		double[][] outputMatrix = new double[4][1];
		for (int x=0;x<outputs.size();x++){
			outputMatrix[x][1] = outputs.get(x);
		}
		double[][] weights1 = new double[2][4];
		for (int x = 0; x < weights1.length; x++){
			for (int y = 0; y < weights1[x].length;y++){
				weights1[x][y] = Math.random() - 0.5;
			}
		}
		double[][] weights2 = new double[4][1];
		for (int x = 0; x < weights2.length; x++){
			for (int y = 0; y < weights2[x].length;y++){
				weights2[x][y] = Math.random() - 0.5;
			}
		}
	}
	
	public static double sigmoid(double x){
		return (1/(1+Math.pow(Math.E,(-1*x))));
		}
		
		
	public static double[][] matrixMult(double[][] matrixLeft, double[][] matrixRight){
		double[][] retDouble = new double[matrixLeft.length][matrixRight[0].length];
		for (int i = 0; i < matrixLeft.length; i++) { 
			for (int j = 0; j < matrixRight[0].length; j++) { 
				for (int k = 0; k < matrixLeft[0].length; k++) { 
					result[i][j] += matrixLeft[i][k] * matrixRight[k][j];
				}
			}
		}
		return retDouble;
	}
	
}