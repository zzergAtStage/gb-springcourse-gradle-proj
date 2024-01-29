# GB Java Фреймворк Spring (семинары)
## Урок 1 Урок 1. Системы сборки Maven и Gradle для разработки Java приложений

> Домашнее задание
Условие:
Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
Пример решения:
>>1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
>>1. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
>>1. Создайте класс Person с полями firstName, lastName и age.
>>1. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
>>1. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.  

**Solution:** 
Created a gradle project:
```bash  
C:.
├───.gradle
│   ├───8.4
│   │   ├───checksums
│   │   ├───dependencies-accessors
│   │   ├───executionHistory
│   │   ├───fileChanges
│   │   ├───fileHashes
│   │   └───vcsMetadata
│   ├───8.5
│   │   ├───checksums
│   │   ├───dependencies-accessors
│   │   ├───fileChanges
│   │   ├───fileHashes
│   │   └───vcsMetadata
│   ├───buildOutputCleanup
│   └───vcs-1
├───.idea
│   └───modules
├───build
│   ├───classes
│   │   └───java
│   │       ├───main
│   │       │   └───com
│   │       │       └───zergatstage
│   │       │           └───grdltst
│   │       └───test
│   │           └───com
│   │               └───zergatstage
│   │                   └───grdltst
│   ├───generated
│   │   └───sources
│   │       ├───annotationProcessor
│   │       │   └───java
│   │       │       ├───main
│   │       │       └───test
│   │       └───headers
│   │           └───java
│   │               ├───main
│   │               └───test
│   ├───libs
│   ├───lombok
│   │   └───effective-config
│   ├───reports
│   │   └───tests
│   │       └───test
│   │           ├───classes
│   │           ├───css
│   │           ├───js
│   │           └───packages
│   ├───test-results
│   │   └───test
│   │       └───binary
│   └───tmp
│       ├───compileJava
│       │   └───compileTransaction
│       │       ├───backup-dir
│       │       └───stash-dir
│       ├───compileTestJava
│       │   └───compileTransaction
│       │       ├───backup-dir
│       │       └───stash-dir
│       ├───jar
│       └───test
├───gradle
│   └───wrapper
└───src
    ├───main
    │   ├───java
    │   │   └───com
    │   │       └───zergatstage
    │   │           └───grdltst
    │   └───resources
    └───test
        ├───java
        │   └───com
        │       └───zergatstage
        │           └───grdltst
        └───resources
```

Added classes ```Person```, ```Controller<T>```, ```MainTest```