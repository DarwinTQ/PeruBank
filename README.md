# PERU_BANK - Sistema de Gestión Bancaria
- ![PeruBank](/peruBank.png)

## Descripción
Para solucionar los problemas de lentitud, falta de integración y baja eficiencia en la gestión de datos bancarios, este proyecto propone el desarrollo de un sistema moderno basado en una base de datos relacional en Oracle y una aplicación de escritorio en Java SE.

El sistema permitirá gestionar clientes, cuentas bancarias, transacciones y productos financieros con un enfoque en seguridad, rendimiento y escalabilidad.

## Tecnologías Utilizadas
- **Base de Datos:** Oracle SQL Developer
- **Lenguaje de Programación:** Java SE
- **Entorno de Desarrollo:** NetBeans o Eclipse
- **Frameworks:** JDBC para conexión con la base de datos
- **Herramientas de Modelado:** Microsoft Visio, Oracle Data Modeler

## Estructura del Proyecto
El desarrollo del sistema se organiza en las siguientes fases:

### 1. Diseño Conceptual y Modelado de la Base de Datos
📌 **Creación del diagrama en Microsoft Visio:**
   - Representación de flujos de datos y procesos bancarios.
   - Identificación de entidades clave: Cliente, Cuenta, Transacción, Producto Financiero, etc.
   - ![Diagrama de Clases](/Peru_Bank_D_C.png)
   - ![Diagrama de Clases](/Peru_Bank_D_P.png)

📌 **Diseño del modelo Entidad-Relación en Oracle Data Modeler:**
   - Definición de relaciones entre entidades.
   - Optimización del almacenamiento de datos históricos.
   - Diagrama Logico
   - ![Diagrama Logico](/Diagrama_Logico.png)
   - Diagrama Relacional
   - ![Diagrama Relacional](/Diagrama_Relacional.png)

📌 **Transformación del modelo ER en un modelo relacional en Oracle SQL Developer:**
   - Creación de tablas, claves primarias y foráneas.
   - Implementación de procedimientos almacenados para operaciones eficientes.

### 2. Diseño de la Arquitectura del Sistema y Modelado UML
📌 **Diagramas UML creados en Microsoft Visio:**
   - Diagrama de clases y procesos del sistema.

📌 **Estructura del Proyecto en Java SE:**
   - Aplicación basada en el patrón **Modelo-Vista-Controlador (MVC)**.
   - Organización en paquetes:
     1. **GUI:** Interfaz gráfica modular con MDI Application y JInternalFrames.
     2. **Datos:** Conexión con Oracle mediante JDBC.
     3. **Lógica:** Clases de negocio con validaciones y procesamiento de datos.

### 3. Desarrollo de Funcionalidades Clave
📌 **Operaciones CRUD:**
   - Gestión de clientes, cuentas y productos financieros.
   - ![PeruBank](/peruBank_registro.png)
   - Registro y consulta de transacciones bancarias.
   - ![PeruBank](/peruBank_retiro.png)
   - Generación de reportes históricos.
   - ![PeruBank](/peruBank_reporte.png)

📌 **Optimización y Seguridad:**
   - Uso de procedimientos almacenados y transacciones para mejorar el rendimiento.
   - Implementación de autenticación y autorización con roles y permisos.

### 4. Pruebas, Implementación y Despliegue
📌 **Plan de pruebas:**
   - Pruebas unitarias, de integración y de carga.

📌 **Cronograma de implementación:**
   - Análisis y diseño del sistema → Desarrollo de base de datos → Programación en Java SE → Integración y pruebas → Despliegue y capacitación.

📌 **Documentación y Capacitación:**
   - Manuales de usuario y técnico.
   - Capacitación del personal bancario sobre el uso del sistema.

## Estructura de Archivos
```
D:\JAVA-PRUEBAS\NUEVO\PERU_BANK
│   build.xml
│   manifest.mf
│
├───build
│   └───classes
│       ├───datos
│       │       DB_connection.class
│       ├───giu
│       │       (Interfaces gráficas y formularios)
│       ├───logical
│       │       (Clases de negocio y lógica del sistema)
│
├───nbproject (Configuraciones de NetBeans)
├───src
│   ├───datos (Clases de acceso a la base de datos)
│   ├───giu (Interfaz gráfica de usuario en Swing)
│   ├───logical (Lógica de negocio)
│
└───test (Pruebas automatizadas)
```

## Instalación y Ejecución
1. Clonar el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/DarwinTQ/PERU_BANK.git
   ```
2. Importar el proyecto en NetBeans o Eclipse.
3. Configurar la conexión con la base de datos Oracle en `DB_connection.java`.
4. Ejecutar el archivo `Peru_Bank.java` para iniciar la aplicación.



---
🚀 **Desarrollado por:** [Darwin] - Proyecto de Gestión Bancaria - Java & Oracle

