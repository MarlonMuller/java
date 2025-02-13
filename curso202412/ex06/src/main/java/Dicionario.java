import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String, String> dicionarioInglesPortugues = new HashMap<>();
    private final Map<String, String> dicionarioPortuguesIngles = new HashMap<>();

    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario){
        if(dicionario == TipoDicionario.INGLES){
            dicionarioInglesPortugues.put(palavra.toLowerCase(), traducao);
        } else if(dicionario == TipoDicionario.PORTUGUES){
            dicionarioPortuguesIngles.put(palavra.toLowerCase(), traducao);
        }
    }

    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca){
        String traducao;
        if(dicionarioDeBusca == TipoDicionario.INGLES){
            if(!dicionarioInglesPortugues.containsKey(palavra.toLowerCase())){
                throw new PalavraNaoEncontradaException("Palavra não encontrada.");
            }
            traducao = dicionarioInglesPortugues.get(palavra.toLowerCase());
        } else if(dicionarioDeBusca == TipoDicionario.PORTUGUES){
            if(!dicionarioPortuguesIngles.containsKey(palavra.toLowerCase())){
                throw new PalavraNaoEncontradaException("Palavra não encontrada.");
            }
            traducao = dicionarioPortuguesIngles.get(palavra.toLowerCase());
        } else {
            throw new IllegalArgumentException("Dicionario Invalido");
        }
        return traducao;
    }

}
