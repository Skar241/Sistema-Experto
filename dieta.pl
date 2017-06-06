%Hechos

grupo1(CALS,X):-(CALS < 300 -> 
	X = ['Frutas y Requeson',
		 'Bagel and Lox',
		 'Clara de huevo y plato Frutas',
		 'Clara de huevo y plato Frutas 2',
		 'Cereales Bowl',
		 'Shakeology Shake',
		 'Brindis de Maní Butter'
	];
	X = ['Frutas y Requeson',
		 'Bagel and Lox',
		 'Clara de huevo y plato Frutas',
		 'Clara de huevo y plato Frutas 2',
		 'Cereales Bowl',
		 'Shakeology Shake',
		 'Brindis de Maní Butter',
		 'Proatmeal',
		 'Berry Protein Smoothie',
		 'Tortilla Vegetariana'
	]).

grupo2(X):-
	X = ['Tortilla de Proteínas',
		 'Vainilla-Berry',
		 'Yogurt Bowl',
		 'Nutricion Bar',
		 'Sandwich Deli',
		 'Turquía BLT'].

grupo3(CALS,X):-(CALS < 300 ->
	X = ['Ensalada de Pollo a la Parrilla',
		 'Sopa de Frijoles y medio Sandwich',
		 'Teriyaki',
		 'Asado',
		 'Saheology',
		 'Rancho de Pollo Wrap'];
	X = ['Ensalada de Pollo a la Parrilla',
		 'Sopa de Frijoles y medio Sandwich',
		 'Teriyaki',
		 'Asado',
		 'Saheology',
		 'Rancho de Pollo Wrap',
		 'Lean Burger',
		 'Pasta de Trigo',
		 'Salmon',
		 'Sushi']).

grupo4(CALS,X):-(CALS < 300 ->
	X = ['Cold Corte Disco',
		 'Locura Sandwich',
		 'Ensalada de atún',
		 'Shrimp Cocktail'];
	X = ['Cold Corte Disco',
		 'Locura Sandwich',
		 'Ensalada de atún',
		 'Shrimp Cocktail',
		 'Sashimi',
		 'Turquía Wrap',
		 'Chile de Pavo',
		 'Proteína Pizza',
		 'Rotisserie chicken',
		 'Asado de Carne']).

grupo5(CALS,X):-(CALS < 300 ->
	X = ['Bacalaoo',
		 'Hamburguesa de Pollo',
		 'Salmón a la Parrilla',
		 'Cítricos con Pollo',
		 'Pasta con Mariscos'];
	X = ['Bacalaoo',
		 'Hamburguesa de Pollo',
		 'Salmón a la Parrilla',
		 'Cítricos con Pollo',
		 'Pasta con Mariscos',
		 'Cena de Tortilla',
		 'Carne con Brocoli',
		 'Hamburguesa de Pavo',
		 'Arroz Integral',
		 'Chickenstir']).

%Reglas
%MES: 	Meses que lleva con el plan
%ACFIS: Actividad física que va a realizar
%SEX:	Sexo de la persona
%PESO:	Peso en libras
%ALT:	Altura en pulgadas
%EDAD:	Edad en anios
%NUM:	Numeros de retorno
%MET:	Meta que tiene el usuario
%LISTA:	Lista con las dietas
%ELEM:	Elemento seleccionado de la dieta

cal_mujeres(PESO,ALT,EDAD,NUM):-NUM is 655 + (4.35 * PESO) + (4.7 * ALT) - (4.7 * EDAD).
cal_hombres(PESO,ALT,EDAD,NUM):-NUM is 66 + (6.23 * PESO) + (12.7 * ALT) - (6.8 * EDAD).
calcula_cals(SEX,PESO,ALT,EDAD,NUM):-(SEX == 1 -> cal_hombres(PESO,ALT,EDAD,NUM); cal_mujeres(PESO,ALT,EDAD,NUM)).
factor(ACFIS,X):-(ACFIS == 1 -> X = 1.375;(ACFIS == 4 -> X = 1.7; X = 1.55)).
meta(MET,X):-(MET == 1 -> X = -500;(MET == 2 -> X = 0; X = 250)).
segundo_mes(MET,ACFIS,SEX,PESO,ALT,EDAD,NUM):- factor(ACFIS,Z),meta(MET,X),calcula_cals(SEX,PESO,ALT,EDAD,Y),NUM is ((Z*Y)+X).
primer_mes(ACFIS,X):- (ACFIS == 1 -> X = 1500;(ACFIS == 4 -> X = 2200; X = 1800)).

seleccion([], []).
seleccion(LISTA, ELEM):-length(LISTA, TAM),random(0, TAM, Index),nth0(Index, LISTA, ELEM).
dieta(CALS,LISTA):-grupo1(CALS/5,A),grupo2(B),grupo3(CALS/5,C),grupo4(CALS/5,D),grupo5(CALS/5,E),
	seleccion(A,Z),seleccion(B,X),seleccion(C,W),seleccion(D,V),seleccion(E,U), LISTA = [Z,X,W,V,U].


se(MES,MET,ACFIS,SEX,PESO,ALT,EDAD,LISTA):-(MES == 1 -> primer_mes(ACFIS,X),dieta(X,LISTA);
	segundo_mes(MET,ACFIS,SEX,PESO,ALT,EDAD,X),dieta(X,LISTA)).