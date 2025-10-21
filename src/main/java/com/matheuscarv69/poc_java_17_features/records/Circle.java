package com.matheuscarv69.poc_java_17_features.records;

/*
 * Principais características de um 'record' em Java:
 *
 * Sintaxe compacta para declarar classes que apenas carregam dados (propriedades).
 * Imutabilidade implícita dos componentes (os campos são finais por padrão).
 * Accessors gerados automaticamente com o nome de cada propriedade (sem o prefixo "get").
 * Implementações automáticas de `equals()`, `hashCode()` e `toString()`.
 * Construtor canônico gerado automaticamente; permite construtor compacto para validações
 * Estende a classe `java.lang.Record`, não pode estender outras classes, mas pode implementar interfaces.
 * Permite métodos de instância e membros estáticos, não é recomendado adicionar estado mutável.
 * Atenção com serialização e compatibilidade se o 'record'for exposto/serializado
 */
public record Circle(Double radius) {

    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
