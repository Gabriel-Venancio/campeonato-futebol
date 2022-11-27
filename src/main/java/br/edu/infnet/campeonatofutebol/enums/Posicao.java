package br.edu.infnet.campeonatofutebol.enums;

public enum Posicao {
    GOLEIRO(1),
    ZAGUEIRO(2),
    LATERAL(3),
    MEIO_CAMPO(4),
    ATACANTE(5);

    private int code;

    private Posicao(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Posicao valueOf(int code) {
        for (Posicao value : Posicao.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Posicao");
    }

}
