public class Batalha {

    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {

        for (int i = 0; i < 3; i++) {
            primeiroNinja.atacar(segundoNinja);
            segundoNinja.atacar(primeiroNinja);
        }
        if (primeiroNinja.getNome() == "Itachi") {
            return primeiroNinja;
        } else if (segundoNinja.getNome() == "Itachi") {
            return segundoNinja;
        } else if (segundoNinja.getChakra() > primeiroNinja.getChakra()) {
            return segundoNinja;
        } else {
            return primeiroNinja;
        }
    }
}
