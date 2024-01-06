/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Steven Jimenez
 */
public class vendedor {
    private Integer id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String numero;
    private String correo;

    public vendedor() {
    }

    public vendedor(Integer id, String cedula, String nombre, String apellido, String numero) {
        this.id = null;
        this.cedula = null;
        this.nombre = null;
        this.apellido = null;
        this.numero = null;
        this.correo = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
      public Integer comparar(vendedor p, String field, Integer type) {
        // 0 menor, 1 mayor
        switch (type) {
            case 0:
                if (field.equalsIgnoreCase("apellido")) {
                    return apellido.compareTo(p.getApellido());
                } else if (field.equalsIgnoreCase("nombre")) {
                    return nombre.compareTo(p.getNombre());
                } else if (field.equalsIgnoreCase("cedula")) {
                    return cedula.compareTo(p.getCedula());
                } else if (field.equalsIgnoreCase("numero")) {
                    return numero.compareTo(p.getNumero());
                } else if (field.equalsIgnoreCase("correo")) {
                    return correo.compareTo(p.getCorreo());
                }
            case 1:
                if (field.equalsIgnoreCase("apellido")) {
                    return p.getApellido().compareTo(apellido);
                } else if (field.equalsIgnoreCase("nombre")) {
                    return p.getNombre().compareTo(nombre);
                } else if (field.equalsIgnoreCase("cedula")) {
                    return p.getCedula().compareTo(cedula);
                } else if (field.equalsIgnoreCase("numero")) {
                    return p.getNumero().compareTo(numero);
                } else if (field.equalsIgnoreCase("correo")) {
                    return p.getCorreo().compareTo(correo);
                }
            default:
                throw new AssertionError();
        }
    }
    
//      public Boolean compare(vendedor v, String field, Integer type) {
//        switch (type) {
//            case 0:
//                if (field.equalsIgnoreCase("nombre")) {
//                    return pasajero.getNombre().compareTo(v.getPasajero().getNombre()) < 0;
//                } else if (field.equalsIgnoreCase("apellido")) {
//                    return pasajero.getApellido().compareTo(v.getPasajero().getApellido()) < 0;
//                } else if (field.equalsIgnoreCase("dni")) {
//                    return pasajero.getDNI().compareTo(v.getPasajero().getDNI()) < 0;
//                } else if (field.equalsIgnoreCase("fechaSalida")) {
//                    return boleto.getFechaSalida().compareTo(v.getBoleto().getFechaSalida()) < 0;
//                } else if (field.equalsIgnoreCase("fechaCompra")) {
//                    return boleto.getFechaCompra().compareTo(v.getBoleto().getFechaCompra()) < 0;
//                } else if (field.equalsIgnoreCase("destino")) {
//                    return boleto.getDestino().compareTo(v.getBoleto().getDestino()) < 0;
//                } else if (field.equalsIgnoreCase("origen")) {
//                    return boleto.getOrigen().compareTo(v.getBoleto().getOrigen()) < 0;
//                } else if (field.equalsIgnoreCase("valor")) {
//                    return boleto.getValor().compareTo(v.getBoleto().getValor()) < 0;
//                }
//            case 1:
//                if (field.equalsIgnoreCase("nombre")) {
//                    return pasajero.getNombre().compareTo(v.getPasajero().getNombre()) > 0;
//                } else if (field.equalsIgnoreCase("apellido")) {
//                    return pasajero.getApellido().compareTo(v.getPasajero().getApellido()) > 0;
//                } else if (field.equalsIgnoreCase("dni")) {
//                    return pasajero.getDNI().compareTo(v.getPasajero().getDNI()) > 0;
//                } else if (field.equalsIgnoreCase("fechaSalida")) {
//                    return boleto.getFechaSalida().compareTo(v.getBoleto().getFechaSalida()) > 0;
//                } else if (field.equalsIgnoreCase("fechaCompra")) {
//                    return boleto.getFechaCompra().compareTo(v.getBoleto().getFechaCompra()) > 0;
//                } else if (field.equalsIgnoreCase("destino")) {
//                    return boleto.getDestino().compareTo(v.getBoleto().getDestino()) > 0;
//                } else if (field.equalsIgnoreCase("origen")) {
//                    return boleto.getOrigen().compareTo(v.getBoleto().getOrigen()) > 0;
//                } else if (field.equalsIgnoreCase("valor")) {
//                    return boleto.getValor().compareTo(v.getBoleto().getValor()) > 0;
//                }
//            default:
//                return null;
//        }
//    }
}
