<h1 align="center">Encuentro 92 a 95 - Manejo de Excepciones</h1>

## Videos de Youtube:

Durante el curso se utilizan distintos videos con ejemplos y tips para aprender a programar. Puedes encontrarlos todos en esta lista de reproducción.

- [Lista de reproducción de Youtube](https://youtube.com/playlist?list=PLQ77MrE4f4tKN_NLQeICJ1rCjiLbj5r94)

## Link de Descarga de Java:

- [Instaladores Java 8u111 (JDK) + NetBeans 8.2](https://drive.google.com/drive/folders/1DD8oeKGXJupWcFUjWuVUrmKEwr_0X8MC)

## Importante!:

Desde JUnit en adelante todos los codigos seran totalmente en ingles (variables, comentarios) con el fin de practicar el idioma dentro del mismo.

## Respuestas Guía Manejo de Excepciones:

6.- Dado el método metodoA de la clase A, indique:

    class A {
        public void metodoA() {
            sentencia_a1
            sentencia_a2
            try {
                sentencia_a3
                sentencia_a4
            } catch (MioException e) {
                sentencia_a6
            }
            sentencia_a5
        }
    }

a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?

R: a1, a2, a6.

b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

R: a1, a2, a3, a4, a5.

7.- Dado el método metodoB de la clase B, indique:

    class B {
        public void metodoB() {
            sentencia_b1
            try {
                sentencia_b2
            } catch (MioException e){
                sentencia_b3
            } finally {
                sentencia_b4
            }
        }
    }

a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?

R: b1, b3, b4.

b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

R: b1, b2, b4.

8.- Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:

    class Uno{
        private static int metodo() {
            int valor = 0;
            try {
                valor = valor + 1;
                valor = valor + Integer.parseInt("42");
                valor = valor + 1;
                System.out.println("Valor final del try: " + valor);
            } catch (NumberFormatException e) {
                valor = valor + Integer.parseInt("42");
                System.out.println("Valor final del catch: " + valor);
            }finally {
                valor = valor + 1;
                System.out.println("Valor final del finally: " + valor);
            }
            valor = valor + 1;
            System.out.println("Valor antes del return: " + valor);
            return valor;
        }

        public static void main (String[] args) {
            try {
                System.out.println(metodo());
            } catch (Exception e) {
                System.err.println("Excepcion en metodo()");
                e.printStackTrace();
            }
        }
    }

R:\
Valor final del try: 44\
Valor final del finally: 45\
Valor antes del return: 46\
46

    class Dos{
        private static int metodo() {
            int valor = 0;
            try {
                valor = valor + 1;
                valor = valor + Integer.parseInt("W");
                valor = valor + 1;
                System.out.println("Valor final del try: " + valor);
            } catch (NumberFormatException e) {
                valor = valor + Integer.parseInt("42");
                System.out.println("Valor final del catch: " + valor);
            } finally {
                valor = valor + 1;
                System.out.println("Valor final del finally: " + valor);
            }
            valor = valor + 1;
            System.out.println("Valor antes del return: " + valor);
            return valor;
        }

        public static void main (String[] args) {
            try {
                System.out.println(metodo());
            } catch (Exception e) {
                System.err.println("Excepcion en metodo()");
                e.printStackTrace();
            }
        }
    }

R:\
Valor final del catch: 43\
Valor final del finally: 44\
Valor antes del return: 45\
45

    class Tres{
        private static int metodo() {
            int valor = 0;
            try {
                valor = valor + 1;
                valor = valor + Integer.parseInt("W");
                valor = valor + 1;
                System.out.println("Valor final del try: " + valor);
            } catch (NumberFormatException e) {
                valor = valor + Integer.parseInt("W");
                System.out.println("Valor final del catch: " + valor);
            } finally {
                valor = valor + 1;
                System.out.println("Valor final del finally: " + valor);
            }
            valor = valor + 1;
            System.out.println("Valor antes del return: " + valor);
            return valor;
        }

        public static void main (String[] args) {
            try {
                System.out.println(metodo());
            } catch (Exception e) {
                System.err.println("Excepcion en metodo()");
                e.printStackTrace();
            }
        }
    }

R:\
Valor final del finally: 2\
Excepcion en metodo()

9.- Dado el método metodoC de la clase C, indique:

    class C {
        void metodoC() throws TuException{
            sentencia_c1
            try {
                sentencia_c2
                sentencia_c3
            } catch (MioException e){
                sentencia_c4
            } catch (TuException e){
                sentencia_c5
                throw (e)
            } finally {
                sentencia_c6
            }
        }
    }

a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?

R: c1, c4, c6.

b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

R: c1, c2, c3, c6.

c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

R: c1, c5, c6.