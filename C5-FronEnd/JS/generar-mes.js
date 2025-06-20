var mes;

switch (new Date().getMonth()) {
  // Enero es el 0
  case 0:
    mes = "Enero";
    break;
  case 1:
    mes = "Febrero";
    break;
  case 2:
    mes = "Marzo";
    break;
  case 3:
    mes = "Abril";
    break;
  case 4:
    mes = "Mayo";
    break;
  case 5:
    mes = "Junio";
    break;
  case 6:
    mes = "Julio";
    break;
  case 7:
    mes = "Agosto";
    break;
  case 8:
    mes = "Septiembre";
    break;
  default:
    mes = "No ha devuelto ningun mes";
    break;
}

document.write("Número de mes: " + new Date().getMonth());
document.getElementById("mes").innerHTML = "Estamos a " + mes;
