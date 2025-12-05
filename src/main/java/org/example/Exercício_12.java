/*
 *
 * O problema do default é que o Enum TipoNotificacao (usado no switch) já tem um número fixo de possibilidades.
 * O importante é aplicar o switch de forma exaustiva para garantir que todas as possibilidades do tipo sejam cobertas.
 * Colocar um default é redudante, e pode inclusive, causar problemas no futuro ao adicionar novos valores dentro do Enum; visto que correrão o risco de cair em default.  
 * Este problema pode ser corrigido ao eliminar o default da estrutura.
 *
 */
