# Taller 3

## Caso a desarrollar
- Sistema de gesion de club deportivo

### Clases identificadas para desarrollar el caso (Clase : Descripcion (atributos ("Clase" relacion)))

- ClubDeportivo : La clase principal para manejar el sistema (equipos ("Equipo" agregacion), canchas ("Cancha" composicion))
- Deportista : Clase que albergara la informacion de un deportista (nombre, apellido, contacto y deporte a realizar)
- Equipo : Clase que albergara la informacion de un equipo de algun deporte (nombre, deporte, deportistas ("Deportista" agregacion) y entrenador ("Entrenador" agregacion))
- Entrenador : Clase que albergara la informacion de un entrenador (nombre, experiencia y deporte de especializacion)
- Cancha : Clase que alberga informacion de las canchas del club (tipo de superficie, ubicacion dentro del club, capacidad de espectadores y una lista con el horario ocupado y disponible)
- Partidos : Clase que albergara la informacion de los partidos a realizar (deporte, equipos ("Equipo" composicion), cancha ("Cancha" composicion), resultado del partido y fecha del juego)

#### Informacion adicional
- Un deportista solo puede pertenecer a un equipo a la vez
- Los entrenadores dirigen solo un equipo
- Solo puede haber un partido en cancha en un mismo horario
- Las canchas deben consultar disponibilidad para evitar lo anterior y realizar reservas


### Desarrollador (nombre  |  usuario)
- Francisco Lizama | Fran416