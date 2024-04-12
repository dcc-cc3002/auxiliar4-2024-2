# Auxiliar 4: Herencia y Clases Abstractas

## Contexto

Usted está desarrollando una aplicación para publicar y compartir vídeos (ITube).
Para eso, le piden que implemente la lógica de los distintos tipos de cuenta que
pueden haber en la plataforma.

## Cuentas

Todas las cuentas de la plataforma deben ser capaces de:

+ Tener un nombre de usuario
+ Escribir comentarios en vídeos
+ Dar like a vídeos

Se espera que se implementen los siguientes métodos para cumplir con las
funcionalidades:

```scala
def getUsername: String

def writeComment(video: Video, comment: String): Unit

def likeVideo(video: Video): Unit
```

En la plataforma se pueden separar los tipos de cuentas en dos categorias:
**Creadores de Contenido** y **Usuarios**.

### Creadores de Contenido

Los creadores de contenido son un tipo de cuenta especial que es capaz de
vídeos en la plataforma, a diferencia de los usuarios normales. Un creador de
contenido debe ser capaz de:

+ Tener suscriptores
+ Publicar vídeos a la plataforma
+ Eliminar sus vídeos de la plataforma
+ Agregar suscriptores nuevos

Se espera que se implementen los siguientes métodos para cumplir con las
funcionalidades:

```scala
def getSubscribers: ???

def uploadVideo(video: Video, app: ITube): Unit

def deleteVideo(video: Video, app: ITube): Unit

def addSubscribers(user: ???): Unit
```

### Usuarios

Los usuarios son un tipo de cuenta que se dedica a consumir contenido en la
aplicación. Este tipo de cuenta debe ser capaz de:

+ Tener canales a los que está suscrito
+ Suscribirse a canales nuevos

Se espera que se implementen los siguientes métodos para cumplir con las
funcionalidades:

```scala
def getSubscriptions: ???

def subscribeTo(creator: ContentCreator): Unit
```

Este tipo de usuarios se puede clasificar en dos tipos: **Usuario Básico** y
**Usuario Premium**.

#### Usuario Básico

Un usuario básico no tiene funcionalidades personalizadas.

#### Usuario Premium

Un usuario premium puede desacargar contenido para poder verlo sin tener
que estar conectado a internet. Para esto, la cuenta debe ser capaz de:

+ Almacenar vídeos descargados
+ Descargar vídeos

Se espera que se implementen los siguientes métodos para cumplir con las
funcionalidades:

```scala
def getDownloadedVideos: ???

def downloadVideo(video: Video): Unit
```