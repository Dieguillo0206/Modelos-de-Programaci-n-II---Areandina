import java.util.Scanner;
public class punto1_actividad {
    public static void main(String[] args) {
        class Nodo {
            int dato_lista;
            Nodo siguiente;

            // Constructor para insertar datos en la lista
            public Nodo(int dato_lista) {
                this.dato_lista = dato_lista;
                this.siguiente = null;
            }
        }

        // Creación lista tipo pila
        class listaTipoPila {
            private Nodo cimaLista;

            public listaTipoPila() {
                this.cimaLista = null;
            }

            // Apilar elementos en la lista
            public void apilar(int dato) {
                Nodo nuevoNodo = new Nodo(dato);
                nuevoNodo.siguiente = cimaLista;
                cimaLista = nuevoNodo;
            }

            // Mostrar los elementos de la lista
            public void mostrarLista() {
                Nodo actual = cimaLista;
                while (actual != null) {
                    System.out.print(actual.dato_lista + " ");
                    actual = actual.siguiente;
                }
                System.out.println();
            }

            // Contar la cantidad de números pares en la lista
            public int contarNumerosPares() {
                int cuenta = 0;
                Nodo actual = cimaLista;
                while (actual != null) {
                    if (actual.dato_lista % 2 == 0) {
                        cuenta++;
                    }
                    actual = actual.siguiente;
                }
                return cuenta;
            }

            // Contar la cantidad de números impares en la lista
            public int contarNumerosImpares() {
                int cuenta = 0;
                Nodo actual = cimaLista;
                while (actual != null) {
                    if (actual.dato_lista % 2 != 0) {
                        cuenta++;
                    }
                    actual = actual.siguiente;
                }
                return cuenta;
            }

            // Calcular el promedio de los elementos de la lista
            public double calcularPromedio() {
                int suma = 0, cuenta = 0;
                Nodo actual = cimaLista;
                while (actual != null) {
                    suma += actual.dato_lista;
                    cuenta++;
                    actual = actual.siguiente;
                }
                return cuenta == 0 ? 0 : (double) suma / cuenta;
            }

            // Obtener el primer elemento de la lista
            public int obtenerPrimerDato() {
                return cimaLista != null ? cimaLista.dato_lista : -1;
            }

            // Obtener el último elemento de la lista
            public int obtenerUltimoDato() {
                Nodo actual = cimaLista;
                if (actual == null) return -1;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                return actual.dato_lista;
            }
        }

        // Creación lista tipo cola
        class listaTipoCola {
            private Nodo frenteLista, fondoLista;

            public listaTipoCola() {
                this.frenteLista = this.fondoLista = null;
            }

            // Agregar nuevos elementos al final de la cola
            public void encolar(int dato) {
                Nodo nuevoNodo = new Nodo(dato);
                if (fondoLista == null) {
                    frenteLista = fondoLista = nuevoNodo;
                    return;
                }
                fondoLista.siguiente = nuevoNodo;
                fondoLista = nuevoNodo;
            }

            // Mostrar los elementos de la lista
            public void mostrar() {
                Nodo actual = frenteLista;
                while (actual != null) {
                    System.out.print(actual.dato_lista + " ");
                    actual = actual.siguiente;
                }
                System.out.println();
            }

            // Contar la cantidad de números pares en la lista
            public int contarNumerosPares() {
                int cuenta = 0;
                Nodo actual = frenteLista;
                while (actual != null) {
                    if (actual.dato_lista % 2 == 0) {
                        cuenta++;
                    }
                    actual = actual.siguiente;
                }
                return cuenta;
            }

            // Contar la cantidad de números impares en la lista
            public int contarNumerosImpares() {
                int cuenta = 0;
                Nodo actual = frenteLista;
                while (actual != null) {
                    if (actual.dato_lista % 2 != 0) {
                        cuenta++;
                    }
                    actual = actual.siguiente;
                }
                return cuenta;
            }

            // Obtener el promedio de los elementos de la lista
            public double promedioLista() {
                int suma = 0, cuenta = 0;
                Nodo actual = frenteLista;
                while (actual != null) {
                    suma += actual.dato_lista;
                    cuenta++;
                    actual = actual.siguiente;
                }
                return cuenta == 0 ? 0 : (double) suma / cuenta;
            }

            public int obtenerPrimerDato() {
                return frenteLista != null ? frenteLista.dato_lista : -1;
            }

            public int obtenerUltimoDato() {
                return fondoLista != null ? fondoLista.dato_lista : -1;
            }
        }

        // Inicializar y leer datos
        Scanner scanner = new Scanner(System.in);
        listaTipoPila pila = new listaTipoPila();
        listaTipoCola cola = new listaTipoCola();

        System.out.print("Ingrese el número de elementos: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese elementos para la pila:");
        for (int i = 0; i < n; i++) {
            int elemento = scanner.nextInt();
            pila.apilar(elemento);
        }

        System.out.println("Ingrese elementos para la cola:");
        for (int i = 0; i < n; i++) {
            int elemento = scanner.nextInt();
            cola.encolar(elemento);
        }

        System.out.println("Elementos de la pila:");
        pila.mostrarLista();
        System.out.println("Cantidad de pares: " + pila.contarNumerosPares());
        System.out.println("Cantidad de impares: " + pila.contarNumerosImpares());
        System.out.println("Promedio: " + pila.calcularPromedio());
        System.out.println("Primer elemento: " + pila.obtenerPrimerDato());
        System.out.println("Último elemento: " + pila.obtenerUltimoDato());

        System.out.println("Elementos de la cola:");
        cola.mostrar();
        System.out.println("Cantidad de pares: " + cola.contarNumerosPares());
        System.out.println("Cantidad de impares: " + cola.contarNumerosImpares());
        System.out.println("Promedio: " + cola.promedioLista());
        System.out.println("Primer elemento: " + cola.obtenerPrimerDato());
        System.out.println("Último elemento: " + cola.obtenerUltimoDato());
    }
    }
