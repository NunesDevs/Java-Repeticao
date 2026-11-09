# Memória do projeto

Revisão: 2026-11-01. Ler este arquivo e `docs/ai-context/QUALITY_REVIEW_2026-11-01.md` antes de retomar alterações.

## Objetivo e estado

Dez exemplos independentes de repetição, números e arrays.

Mudanças funcionais desta revisão:
- Fatorial exato com `BigInteger`, incluindo `0!`, limitado a 10000 para controlar o volume de saída.
- Maior valor correto para entradas negativas e média com parte fracionária, sem overflow na soma de cinco inteiros.
- Contagem par/ímpar aceita quantidade zero e a ordem direta exibe todo o vetor.
- Leitura de inteiros com recuperação de texto inválido e encerramento por EOF.
- Consoantes aceitam letras acentuadas e rejeitam entradas que não sejam uma letra.

## Decisões

- Preservar o propósito didático e o histórico anterior do Git.
- Manter esta revisão na branch `codex/quality-refresh` até integração coordenada.
- Preservar arquivos locais e avisos de terceiros; não versionar resultados de build, credenciais ou dados reais.
- Artefatos de console são distribuíveis locais. Um build ou pacote não comprova publicação em produção.

## Validação reproduzível

JDK 17 ou superior. Python 3.10+ é usado somente pela suíte de regressão.

```powershell
./build.ps1 -Package
java -cp build/Java-Repeticao.jar com.NunesDev.Loops.Fatorial
java -cp build/Java-Repeticao.jar com.NunesDev.Arrays.OrdemInversa
python tests/test_cli.py
```

Outros programas: `Loops.Tabuada`, `Loops.MaiorEMedia`, `Loops.ParImpar`, `Loops.Notas`, `Loops.NotaIdade`, `Arrays.Consoantes`, `Arrays.MultiDim` e `Arrays.NumerosAleatorios`, todos sob `com.NunesDev`.

## Limitações para continuidade

Os exemplos são independentes e não persistem dados. Os exemplos aleatórios variam a cada execução. O fatorial tem um limite explícito; não se destina a cálculos sem limite de recursos.

Os documentos automáticos de maio em `docs/ai-context` são um registro histórico, incluindo falsos positivos por palavras como “secret”. Esta memória e a revisão de qualidade descrevem o estado posterior às correções.

## Evidência da revisão

Build/JAR Java 17 e cinco testes de regressão executando os programas reais aprovados (fatorial, negativos/média fracionária, zero, entrada inválida/EOF, consoantes e vetor).

## CI — 2026-11-08

O workflow `.github/workflows/ci.yml` valida a stack e os testes reais deste projeto em push/PR para `main` e por disparo manual. Usa ações oficiais fixadas por SHA, permissão `contents: read` e checkout sem credenciais persistentes. Não faz deploy nem publica pacotes.

A release `v2026.11.8` e seus binários continuam associados ao código `dbca26642403a97ac3879644703cdfeea45a1289`. O commit de workflow/documentação é posterior e não muda os artefatos já compilados. Resultado da execução remota disponível na aba Actions; não confundir configuração do workflow com aprovação de uma execução.
