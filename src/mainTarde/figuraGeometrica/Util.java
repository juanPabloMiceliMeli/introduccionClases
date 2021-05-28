package mainTarde.figuraGeometrica;

public class Util {

    public static double areaPromedio(FiguraGeometrica[] arr){
        double res = 0;
        for(FiguraGeometrica f : arr){
            res += f.area();
        }
        return res/arr.length;
    }
}
