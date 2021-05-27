package main;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String res = "";
		while(n>0){
			res+=c;
			n--;
		}
		return res;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		return replicate(c, n).concat(s);
	}

	public static String rpad(String s, int n, char c)
	{
		return s.concat(replicate(c, n));
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		//Paso a tipo de dato intStream (investigar streams que parecen copados)
		IntStream iS = Arrays.stream(arr);
		//Transformo cada elemento de del stream a string.
		Stream<String> sS = iS.mapToObj(String::valueOf);
		//Paso de stream a array normal
		return sS.toArray(String[]::new);
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String inArray[])
	{
		return Arrays.stream(inArray).mapToInt(Integer::parseInt).toArray();
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLen = -1;
		for(String s : arr){
			int newLen = s.length();
			if(maxLen < newLen){
				maxLen = newLen;
			}
		}
		return maxLen;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maxLen = maxLength(arr);
		int N = arr.length;
		for(int i = 0; i < N; i++){
			arr[i] = lpad(arr[i], maxLen-arr[i].length(),'0');
		}
	}

	//Saca los espacios a la izquierda
	public static String ltrim(String arr)
	{
		int N = arr.length();
		int i = 0;
		while(i < N && arr.charAt(0) == ' '){
			arr = arr.substring(1);
			i++;
		}
		return arr;
	}

	//Saca los espacios a la derecha
	public static String rtrim(String arr)
	{
		int N = arr.length();

		while(N > 0 && arr.charAt(N-1) == ' '){
			arr = arr.substring(0, N-1);
			N = arr.length();
		}
		return arr;
	}

	//Saca los espacios a izquierda y derecha
	public static String trim(String arr)
	{
		arr = ltrim(arr);
		arr = rtrim(arr);
		return arr;
	}

	public static int indexOfN(String s,char c,int n){
		int i = 0;
		while(i<s.length() && n > 0){
			if(s.charAt(i) == c){
				n--;
			}
			i++;
		}
		return i-1;
	}
}
