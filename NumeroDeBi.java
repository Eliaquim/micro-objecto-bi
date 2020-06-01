import java.util.regex.Pattern;

public class NumeroDeBi {
    private String number;

    public NumeroDeBi(String number) throws InvalidBiNumberException {

        // Padrão: 9 dígitos + duas letras + 3 dígitos.
        // Os dois zeros iniciais e o zero antes dos dois dígitos poderão evoluir para outros dígitos com o tempo.
        // Por enquanto, manter assim ajuda a garantir compliance.
        String regex = "^00\\d{7}[a-zA-Z]{2}0\\d{2}";

        if (Pattern.matches(regex, number)) {
            this.number = number.toUpperCase();
        } else {
            throw new InvalidBiNumberException(
                    "Número de BI inválido"
            );
        }
    }

    public String getNumber() {
        return number;
    }
}
