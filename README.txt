Código asignatura: 201710_CSOF5101_01
Nombre Asignatura: Conceptos avanzados de ingeniería de software
Tarea 4: Program 4
Nombre estudiante: Miguel Ángel Quintero Piñeros
Fecha de envío: 20 Marzo 2017
**********************************************************************

Instrucciones ejecución programa: 
1. Ingrese a simbolo de sistema (Tecla inicio + cmd + Enter)

2. Ubicarse en la ruta en la cual está el archivo Program4.jar. psp2_2\src\main\java\src (Carpeta del proyecto descargada de gitHub) o Program 4 PSP_Miguel Quintero\src (.zip subibo a sicua)
3. Ejecutar el comando java -jar Program4.jar y pulsar la tecla Enter
4. Ingresar la ruta del directorio a evaluar y presionar la tecla Enter o dar Click en el botón Aceptar de la ventana de mensaje que recibe el dato de entrada y pulsar enter. En la ruta 
Program 4 PSP_Miguel Quintero\test (.zip subido a sicua) o psp2_2\src\site\resources\PSP2_2\test (Carpeta del proyecto descargada de gitHub) se encuentran los archivos prueba.txt y prueba2.txt
 para facilitar las pruebas. La estructura del archivo que recibe el programa tiene separados por comas el nombre de la clase (como en el ejemplo del Asigment kit) el número de líneas por 
clase y el número de métodos. Para el ejemplo de la páginas del libro, tiene el nombre del capítulo y la cantidad de páginas. Ejemplo:

each_char,18,3
string_read,18,3
single_character,25,3
each_line,31,3
.
.
.

Nota: si no se tienen datos en la tercera columna (cantidad de métodos) el programa tomará 1 como valor por defecto


5. Visualizar el resultado en la ventana de Símbolo de Sistema 	     

***************************************************************************
Ruta de los directorios pspdata, pspforms y test 
GitHub:https://github.com/mithrandir1589/psp2_2/tree/master/src/site/resources/PSP2_2
Carpeta: ..\Program 4 PSP_Miguel Quintero\


Nota: Teniendo en cuenta las instrucciones para esta tarea, la estructura del .zip contiene los directorios psp data, psp forms, src, test y readme
Por otro lado el repositorio en GitHub contiene la estructura acostumbrada en GIT src, target, .gitignore, LICENCE.txt, pom.xml y README.xml 
***************************************************************************

ruta del repositorio en gitHub https://github.com/mithrandir1589/psp2_2

***************************************************************************
Para empaquetar el programa con Maven, se debe ejecutar la sentencia "mvn package" en la carpeta raíz de donde se haga el pull del
repositorio git, la cual es la que se descargará desde el repositorio GitHub y donde se encuentra el pom.xml.