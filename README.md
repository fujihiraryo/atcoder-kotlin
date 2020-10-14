# AtCoder with Kotlin

```text
macOS: Catalina10.15.6
kotlinc-jvm: 1.3.72 (JRE 11.0.7+10)
ktlint: 0.39.0
```

## setup

A directory `ABC/ABC123` and files `A.kt`, ..., `F.kt` are created.

```bash
./setup.sh ABC/ABC123
cd ABC/ABC123
```

## make sample

```bash
./run.sh sampleA.kt > sampleA.txt
```

## run codes

```bash
./run.sh A.kt < sampleA.txt
```

## formatting

```bash
ktlint -F A.kt
```
