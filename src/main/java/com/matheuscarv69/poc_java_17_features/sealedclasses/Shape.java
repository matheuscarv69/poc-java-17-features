package com.matheuscarv69.poc_java_17_features.sealedclasses;

/*
 * Sealed classes/interfaces em Java:
 *
 * - Controlam explicitamente quais tipos podem estender/implementar a classe/interface.
 * - Usa a palavra-chave `sealed` e, normalmente, a cláusula `permits` para listar os permitidos.
 * - Subclasses obrigatoriamente devem ser `final`, `sealed` ou `non-sealed`.
 * - Mantém a hierarquia mais segura e previsível, útil para modelagem de domínio.
 * - Facilita verificações no compilador e integra bem com pattern matching/switch.
 *
 * Subclasses permitidas por uma `sealed` declaration têm de escolher explicitamente um dos três caminhos;
 * isso garante que a hierarquia de tipos continua previsível para o compilador.
 *
 * - `final`: proíbe novas subclasses — terminal.
 * - `sealed`: continua a restringir a hierarquia; a subclass `sealed` deve declarar seu próprio `permits`.
 * - `non-sealed`: remove a restrição e permite que qualquer código crie subclasses (abre a hierarquia).
 *
 * Regras importantes:
 * - As classes/interfaces listadas em `permits` devem estar no mesmo módulo ou, se não houver módulo, no mesmo pacote.
 * - Se uma permitted subclass não declarar `final`/`sealed`/`non-sealed` haverá erro de compilação.
 * - `record` é implicitamente `final` e pode ser uma permitted subclass.
 */
sealed interface Shape permits Square, Rectangle{

    Double area();

}
