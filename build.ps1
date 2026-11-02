param([switch]$Test, [switch]$Package, [string]$Python = 'python')
$ErrorActionPreference = 'Stop'
Push-Location $PSScriptRoot
try {
    $bin = if ($env:JAVA_HOME) { Join-Path $env:JAVA_HOME 'bin' } else { '' }
    $javac = if ($bin) { Join-Path $bin 'javac.exe' } else { 'javac' }
    $jar = if ($bin) { Join-Path $bin 'jar.exe' } else { 'jar' }
    New-Item -ItemType Directory -Force build/classes | Out-Null
    $sources = @(Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName)
    & $javac --release 17 -encoding UTF-8 -d build/classes @sources
    if ($LASTEXITCODE) { throw 'Falha na compilação.' }
    if ($Test) { & $Python tests/test_cli.py; if ($LASTEXITCODE) { throw 'Testes falharam.' } }
    if ($Package) { & $jar cf build/Java-Repeticao.jar -C build/classes . -C . LICENSE -C . README.md; if ($LASTEXITCODE) { throw 'Falha ao empacotar.' } }
} finally { Pop-Location }
