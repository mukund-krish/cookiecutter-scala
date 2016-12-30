# Scala Cookiecutter template #

A cookiecutter template for generating SBT projects.

## How to use? ##


* Install cookiecutter globally. (you will need python pip installed)
 
```
#!bash
> sudo pip install cookiecutter 
```

* Install mercurial if you don't have it

```
#!shell
> sudo aptitued install mercurial 
```

* Create a barebone sbt/scala project using cookiecutter

```
#!shell
> cookiecutter bb:mukund_kri/scala-cookiecutter 
```

  cookiecutter will prompt you for name, version etc. Fill these up. At the end of this process
  you should have a simple scala+sbt project


* cd into the newly created project and start coding