/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authenticate;

/**
 *
 * @author Jija
 */

/*Caractère	Description
.	Remplace tout caractère
*	Remplace une chaîne de 0, 1 ou plusieurs caractères
?	Remplace exactement un caractère
()	Groupe capturant
[]	Intervalle de caractères
{}	Quantificateur
\	Déspécialise le caractère spécial qu'il précède
^	Négation ou début de ligne
$	Fin de ligne
|	Ou logique entre deux sous-motifs
+	Numérateur
*/

public class Validateur {
    public boolean isValid(String password){
        return password.matches("\\w.*");
    }
}
