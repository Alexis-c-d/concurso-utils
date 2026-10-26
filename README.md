# Concurso Utilities
Mathematical and algorithmic utilities originally built for a programming competition. All GUI-based via `JOptionPane`.

## Utilities
| File | Algorithm | Input/Output |
|------|-----------|--------------|
| `BinarioDecimal.java` | Binary → Decimal | `Integer.parseInt(str, 2)` |
| `DecimalBinario.java` | Decimal → Binary | Repeated division by 2 |
| `MCD.java` | Euclidean GCD | `while (b != 0) { a %= b; swap }` |
| `Suma.java` | Digit sum | Modulo 10 accumulation |
| `Magico.java` | Digital root == 1 | Iterative digit sum until single digit |

## Run
```bash
javac src/*.java -d bin
java -cp bin BinarioDecimal
```

🤖 Generated with [Claude Code](https://claude.com/claude-code)
Co-Authored-By: Claude Code <noreply@anthropic.com>