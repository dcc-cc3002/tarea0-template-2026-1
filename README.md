# Malatro 2026 | CC3002

## Warning conocido al correr tests

Si al ejecutar `sbt test` o correr tests desde IntelliJ aparece un warning como este:

```text
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by scala.runtime.LazyVals$
```

pueden ignorarlo.

Es un warning conocido de la combinación `Scala 3` + `Java 25` y no significa que sus tests hayan fallado. Si el proceso termina con `exit code 0` o `sbt test` reporta que los tests pasaron, entonces la configuración está bien.
