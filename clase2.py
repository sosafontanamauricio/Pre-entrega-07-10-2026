print("==================================================")
print("  Sistema de gestión cliente: SIBELIUS ")
print("==================================================\n")

print("--- 1. Cálculo inicial de stock y costos ---")
precio_producto = 1500.0
cantidad_deseada = 5

costo_total = precio_producto * cantidad_deseada
print(f"Precio unitario: ${precio_producto}")
print(f"Cantidad deseada: {cantidad_deseada}")
print(f"Costo total inicial: ${costo_total}")

cantidad_deseada = 12
costo_total = precio_producto * cantidad_deseada
print(f"\n[Verificación] Modificando cantidad a {cantidad_deseada} unidades...")
print(f"Nuevo costo total recalculado: ${costo_total}\n")


print("--- 2. Interacción con el cliente ---")
nombre_cliente = input("Por favor, ingresá tu nombre: ")
cantidad_comprada = int(input(f"¡Hola {nombre_cliente}! Ingresá la cantidad de productos que deseás comprar: "))

PRECIO_FIJO_UNIDAD = 2500.0
monto_total = cantidad_comprada * PRECIO_FIJO_UNIDAD

print(f"\n--> Resumen para {nombre_cliente}: El monto total por {cantidad_comprada} unidades es de ${monto_total}.\n")


print("--- 3. Verificación de Descuentos (Condicionales) ---")
if cantidad_comprada > 100:
    print("📢 ¡Excelente noticia! Superás las 100 unidades. Aplica descuento especial del 15%.")
else:
    print("ℹ️ Compra regular: No se alcanza el volumen mínimo (>100 unidades) para el descuento especial.\n")


print("--- 4. Proceso de revisión de productos pendientes ---")
numero_limite = int(input("Ingresá un número límite de productos a revisar para la auditoría: "))

print(f"\n[Recorrido con FOR - Hasta {numero_limite}]")
for i in range(1, numero_limite + 1):
    print(f"✔️ Revisando producto pendiente N° {i}...")

print(f"\n[Recorrido con WHILE - Hasta {numero_limite}]")
contador = 1
while contador <= numero_limite:
    print(f"✔️ Revisando producto pendiente N° {contador}...")
    contador += 1

print("\n==================================================")
print("     ¡Proceso finalizado con éxito por el equipo!   ")
print("==================================================")