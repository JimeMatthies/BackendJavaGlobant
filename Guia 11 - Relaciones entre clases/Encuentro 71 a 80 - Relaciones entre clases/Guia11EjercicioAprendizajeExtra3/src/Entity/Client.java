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

import java.util.List;

public class Client {
    
    private String name;
    private String lastname;
    private String ssn;
    private String mail;
    private String address;
    private String phone;
    private List<Vehicle> vehicles;

    public Client() {
    }

    public Client(String name, String lastname, String ssn, String mail, String address, String phone, List<Vehicle> vehicles) {
        this.name = name;
        this.lastname = lastname;
        this.ssn = ssn;
        this.mail = mail;
        this.address = address;
        this.phone = phone;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", lastname=" + lastname + ", ssn=" + ssn + ", mail=" + mail + ", address=" + address + ", phone=" + phone + ", vehicles=" + vehicles + '}';
    }
    
}
