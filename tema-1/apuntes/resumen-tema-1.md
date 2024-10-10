## PMDM | UNIDAD 1 | ANALISIS TECNOLOGICO PARA DISPOSITIVOS MOVILES

###   1. DISPOSITIVOS MOVILES: TIPOS, HISTORIA Y EVOLUCION
La revolución de los smartphones, llego con la introducción de los mismos a finales de los 90 y principios de los 2000. Estos dispositivos combinan la capacidad de hacer llamadas con otras más actualizadas (acceso a Internet, correo electrónico y aplicaciones). 

El BlackBerry es el primero de los smartphones exitosos (móvil y mensajería).

La era táctil, llego con el IPhone en 2007, la pantalla táctil capacitiva (introducida por Apple) permite realizar gestos intuitivos como pellizcar o deslizar.

Hacia el futuro, la evolución no desacelera, en 2020 llego la tecnología 5G la cual permite velocidades de Internet aun mas rápidas y con una mayor cantidad de transmisión de datos. Además de avances como la Realidad Aumentada (RA) o la Realidad Virtual (RV).

Los sistemas operativos de dispositivos móviles están coronado con un 71,28% por parte de Android y un 28,02% por parte de IOS.

-----------------------------
###   2. CARACTERÍSTICAS Y LIMITACIONES EN EL DESARROLLO DE APLICACIONES PARA DISPOSITIVOS MÓVILES
Las aplicaciones móviles no son aplicaciones de escritorio adaptadas para dispositivos con pantallas pequeñas. Es necesario que sean aplicaciones diferentes por:
- Se debe evitar la sobrecarga de elementos multimedia.
- El tamaño de las pantallas y su iluminación.
- Generar menús poco sobrecargados, facilitando la introducción de información mediante desplegables.
- Distribución de elementos en pantalla de forma intuitiva y natural, agrupando los componentes por funcionalidades.
- Durante el envio y la recepción de datos avisar al usuario del proceso.
- Las conexiones pueden fallar por la falta de cobertura en los dispositivos móviles.

--------------------
###   3. TIPOLOGÍAS DE LAS APLICACIONES MÓVILES
Podemos encontrar distintos enfoques para desarrollar aplicaciones móviles: aplicaciones nativas, aplicaciones web, aplicaciones hibridas, aplicaciones progresivas (pwa), aplicaciones de compilación cruzada y aplicaciones interpretadas o de Scripting en vivo.
#### APLICACIONES NATIVAS
Estas aplicaciones se crean específicamente para cada plataforma haciendo uso del lenguaje o lenguajes que usa de forma nativa la plataforma. 
Las **ventajas** son:
- Se obtiene un acceso total al hardware del dispositivo.
- Máximo rendimiento y fluidez en las aplicaciones.
Pero también contienen **inconvenientes:**
- Nuevo desarrollo para cada plataforma.
- Mayor tiempo de desarrollo y mayor coste final.
#### APLICACIONES WEB
Estas aplicaciones tienen como característica principal su ciclo de vida, en el contexto de un navegador web.
Las **ventajas** que poseen las aplicaciones web son:
- Desarrollo mas versátil, no se depende de un SSOO concreto.
- Mayor rango de difusión al abarcar todas las stores.
Pero también poseen **inconvenientes** tales como:
- Especial cuidado con la compatibilidad entre navegadores.
- Acceso muy limitado al hardware del dispositivo.
#### APLICACIONES HIBRIDAS
Las aplicaciones hibridas (o multiplataforma) combinan elementos de las aplicaciones nativas y las aplicaciones web. Se desarrollan utilizando tecnologías web como HTML, CSS y JavaScript, sin embargo se empaquetan en un formato que pueden ser instalados en un dispositivo móvil como cualquier aplicación nativa.
Se pretende obtener las ventajas de las aplicaciones nativas y las aplicaciones web. Una aplicación hibrida utiliza el motor del navegador del dispositivo y sincroniza el contenido HTML, CSS y JavaScript en contenedores web nativos como WebView (Android) o WKWebView (IOS).

-----------
###   4. ARQUITECTURA ANDROID
Android esta construido sobre un núcleo Linux, pero modificado drásticamente para adaptarse a los dispositivos móviles. Esta elección esta basada en la excelente *portabilidad*, *flexibilidad* y *seguridad* que posee Linux. Android esta bajo licencia GPL ya que hereda el Kernel de Linux.

- **Capas de librerías nativas:** En esta capa se encuentran partes como la *HAL*, *librerías nativas*, *demonios*, las *herramientas de consola* y *manejadores de tiempo de ejecución*. 
	- *Capa de Abstracción de Hardware (HAL):* Es el componente que permite la independencia del hardware. Esto quiere decir que Android esta construido para poder ejecutarse en cualquier dispositivo móvil, sin importar la arquitectura física. Actúa como una arquitectura genérica que representa a todos los posibles tipos de hardware que pueda haber en el mercado.

- **Android Runtime:** Las aplicaciones Android están escritas en Java o Kotlin estas son traducidas a bytecode e interpretadas por la Maquina Virtual llamada ART, esta herramienta fue diseñada para ser flexible ante el diseño de hardware de un dispositivo móvil. Además la JVM no es de licencia GPL, así que Google decidió generar su propia herramienta que ha conseguido reducir el tiempo de ejecución en un 33%.

- **Framework para aplicaciones:** Encontramos todas las librerías necesarias para programar nuestras aplicaciones. Los paquetes mas destacados son los "android.* " ya que alojan todas las características necesarias de una aplicación Android. También podemos encontrar *manejadores*, *servicios* y *proveedores* de contenido que soportan comunicación con nuestra aplicación con Android.

- **Capa de aplicaciones:** Es la ultima capa del funcionamiento de Android. Esta centrada en la *ejecución*, *comunicación* y *estabilidad* de las aplicaciones preinstaladas por el fabricante o las que vamos a construir. A ella acceden los usuarios Android debido a su alto nivel de comprensión y simplicidad.
------------------

###   5. ARQUITECTURA IOS
IOS se divide en 4 capas o instancias del sistemas operativo, desde la capa mas importante para el desarrollador hasta la mas importante para el hardware o los componentes. Las capas que podemos encontrar en IOS son:

- **Cocoa Touch:** Es la capa superior y la mas importante para el desarrollo de aplicaciones en IOS. Los usuarios la utilizan para *interactuar con las aplicaciones*, se utilizan principalmente 2 Frameworks: UIKit (clases para el desarrollo de una *interfaz de usuario*) y Foundation Framework (*acceso* y manejo de *objetos* y *servicios* del S.O.)

- **Media Services:** Provee los servicios de *gráficos*, *audio* y *multimedia* a la capa superior.

- **Core Services:** Proporciona los *servicios* imprescindibles del sistema para poder ser utilizados por todas las apps

- **Core OS:** Es el núcleo del sistema con las características de *bajo nivel*, *manejo de memoria*, *seguridad*, *drivers*...
