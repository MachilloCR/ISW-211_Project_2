
package proyecto2.proyecto;

public class RegPuntaje implements Comparable<RegPuntaje> {
    public String PunJu="";
    public int Puntos=0;
    
    public RegPuntaje(int Puntos,String Punju){
        this.PunJu=Punju;
        this.Puntos=Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public int getPuntos() {
        return Puntos;
    }

    public String getPunJu() {
        return PunJu;
    }

    public void setPunJu(String PunJu) {
        this.PunJu = PunJu;
    } 

    @Override
    public int compareTo(RegPuntaje o) {
        if(o.getPuntos()<Puntos){
            return-1;
        }else if(o.getPuntos()<Puntos){
            return 0;
        }else{
            return 1;
        }
    }
}
