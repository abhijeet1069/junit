# JUnit Core

## Assertions

Assertions are used to verify correctness.

```java
assertEquals(expected, actual);
assertTrue(condition);
assertThrows(Exception.class, () -> method());
```
[Assertions example](src/test/java/manning/assertions/AssertionsExample.java)

## Assumptions

Assumptions are used to check if test should run.
If condition false → test skipped

## Nested tests

## Tagging