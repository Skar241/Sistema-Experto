%BC para rutinas
%

%********* TIPO DE CUERPO *********%
tipoCuerpo(endomorfo, SumaPuntos):- SumaPuntos >=  28 , SumaPuntos =< 37.
tipoCuerpo(mesomorfo, SumaPuntos):- SumaPuntos >= 20, SumaPuntos =< 27.
tipoCuerpo(ectomorfo, SumaPuntos):- SumaPuntos >= 12, SumaPuntos =< 19.

%**********METAS X TIPO CUERPO *****%
meta(ectomorfo, aumentarMM).
meta(endomorfo, bajarPeso).
meta(mesomorfo, definirCuerpo).

%********* PLAN SEMANAL *********%
rutinaSemanal(3, rutina3D).
rutinaSemanal(4, rutina4D).
rutinaSemanal(5, rutina5D).
rutinaSemanal(6, rutina6D).

%********* Recomendacion *********%
recomendacion(aumentarMM, masPeso).
recomendacion(bajarPeso, hacerCardio).
recomendacion(definicion,  masRepeticiones).

%********* Ejercicios por músculo *********%
ejerciciosMusculos(pecho, ejerciciosP).
ejerciciosMusculos(espalda, ejerciciosE).
ejerciciosMusculos(biceps, ejerciciosB).
ejerciciosMusculos(triceps, ejerciciosT).
ejerciciosMusculos(pierna,  ejerciciosPI).
ejerciciosMusculos(hombros, ejerciciosH).
ejerciciosMusculos(abdominales, ejerciciosA).
ejerciciosMusculos(cardio, ejerciciosC).
