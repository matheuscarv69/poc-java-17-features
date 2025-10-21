package com.matheuscarv69.poc_java_17_features.textblocks;

public class TextBlocks {

    public static void main(String[] args) {
        System.out.println(
                """
                    Text blocks (introduzidos no Java 15 e estabilizados em versões posteriores, incluindo
                    Java 17) permitem representar strings multilinha de forma legível. Eles preservam
                    quebras de linha e facilitam a inclusão de JSON, HTML ou SQL inline sem muitos
                    escapes, além de suportarem controle de indentação.
                """
        );
    }

}
