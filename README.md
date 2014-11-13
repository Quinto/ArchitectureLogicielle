ArchitectureLogicielle : Projet de dessin vectoriel
===================================================

=======
Auteurs
=======

Quentin ZANINETTI et Cheikh Sylla

=================
Contenu du projet
=================

Dans le r�pertoire src on peut trouver tout le code source du projet.

Le package fabrique
===================

Ce package contient les diff�rentes fabriques permettant de construire les objets du langage cr��.

DessinerChemin est une fabrique qui permet de cr�er une instance des diff�rentes formes dessinables.
FabriqueStructure est une fabrique permettant de cr�er des structures logiques (boucles for, if then 
else, sequence d'instructions)
Manipulations est une fabrique qui permet de r�aliser des manipulations sp�cifiques comme placer une 
�tiquette dans un dessin ou remplir des formes d'une certaine couleur.
FabriqueObjet permet de cr�er des crayons et des scripts.

Le package langage
==================

Ce package contient les classes d�finissant le langage de dessin vectoriel cr��. On y trouve les diff�rents
objets du langage :
- Crayon qui d�finit comment sont trac�s les formes
- Les chemins : ligne, cercle, rectangle, polygone
- Les structures logiques : For, Sequence, Alternative
- Les manipulations sp�cifiques : Remplir, Etiqueter
- Script �tant l'objet de base contenant les instructions � ex�cuter pour d�finir le dessin.

Le package vue
==============

Ce package contient les interpr�tations qu'on peut faire d'un dessin.

Un interpr�teurSVG est impl�ment� et il permet de traduire un dessin cr�� par un script en un fichier svg lisible
par un navigateur web comme Mozilla Firefox. Il est possible d'impl�menter d'autres interpr�tations d'un dessin en
impl�mentant l'interface Interpreteur.

======================
Utilisation du langage
======================

L'utiliseur code son dessin vectoriel dans la m�thode main de la classe Main. Il commence par d�clarer un nouveau 
script et un nouveau dessin :
Script scriptPrincipal = FabriqueObjet.creerScript();
Dessin d = FabriqueObjet.creerDessin(nomDuDessin);

L'utilisateur peut se cr�er diff�rents crayons qu'il pourra utiliser pour tracer les chemins :
Crayon c = FabriqueObjet.creerCrayon(largeurBordure, opaciteBordure, couleur)
Note : La couleur est une string �tant le nom de la couleur voulue en anglais

L'utilisateur choisit ensuite un interpr�teur pour son dessin :
Interpreteur i = FabriqueObjet.creerInterpreteurSVG();

L'utilisateur peut alors d�finir les diff�rentes instructions qui constitueront son script :

- il peut simplement dessiner des chemins :
Instruction i1 = DessinerChemin.creerLigne(abscissePoint1, ordonneePoint1, abscissePoint2, ordonneePoint2, crayon, dessin);
Cette instruction permet de cr�er une ligne dans le dessin dessin avec le crayon crayon entre les points aux coordonn�es choisies.
Instruction i2 = DessinerChemin.creerCercle(abscisseCentre, ordonneeCentre, rayon, crayon, dessin);
Meme chose pour un cercle en d�finissant son centre et son rayon.

- il peut utiliser des structures plus complexes :
Instruction i3 = FabriqueStructure.For(script, nbFois);
permet de r�p�ter nbFois les instructions contenues dans le script script
Instruction i4 = FabriqueStructure.Alternative(bool, i1, i2);
permet d'ex�cuter i1 si bool est true et i2 sinon (Alternative ne prend pas forc�ment que des Instruction en argument,
il peut aussi prendre des scripts entiers)
Instruction i5 = FabriqueStructure.Sequence() permet de cr�er une s�quence puis
i5.addToSequence(instruction) permet d'ajouter dans l'ordre d'ex�cution souhait� les instructions constituant la s�quence
Par exemple :
i5.addToSequence(i2);
i5.addToSequence(i1);
fera s'ex�cuter i2 puis i1 quand la s�quence sera ex�cut�e.

- il peut faire d'autres manipulations :
Instruction i6 = Manipulations.Remplir(i2, "yellow"); permet de r�cup�rer le cercle cr�� par i2 et de le remplir en jaune
Instruction i7 = Manipulations.Etiqueter(texte, origineX, origineY, dessin, taillePolice, couleur); permet de cr�er
une �tiquette contenant le texte texte dont le coin inf�rieur gauche est plac� en (origineX, origineY) dans le dessin dessin
et dont la taille de police et la couleur sont d�finies.

Lorsque l'utilisateur a �crit ses diff�rentes instructions il doit les attacher � un script dans l'ordre d'ex�cution voulu :
scriptPrincipal.addInstruction(instruction);

Pour finir l'utilisateur peut ex�cuter son script et interpr�ter le dessin cr�� :
scriptPrincipal.execute();
i.interpreter(d);

Un fichier svg est g�n�r� � l'ex�cution et peut �tre lu par des navigateurs web tels que Mozilla.