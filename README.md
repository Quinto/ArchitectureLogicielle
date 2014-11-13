ArchitectureLogicielle : Projet de dessin vectoriel
===================================================

=======
Auteurs
=======

Quentin ZANINETTI et Cheikh Sylla

=================
Contenu du projet
=================

Dans le répertoire src on peut trouver tout le code source du projet.

Le package fabrique
===================

Ce package contient les différentes fabriques permettant de construire les objets du langage créé.

DessinerChemin est une fabrique qui permet de créer une instance des différentes formes dessinables.
FabriqueStructure est une fabrique permettant de créer des structures logiques (boucles for, if then 
else, sequence d'instructions)
Manipulations est une fabrique qui permet de réaliser des manipulations spécifiques comme placer une 
étiquette dans un dessin ou remplir des formes d'une certaine couleur.
FabriqueObjet permet de créer des crayons et des scripts.

Le package langage
==================

Ce package contient les classes définissant le langage de dessin vectoriel créé. On y trouve les différents
objets du langage :
- Crayon qui définit comment sont tracés les formes
- Les chemins : ligne, cercle, rectangle, polygone
- Les structures logiques : For, Sequence, Alternative
- Les manipulations spécifiques : Remplir, Etiqueter
- Script étant l'objet de base contenant les instructions à exécuter pour définir le dessin.

Le package vue
==============

Ce package contient les interprétations qu'on peut faire d'un dessin.

Un interpréteurSVG est implémenté et il permet de traduire un dessin créé par un script en un fichier svg lisible
par un navigateur web comme Mozilla Firefox. Il est possible d'implémenter d'autres interprétations d'un dessin en
implémentant l'interface Interpreteur.

======================
Utilisation du langage
======================

L'utiliseur code son dessin vectoriel dans la méthode main de la classe Main. Il commence par déclarer un nouveau 
script et un nouveau dessin :
Script scriptPrincipal = FabriqueObjet.creerScript();
Dessin d = FabriqueObjet.creerDessin(nomDuDessin);

L'utilisateur peut se créer différents crayons qu'il pourra utiliser pour tracer les chemins :
Crayon c = FabriqueObjet.creerCrayon(largeurBordure, opaciteBordure, couleur)
Note : La couleur est une string étant le nom de la couleur voulue en anglais

L'utilisateur choisit ensuite un interpréteur pour son dessin :
Interpreteur i = FabriqueObjet.creerInterpreteurSVG();

L'utilisateur peut alors définir les différentes instructions qui constitueront son script :

- il peut simplement dessiner des chemins :
Instruction i1 = DessinerChemin.creerLigne(abscissePoint1, ordonneePoint1, abscissePoint2, ordonneePoint2, crayon, dessin);
Cette instruction permet de créer une ligne dans le dessin dessin avec le crayon crayon entre les points aux coordonnées choisies.
Instruction i2 = DessinerChemin.creerCercle(abscisseCentre, ordonneeCentre, rayon, crayon, dessin);
Meme chose pour un cercle en définissant son centre et son rayon.

- il peut utiliser des structures plus complexes :
Instruction i3 = FabriqueStructure.For(script, nbFois);
permet de répéter nbFois les instructions contenues dans le script script
Instruction i4 = FabriqueStructure.Alternative(bool, i1, i2);
permet d'exécuter i1 si bool est true et i2 sinon (Alternative ne prend pas forcément que des Instruction en argument,
il peut aussi prendre des scripts entiers)
Instruction i5 = FabriqueStructure.Sequence() permet de créer une séquence puis
i5.addToSequence(instruction) permet d'ajouter dans l'ordre d'exécution souhaité les instructions constituant la séquence
Par exemple :
i5.addToSequence(i2);
i5.addToSequence(i1);
fera s'exécuter i2 puis i1 quand la séquence sera exécutée.

- il peut faire d'autres manipulations :
Instruction i6 = Manipulations.Remplir(i2, "yellow"); permet de récupérer le cercle créé par i2 et de le remplir en jaune
Instruction i7 = Manipulations.Etiqueter(texte, origineX, origineY, dessin, taillePolice, couleur); permet de créer
une étiquette contenant le texte texte dont le coin inférieur gauche est placé en (origineX, origineY) dans le dessin dessin
et dont la taille de police et la couleur sont définies.

Lorsque l'utilisateur a écrit ses différentes instructions il doit les attacher à un script dans l'ordre d'exécution voulu :
scriptPrincipal.addInstruction(instruction);

Pour finir l'utilisateur peut exécuter son script et interpréter le dessin créé :
scriptPrincipal.execute();
i.interpreter(d);

Un fichier svg est généré à l'exécution et peut être lu par des navigateurs web tels que Mozilla.