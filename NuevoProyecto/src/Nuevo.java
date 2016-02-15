
//PR02

public class Nuevo {

public static void main(String[] args) {

String mensaje="Paquito es el tio mas guapo que conozco";

String mensajeCodificado="";

String temporal="";

//Covertimos las minusculas en mayusculas, haciendo que todo el string sea 
//mayusculas.

mensajeCodificado=mensaje.toUpperCase();

//Cambiamos la posicion de cada una de las letras

for(int i=0;i<mensaje.length();i=i+2){

if(i+1==mensaje.length()){

temporal=temporal+mensajeCodificado.charAt(i);

}else{

temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);

}

}

mensajeCodificado=temporal;

temporal="";

temporal=temporal+mensajeCodificado;

//Asignamos a temporal el contenido de mensajeCodificado.

mensajeCodificado=temporal;

//Mediante un "System.out.println" mostramos el contenido de mensajeCodificado con 

System.out.println(mensajeCodificado);

}

}






//PR03

public class Nuevo {

public static void main(String[] args) {

String mensaje="APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";

String mensajeCodificado="";

String temporal="";

//Covertimos las minusculas en mayusculas, haciendo que todo el string sea 
//mayusculas.

mensajeCodificado=mensaje.toLowerCase();

//Cambiamos la posicion de cada una de las letras

for(int i=0;i<mensaje.length();i=i+2){

if(i+1==mensaje.length()){

temporal=temporal+mensajeCodificado.charAt(i);

}else{

temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);

}

}

mensajeCodificado=temporal;

temporal="";

temporal=temporal+mensajeCodificado;

//Asignamos a temporal el contenido de mensajeCodificado.

mensajeCodificado=temporal;

//Mediante un "System.out.println" mostramos el contenido de mensajeCodificado con 

System.out.println(mensajeCodificado);

}
