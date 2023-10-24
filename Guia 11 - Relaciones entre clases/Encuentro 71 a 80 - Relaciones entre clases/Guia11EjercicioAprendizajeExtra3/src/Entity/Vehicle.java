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

public class Vehicle {
    
    private String manufacter;
    private String model;
    private Integer year;
    private String egineNumber;
    private String chasisNumber;
    private String color;
    private String type;
    private Client owner;
    private Policy insurance;

    public Vehicle() {
    }

    public Vehicle(String manufacter, String model, Integer year, String egineNumber, String chasisNumber, String color, String type, Client owner, Policy insurance) {
        this.manufacter = manufacter;
        this.model = model;
        this.year = year;
        this.egineNumber = egineNumber;
        this.chasisNumber = chasisNumber;
        this.color = color;
        this.type = type;
        this.owner = owner;
        this.insurance = insurance;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEgineNumber() {
        return egineNumber;
    }

    public void setEgineNumber(String egineNumber) {
        this.egineNumber = egineNumber;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Policy getInsurance() {
        return insurance;
    }

    public void setInsurance(Policy insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "manufacter=" + manufacter + ", model=" + model + ", year=" + year + ", egineNumber=" + egineNumber + ", chasisNumber=" + chasisNumber + ", color=" + color + ", type=" + type + ", owner=" + owner + ", insurance=" + insurance + '}';
    }
 
}
