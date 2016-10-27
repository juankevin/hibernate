function holaMundo(descripcion) {
    return descripcion;
}
var descripcion = "Escribe tu nombre";
var resultado = holaMundo(descripcion);
var etiqueta = document.getElementById("contenedor");
etiqueta.innerHTML = resultado;
