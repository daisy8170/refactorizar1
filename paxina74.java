
// /**
//  * Chama a funcion para mostrar a foto e logo imprime a identidade e a idade
//  * @param identidade
//  * @param idade
//  * @see SEN REFACTORIZAR
//  */
// void visualizarDatos(String identidade, int idade) {

//     mostrarFoto();
//     System.out.println("Identidade: " + identidade);
//     System.out.println("Idade: " + idade);
// }

//Reduccion loxica

/**
 * Chama a funcion para mostrar a foto e logo imprime a identidade e a idade
 * @param ident
 * @param idade
 * @see REFACTORIZADO
 */
void visualizarDatos(String ident, int idade) {

    /*mostrarFoto();*///Lo comento para que no me de problemas ya que no hice ningun metodo que muestre una foto
    mostrarDatos(ident, idade);
}

/**
 * Imprime a identidade e a idade
 * @param ident
 * @param anos
 * @see REFACTORIZADO
 */
void mostrarDatos(String ident, int anos){
    System.out.println("Ident: " + ident);
    System.out.println("Idade: " + anos);
}

