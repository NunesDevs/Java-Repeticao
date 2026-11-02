from pathlib import Path
import os, subprocess, unittest
ROOT = Path(__file__).resolve().parents[1]
JAVA = str(Path(os.environ['JAVA_HOME'])/'bin/java.exe') if os.environ.get('JAVA_HOME') else 'java'
def run(name, data=''):
    result = subprocess.run([JAVA, '-Dfile.encoding=UTF-8', '-cp', str(ROOT/'build/classes'), 'com.NunesDev.'+name], input=data, text=True, encoding='utf-8', capture_output=True, timeout=10)
    if result.returncode: raise AssertionError(result.stderr)
    return result.stdout
class RegressionTests(unittest.TestCase):
    def test_factorial_exact_and_zero(self):
        self.assertIn('20! = 2432902008176640000', run('Loops.Fatorial', '20\n'))
        self.assertIn('0! = 1', run('Loops.Fatorial', '0\n'))
    def test_negative_max_and_fractional_mean(self):
        output=run('Loops.MaiorEMedia','-9\n-8\n-7\n-6\n-1\n')
        self.assertIn('Maior: -1',output); self.assertIn('Média: -6.2',output)
    def test_zero_count_needs_no_value(self):
        self.assertIn('Quantidade pares: 0', run('Loops.ParImpar','0\n'))
    def test_invalid_input_and_eof(self):
        self.assertIn('Nota válida!',run('Loops.Notas','abc\n-1\n11\n10\n'))
        for name in ['Fatorial','MaiorEMedia','ParImpar','Notas','NotaIdade','Tabuada']: run('Loops.'+name)
    def test_consonants_and_forward_array(self):
        self.assertIn('Quantidade de consoantes: 3',run('Arrays.Consoantes','1\na\né\nç\nb\nc\nu\n'))
        self.assertIn('-7 -5 15 50 8 4',run('Arrays.OrdemInversa'))
if __name__ == '__main__': unittest.main()
