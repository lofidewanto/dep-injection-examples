dep-injection-examples
======================

Examples and Introduction for Dependency Injection and Inversion of Control:
- [With primitive "new"](https://github.com/lofidewanto/dep-injection-examples/tree/master/di-primitive-new)
- [Factory](https://github.com/lofidewanto/dep-injection-examples/tree/master/di-primitive-factory)
- DI without any frameworks:
  - [Constructor](https://github.com/lofidewanto/dep-injection-examples/tree/master/di-inject-constructor)
  - [Setter](https://github.com/lofidewanto/dep-injection-examples/tree/master/di-inject-setter)
- DI with frameworks:
  - [Guice](https://github.com/lofidewanto/dep-injection-examples/tree/master/di-inject-constructor-guice)
  - CDI / JBoss Weld (not yet available, open for a PR / MR 😉)
  - [Spring Framework - Field injection](https://github.com/lofidewanto/dep-injection-examples/tree/master/di-inject-field-spring) - Spring also supports Constructor and Setter injection.
  - [GWT Gin](https://github.com/lofidewanto/dep-injection-examples/tree/master/di-inject-constructor-gwt-gin)
  - Dagger2 (not yet available, open for a PR / MR 😉)

Our current build status: ![Build Status GitHub Actions](https://github.com/lofidewanto/dep-injection-examples/actions/workflows/maven.yml/badge.svg)

Works with Java 11 only. Not yet with Java 17 because of Maven Plugin of KissMDA.
  - Change to Java 11 with SDKMAN!: sdk use java xxx
  - Build with mvn clean verify (mvnd may have some problems with parallel generation of KissMDA)
