# Revisão de qualidade — 2026-11-01

Dez exemplos independentes de repetição, números e arrays.

## Escopo

Leitura de fontes, documentação, configurações e scripts do projeto, excluindo dependências, metadados Git e saídas geradas. Sem alteração visual; mudanças de interface gráfica exigem Figma.

## Correções e decisões

- Fatorial exato com `BigInteger`, incluindo `0!`, limitado a 10000 para controlar o volume de saída.
- Maior valor correto para entradas negativas e média com parte fracionária, sem overflow na soma de cinco inteiros.
- Contagem par/ímpar aceita quantidade zero e a ordem direta exibe todo o vetor.
- Leitura de inteiros com recuperação de texto inválido e encerramento por EOF.
- Consoantes aceitam letras acentuadas e rejeitam entradas que não sejam uma letra.

## Como validar

JDK 17 ou superior. Python 3.10+ é usado somente pela suíte de regressão.

```powershell
./build.ps1 -Package
java -cp build/Java-Repeticao.jar com.NunesDev.Loops.Fatorial
java -cp build/Java-Repeticao.jar com.NunesDev.Arrays.OrdemInversa
python tests/test_cli.py
```

Outros programas: `Loops.Tabuada`, `Loops.MaiorEMedia`, `Loops.ParImpar`, `Loops.Notas`, `Loops.NotaIdade`, `Arrays.Consoantes`, `Arrays.MultiDim` e `Arrays.NumerosAleatorios`, todos sob `com.NunesDev`.

## Limites reais

Os exemplos são independentes e não persistem dados. Os exemplos aleatórios variam a cada execução. O fatorial tem um limite explícito; não se destina a cálculos sem limite de recursos.

Confira `PROJECT_MEMORY.md` para continuidade. Os resultados executados estão registrados abaixo.

## Resultado executado

Build/JAR Java 17 e cinco testes de regressão executando os programas reais aprovados (fatorial, negativos/média fracionária, zero, entrada inválida/EOF, consoantes e vetor).

Publicação em produção não foi realizada. Pacotes foram preparados e a publicação da branch será registrada na auditoria local; integração e distribuição são coordenadas separadamente.
