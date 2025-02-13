public class NivelCriticoBateriaException extends RuntimeException{
    public NivelCriticoBateriaException(){
        super("O nível da bateria está crítico e isto impede esta operação.");
    }
}
