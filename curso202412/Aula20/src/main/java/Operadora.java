import java.util.ArrayList;
import java.util.List;

public class Operadora {

    private List<Celular> aparelhosComunsConectados;
    private List<Celular> aparelhosSmartphonesConectados;


    public Operadora() {
        this.aparelhosComunsConectados = new ArrayList<>();
        this.aparelhosSmartphonesConectados = new ArrayList<>();
    }

    public void conectarAparelho(Celular celular){
        switch(celular.getTipoAparelho()){
            case COMUM:
                this.aparelhosComunsConectados.add(celular);
                break;

            case SMARTPHONE:
                this.aparelhosSmartphonesConectados.add(celular);
                break;
        }
    }

    public int getQuantidadeAparelhosConectados(){
        return this.aparelhosComunsConectados.size() + this.aparelhosSmartphonesConectados.size();
    }
}
