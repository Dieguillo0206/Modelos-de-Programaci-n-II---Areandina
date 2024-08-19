import java.util.Scanner;
public class punto2_actividad {
    public static void main(String[] args) {
        class estudiantePlatzi{
            String nombre;
            int edad;
            String direccion;
            String ciudad;
            String pais;
            String correo;
            String telefono;
            String Curso;
            String Profesor;


            // Constructor para insertar datos en la lista
            public estudiantePlatzi(String nombre, int edad, String direccion, String ciudad, String pais, String correo, String telefono, String Curso, String Profesor) {
                this.nombre = nombre;
                this.edad = edad;
                this.direccion = direccion;
                this.ciudad = ciudad;
                this.pais = pais;
                this.correo = correo;
                this.telefono = telefono;
                this.Curso = Curso;
                this.Profesor = Profesor;

            }

            // Metodo para mostrar los datos de la persona
            @Override
            public String toString() {
                return "Nombre: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion + ", Ciudad: " + ciudad + ", Pais: " + pais + ", Correo: " + correo + ", Telefono: " + telefono + ", Curso: " + Curso + ", Profesor: " + Profesor;
            }
        }

// Clase Nodo
        class Nodo {
            estudiantePlatzi dato;
            Nodo siguiente;

            public Nodo(estudiantePlatzi dato) {
                this.dato = dato;
                this.siguiente = null;
            }
        }

// Clase ListaTipoPila
        class ListaTipoPila {
            private Nodo cimaLista;

            public ListaTipoPila() {
                this.cimaLista = null;
            }

            // Apilar elementos en la lista
            public void apilar(estudiantePlatzi dato) {
                Nodo nuevoNodo = new Nodo(dato);
                nuevoNodo.siguiente = cimaLista;
                cimaLista = nuevoNodo;
            }

            // Mostrar los elementos de la lista
            public void mostrarLista() {
                Nodo actual = cimaLista;
                while (actual != null) {
                    System.out.println(actual.dato);
                    actual = actual.siguiente;
                }
            }

            // Eliminar el primer elemento de la lista
            public void eliminarPrimerElemento() {
                if (cimaLista != null) {
                    cimaLista = cimaLista.siguiente;
                }
            }

            // Contar la cantidad de elementos en la lista
            public int contarElementos() {
                int count = 0;
                Nodo actual = cimaLista;
                while (actual != null) {
                    count++;
                    actual = actual.siguiente;
                }
                return count;
            }
        }

// Clase ListaTipoCola
        class ListaTipoCola {
            private Nodo frenteLista, fondoLista;

            public ListaTipoCola() {
                this.frenteLista = this.fondoLista = null;
            }

            // Encolar elementos en la lista
            public void encolar(estudiantePlatzi dato) {
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
                    System.out.println(actual.dato);
                    actual = actual.siguiente;
                }
            }

            // Eliminar el primer elemento de la lista
            public void eliminarPrimerElemento() {
                if (frenteLista != null) {
                    frenteLista = frenteLista.siguiente;
                    if (frenteLista == null) {
                        fondoLista = null;
                    }
                }
            }

            // Contar la cantidad de elementos en la lista
            public int contarElementos() {
                int count = 0;
                Nodo actual = frenteLista;
                while (actual != null) {
                    count++;
                    actual = actual.siguiente;
                }
                return count;
            }
        }

        Scanner scanner = new Scanner(System.in);
        ListaTipoPila pila = new ListaTipoPila();
        ListaTipoCola cola = new ListaTipoCola();

        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();
            System.out.print("País: ");
            String pais = scanner.nextLine();
            System.out.print("Correo: ");
            String correo = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Curso: ");
            String Curso = scanner.nextLine();
            System.out.print("Profesor: ");
            String Profesor = scanner.nextLine();


            estudiantePlatzi estudiantePlatzi = new estudiantePlatzi(nombre, edad, direccion, ciudad, pais, correo, telefono, Curso, Profesor);
            pila.apilar(estudiantePlatzi);
            cola.encolar(estudiantePlatzi);
        }

        System.out.println("Elementos de la pila:");
        pila.mostrarLista();
        pila.eliminarPrimerElemento();
        System.out.println("Elementos de la pila después de eliminar el primer elemento:");
        pila.mostrarLista();
        System.out.println("Cantidad de elementos restantes en la pila: " + pila.contarElementos());

        System.out.println("Elementos de la cola:");
        cola.mostrar();
        cola.eliminarPrimerElemento();
        System.out.println("Elementos de la cola después de eliminar el primer elemento:");
        cola.mostrar();
        System.out.println("Cantidad de elementos restantes en la cola: " + cola.contarElementos());
    }
}

