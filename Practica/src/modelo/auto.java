/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Steven Jimenez
 */
public class auto {
    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private Double precio;

    public auto() {
    }
    public auto(Integer id, String placa, String marca, String modelo, String color, Double precio) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    

        public Integer comparar(auto p, String field, Integer type) {
        // 0 menor, 1 mayor
        switch (type) {
            case 0:
                if (field.equalsIgnoreCase("placa")) {
                    return placa.compareTo(p.getPlaca());
                } else if (field.equalsIgnoreCase("marca")) {
                    return marca.compareTo(p.getMarca());
                } else if (field.equalsIgnoreCase("modelo")) {
                    return modelo.compareTo(p.getModelo());
                } else if (field.equalsIgnoreCase("precio")) {
                    return color.compareTo(p.getColor());
                } else if (field.equalsIgnoreCase("id")) {
                    return id.compareTo(p.getId());
                }else if (field.equalsIgnoreCase("Precio")) {
                    return precio.compareTo(p.getPrecio());
                }
            case 1:
                if (field.equalsIgnoreCase("apellido")) {
                    return p.getPlaca().compareTo(placa);
                } else if (field.equalsIgnoreCase("marca")) {
                    return p.getMarca().compareTo(marca);
                } else if (field.equalsIgnoreCase("modelo")) {
                    return p.getModelo().compareTo(modelo);
                } else if (field.equalsIgnoreCase("numero")) {
                    return p.getColor().compareTo(color);
                } else if (field.equalsIgnoreCase("id")) {
                    return p.getId().compareTo(id);
                }else if (field.equalsIgnoreCase("Precio")) {
                    return p.getPrecio().compareTo(precio);}
            default:
                throw new AssertionError();
        }
    }
}
