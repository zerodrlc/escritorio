package pe.egcc.sistuni.lib;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   18/01/2016
 */
public class Promedio {
  
  public int promediar(int n1, int n2){
    int pr;
    pr = (n1 + n2) / 2;
    return pr;
  }

  public int promediar(int n1, int n2, int n3){
    int pr;
    pr = (n1 + n2 + n3) / 3;
    return pr;
  }

  public int promediar(int n1, int n2, int n3, int n4){
    int pr;
    pr = (n1 + n2 + n3 + n4) / 4;
    return pr;
  }

  public int promediar(int n1, int n2, int n3, int n4, int n5){
    int pr;
    pr = (n1 + n2 + n3 + n4 + n5) / 5;
    return pr;
  }

}
