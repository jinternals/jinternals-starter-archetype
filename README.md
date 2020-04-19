# jinternals-starter-archetype

```shell script
    mvn clean install
```

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

