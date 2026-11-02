# Exercícios Java de laços e arrays

Dez exemplos independentes de repetição, números e arrays.

## Comportamento

- Fatorial exato com `BigInteger`, incluindo `0!`, limitado a 10000 para controlar o volume de saída.
- Maior valor correto para entradas negativas e média com parte fracionária, sem overflow na soma de cinco inteiros.
- Contagem par/ímpar aceita quantidade zero e a ordem direta exibe todo o vetor.
- Leitura de inteiros com recuperação de texto inválido e encerramento por EOF.
- Consoantes aceitam letras acentuadas e rejeitam entradas que não sejam uma letra.

## Executar e validar

JDK 17 ou superior. Python 3.10+ é usado somente pela suíte de regressão.

```powershell
./build.ps1 -Package
java -cp build/Java-Repeticao.jar com.NunesDev.Loops.Fatorial
java -cp build/Java-Repeticao.jar com.NunesDev.Arrays.OrdemInversa
python tests/test_cli.py
```

Outros programas: `Loops.Tabuada`, `Loops.MaiorEMedia`, `Loops.ParImpar`, `Loops.Notas`, `Loops.NotaIdade`, `Arrays.Consoantes`, `Arrays.MultiDim` e `Arrays.NumerosAleatorios`, todos sob `com.NunesDev`.

## Limites

Os exemplos são independentes e não persistem dados. Os exemplos aleatórios variam a cada execução. O fatorial tem um limite explícito; não se destina a cálculos sem limite de recursos.

## Manutenção e licença

Código autoral licenciado sob a [MIT](LICENSE). Dependências, ferramentas e materiais de terceiros mantêm suas próprias licenças e avisos.

Decisões e continuidade: [PROJECT_MEMORY.md](PROJECT_MEMORY.md).
