# tallerreferenciasypaquetes

prediccion l1.estaDisponible() → false: l2 apunta al mismo libro que l1, así que prestarlo con l2 también lo cambia en l1.
l3.estaDisponible() → true: l3 es otro libro creado con new y nadie lo prestó.
l1 == l2 → true: las dos variables apuntan al mismo objeto.
l1 == l3 → false: tienen los mismos datos, pero son objetos distintos.
