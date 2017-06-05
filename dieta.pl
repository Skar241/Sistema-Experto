%Hechos
grupo1('Proatmeal',307).
grupo1('Frutas y Requeson',293).
grupo1('Berry Protein Smoothie',306).
grupo1('Bagel and Lox',291).
grupo1('Clara de huevo y plato Frutas',293).
grupo1('Clara de huevo y plato Frutas 2',296).
grupo1('Cereales Bowl',299).
grupo1('Shakeology Shake',280).
grupo1('Brindis de Maní Butter',280).
grupo1('Tortilla Vegetariana',301).

grupo2('Tortilla de Proteínas',298).
grupo2('Vainilla-Berry',296).
grupo2('Yogurt Bowl',299).
grupo2('Nutricion Bar',280).
grupo2('Sandwich Deli',297).
grupo2('Turquía BLT',293).

grupo3('Ensalada de Pollo a la Parrilla',283).
grupo3('Sushi',311).
grupo3('Sopa de Frijoles y medio Sandwich',299).
grupo3('Teriyaki',295).
grupo3('Asado',292).
grupo3('Saheology',299).
grupo3('Rancho de Pollo Wrap',307).
grupo3('Lean Burger',302).
grupo3('Pasta de Trigo',304).
grupo3('Salmon',301).

grupo4('Sashimi',319).
grupo4('Cold Corte Disco',289).
grupo4('Locura Sandwich',289).
grupo4('Ensalada de atún',289).
grupo4('Turquía Wrap',308).
grupo4('Chile de Pavo',310).
grupo4('Proteína Pizza',313).
grupo4('Shrimp Cocktail',286).
grupo4('Rotisserie chicken',314).
grupo4('Asado de Carne',307).

grupo5('Bacalaoo',286).
grupo5('Cena de Tortilla',302).
grupo5('Carne con Brocoli',304).
grupo5('Hamburguesa de Pollo',296).
grupo5('Salmón a la Parrilla',294).
grupo5('Hamburguesa de Pavo',301).
grupo5('Arroz Integral',318).
grupo5('Cítricos con Pollo',297).
grupo5('Chickenstir',307).
grupo5('Pasta con Mariscos',287).

%Reglas
%MES: 	Meses que lleva con el plan
%ACFIS: Actividad física que va a realizar
%SEX:	Sexo de la persona
%PESO:	Peso en libras
$ALT:	Altura en pulgadas
%EDAD:	Edad en anios
%NUM:	Numeros de retorno
%MET:	Meta que tiene el usuario

cal_mujeres(PESO,ALT,EDAD,NUM):-NUM is 655 + (4.35 * PESO) + (4.7 * ALT) - (4.7 * EDAD).
cal_hombres(PESO,ALT,EDAD,NUM):-NUM is 66 + (6.23 * PESO) + (12.7 * ALT) - (6.8 * EDAD).
calcula_cals(SEX,PESO,ALT,EDAD,NUM):-(SEX == 1 -> cal_hombres(PESO,ALT,EDAD,NUM); cal_mujeres(PESO,ALT,EDAD,NUM)).
factor(ACFIS,X):-(ACFIS == 1 -> X = 1.375;(ACFIS == 4 -> X = 1.7; X = 1.55)).
meta(MET,X):-(MET == 1 -> X = -500;(MET == 2 -> X = 0; X = 250)).
segundom_mes(MET,ACFIS,SEX,PESO,ALT,EDAD,NUM):- factor(ACFIS,Z),meta(MET,X),calcula_cals(SEX,PESO,ALT,EDAD,Y),NUM is ((Z*Y)+X).
prueba(NUM):grupo2(X,Y),grupo1(A,B),NUM is Y+B.
