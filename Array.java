import java.util.Scanner;

public class ArrayDinamico {
	
	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		System.out.println("Inserire sequenza numeri positivi (negativi per terminare:");
		
		int dim=2;
		int[] array=new int[dim];
		int i=0;
		
		boolean isFlagWord=false;
		
		while(!isFlagWord) {
			
			int nuovoNumero=console.nextInt();
			
			if(nuovoNumero<0) {
				isFlagWord=true;
			}
			else {
				
				if(i==dim) {
					array=resize(array,dim*2);
					dim=dim*2;
				}
				
				array[i]=nuovoNumero;
				i++;
			}
			
			
		}
		System.out.println("Dimensione fisica array finale: "+dim);
		System.out.println("Dimensione logica array: "+i);
		
		for(int j=0; j<i; j++) {
			System.out.print(array[j]+" ");
		}
		console.close();
		
	}
	
	public static int[] resize(int[] oldArray, int newLength) {
		
		int[] newArray=new int[newLength];
		
		for(int i=0; i<oldArray.length; i++) {
			
			newArray[i]=oldArray[i];
			
		}
		return newArray;
		
	}
}