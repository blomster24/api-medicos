package med.voll.api.domain.direccion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    private  String calle;
    private String numero;
    private String complemento;
    private String distrito;
    private String ciudad;

    public Direccion(DatosDireccion datosDireccion){
        this.calle=datosDireccion.calle();
        this.numero=datosDireccion.numero();
        this.distrito=datosDireccion.distrito();
        this.complemento=datosDireccion.complemento();
        this.ciudad=datosDireccion.ciudad();
    }


    public Direccion actualizarDatos(DatosDireccion direccion) {
        this.calle=direccion.calle();
        this.numero=direccion.numero();
        this.distrito=direccion.distrito();
        this.complemento=direccion.complemento();
        this.ciudad=direccion.ciudad();
        return this;
    }
}
