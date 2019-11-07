# language: es
Característica: Proceso Judicial
  David como ciudadano quiere consultar sus procesos judiciales

    Escenario: Consultar el proceso judicial 0000000000
        Dado que "David" esta consultando el proceso judicial
        Cuando selecciona Ciudad "MEDELLIN" , entidad "TRIBUNAL ADMINISTRATIVO DE ANTIOQUIA (ESCRITURAL)" y numero radicado "0000000000"
        Entonces deberia poder seleccionar la consulta