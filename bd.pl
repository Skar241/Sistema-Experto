%BD para rutinas
%

%********* TIPO DE CUERPO *********%
tipoCuerpo(endomorfo, SumaPuntos):- SumaPuntos >=  28 , SumaPuntos =< 37.
tipoCuerpo(mesomorfo, SumaPuntos):- SumaPuntos >= 20, SumaPuntos =< 27.
tipoCuerpo(ectomorfo, SumaPuntos):- SumaPuntos >= 12, SumaPuntos =< 19.

%********* Disponibilidad semanal *********%
disponibilidad(Dias, Rutinas):- rutinaSemanal(Dias, Rutinas).

%********* PLAN SEMANAL *********%
rutinaSemanal(3, Rutinas):-  Rutinas = [[pecho, triceps],[espalda,biceps],[pierna,hombro]].
rutinaSemanal(4,Rutinas):- Rutinas = [[pecho,triceps], [espalda,biceps], pierna, hombro].
rutinaSemanal(5, Rutinas):- Rutinas = [pecho, espalda, pierna, hombro, [biceps,triceps]].
rutinaSemanal(6, Rutinas):- Rutinas = [pecho, espalda, pierna, triceps, biceps, hombro].

%********* Restricciones *********%
restriccion(ectomorfo, bajarPeso, Mensaje):-  Mensaje="No te conviene bajar de peso".
restriccion(endomorfo, aumentarMM, Mensaje):- Mensaje="No te conviene aumentar masa muscular".

%********* Recomendacion *********%
recomendacion(aumentarMM, masPeso).
recomendacion(bajarPeso, hacerCardio).
recomendacion(definicion,  masRepeticiones).

%********* Plan final *********%
calcularPlan(Meta, Dias):-  recomendacion(Meta, M), write(M), rutinaSemanal(Dias, Rutinas), write(Rutinas).



%********* Consultas *********%
%se(Dias):-  disponibilidad(Dias, Rutinas), write(Rutinas).
% se(SumaPuntos, Meta, Dias):- tipoCuerpo(TC, SumaPuntos) -> write(TC),
% restriccion(TC, Meta, Mensaje) -> write(Mensaje) : calcularPlan(Meta,
% Dias).

