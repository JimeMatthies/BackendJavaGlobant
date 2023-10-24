/*
Te ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes coberturas integrales 
para vehículos. Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de cada cliente que posea 
pólizas en nuestra empresa. Nombre y apellido, documento, mail, domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca, modelo, año, número de motor, 
chasis, color, tipo (camioneta, sedán, etc.).
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un vehículo, como los datos de 
un solo cliente. Los datos incluidos en ella son: número de póliza, fecha de inicio y fin de la póliza, cantidad de 
cuotas, forma de pago, monto total asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las relaciones entre clases. 
Recuerden que pueden ser de uno a uno, de uno a muchos, de muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza. Esas cuotas van a contener 
la siguiente información: número de cuota, monto total de la cuota, si está o no pagada, fecha de vencimiento, forma de 
pago (efectivo, transferencia, etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los requerimientos arriba descriptos. 
Modelando clases con atributos y sus correspondientes relaciones.
@author JimeM
 */
package Entity;

import java.time.LocalDate;
import java.util.List;

public class Policy {
    
    private Integer number;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer amountOfFees;
    private String methodOfPayment;
    private Double insuranceValue;
    private Boolean coverHail;
    private Double maxHail;
    private String typeOfInsurance;
    private List<Fee> fees;
    private Client owner;
    private Vehicle vehicle;

    public Policy() {
    }

    public Policy(Integer number, LocalDate startDate, LocalDate endDate, Integer amountOfFees, String methodOfPayment, Double insuranceValue, Boolean coverHail, Double maxHail, String typeOfInsurance, List<Fee> fees, Client owner, Vehicle vehicle) {
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amountOfFees = amountOfFees;
        this.methodOfPayment = methodOfPayment;
        this.insuranceValue = insuranceValue;
        this.coverHail = coverHail;
        this.maxHail = maxHail;
        this.typeOfInsurance = typeOfInsurance;
        this.fees = fees;
        this.owner = owner;
        this.vehicle = vehicle;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getAmountOfFees() {
        return amountOfFees;
    }

    public void setAmountOfFees(Integer amountOfFees) {
        this.amountOfFees = amountOfFees;
    }

    public String getMethodOfPayment() {
        return methodOfPayment;
    }

    public void setMethodOfPayment(String methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    public Double getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(Double insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public Boolean getCoverHail() {
        return coverHail;
    }

    public void setCoverHail(Boolean coverHail) {
        this.coverHail = coverHail;
    }

    public Double getMaxHail() {
        return maxHail;
    }

    public void setMaxHail(Double maxHail) {
        this.maxHail = maxHail;
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Policy{" + "number=" + number + ", startDate=" + startDate + ", endDate=" + endDate + ", amountOfFees=" + amountOfFees + ", methodOfPayment=" + methodOfPayment + ", insuranceValue=" + insuranceValue + ", coverHail=" + coverHail + ", maxHail=" + maxHail + ", typeOfInsurance=" + typeOfInsurance + ", fees=" + fees + ", owner=" + owner + ", vehicle=" + vehicle + '}';
    }

}
