package ejercicio4t3;

public class CompruebaVocal {
	public static boolean compruebaVocal (String caracter) {
		
		boolean res = false;
		
		switch (caracter.toLowerCase()) {
		case "a", "e", "u", "i", "o" :
		res=true;
		}
		return res;
	}
}
