# Proyecto Integrador de la primer semana - Curso SysOne
Matías Ferraro

## Enunciado
En un puerto se alquilan amarras para barcos de distinto tipo. Para cada ALQUILER se guarda el nombre y DNI del cliente, las fechas inicial y final de  alquiler, la posición del amarre y el barco que lo ocupará.

Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación.

Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo los días inicial y final) por un módulo función de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora) y por un valor fijo (2 en la actualidad).

Sin embargo ahora se pretende diferenciar la información de algunos tipos de barcos:
	o Número de mástiles para veleros
	o Potencia en CV para embarcaciones deportivas a motor
	o Potencia en CV y número de camarotes para yates de lujo

El módulo de los barcos de un tipo especial se obtiene como el módulo normal mas:
  o El número de mástiles para veleros
  o La potencia en CV para embarcaciones deportivas a motor
  o La potencia en CV mas el número de camarotes para yates de lujo

Utilizando la herencia de forma apropiada desarrollar un programa que liste el mayor alquiler, el menor y el promedio mensual y anual

NOTA: Se asume que los alquiler comienzan y terminan en el mismo mes
