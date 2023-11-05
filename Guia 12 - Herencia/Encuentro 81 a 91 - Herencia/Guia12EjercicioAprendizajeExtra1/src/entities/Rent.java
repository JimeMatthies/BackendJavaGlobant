/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el nombre, documento 
del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
° Número de mástiles para veleros.
° Potencia en CV para barcos a motor.
° Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de alquiler y devolución), 
por un valor módulo de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y sumándole el atributo 
particular de cada barco. En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia 
en CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos necesarios que 
permitan al usuario elegir el barco que quiera alquilar y mostrarle el precio final de su alquiler.
@author JimeM
 */
package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Rent {

    private String clientName;
    private String clientDocument;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private Integer mooringPosition;
    private Boat boat;
    private DateTimeFormatter dtf;

    public Rent() {
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public Rent(String clientName, String clientDocument, LocalDate rentDate, LocalDate returnDate, Integer mooringPosition, Boat boat, DateTimeFormatter dtf) {
        this();
        this.clientName = clientName;
        this.clientDocument = clientDocument;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.boat = boat;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientDocument() {
        return clientDocument;
    }

    public void setClientDocument(String clientDocument) {
        this.clientDocument = clientDocument;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(Integer mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public Integer calculateRent() {
        Period period = Period.between(this.rentDate, this.returnDate);
        return period.getDays() * boat.calculateModule();
    }
    
        public void createRent(Boat boat) {
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Client's name: ");
        this.clientName = SC.next();
        System.out.println("Client's document: ");
        this.clientDocument = SC.next();
        System.out.println("Rent date (dd/mm/aaaa): ");
        this.rentDate = LocalDate.parse(SC.next(), this.dtf);
        System.out.println("Return date (dd/mm/aaaa): ");
        this.returnDate = LocalDate.parse(SC.next(), this.dtf);
        System.out.println("Mooring position: ");
        this.mooringPosition = SC.nextInt();
        this.boat = boat;
        System.out.println("Rent's price is: " + this.calculateRent());
    }

}
