# jinternals-starter-archetype

#### 1. Build archetype
```shell script
    mvn clean install
```

#### 2. Generate starter project from archtype

```shell script
    mvn archetype:generate                              \
      -DarchetypeCatalog=local                          \
      -DinteractiveMode=false                           \
      -DarchetypeGroupId=com.jinternals                 \
      -DarchetypeArtifactId=jinternals-starter-archetype\
      -DarchetypeVersion=1.0-SNAPSHOT                   \
      -DartifactId=jinternals-demo                      \
      -DgroupId=com.jinternals.demo                     \
      -Dversion=1.0-SNAPSHOT                            \
      -DclassPrefix=JinternalsDemo
```

