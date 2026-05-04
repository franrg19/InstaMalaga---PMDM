# 📸 InstaMálaga
 
Aplicación Android desarrollada en Kotlin como proyecto del módulo de **Programación Multimedia en Dispositivos Móviles (PMDM)** del ciclo formativo DAM.
 
InstaMálaga es una galería fotográfica que muestra los rincones más bonitos de Málaga y su provincia.
 
---
 
## 🖥️ Pantallas
 
| Pantalla | Descripción |
|----------|-------------|
| `SplashActivity` | Pantalla de bienvenida con logo y botón de acceso |
| `MainActivity` | Galería principal en cuadrícula (GridView) |
| `DetalleActivity` | Vista ampliada de cada foto con título y descripción |
| `AcercaDeActivity` | Información sobre la app y el autor |
 
---
 
 
## 🛠️ Tecnologías
 
- **Lenguaje:** Kotlin
- **IDE:** Android Studio
- **SDK mínimo:** API 24 (Android 7.0)
- **Componentes:** GridView, LinearLayout, ImageView, TextView, Button
---
 
## 📁 Estructura del proyecto
 
```
app/src/main/
├── java/com.example.instamalaga/
│   ├── SplashActivity.kt
│   ├── MainActivity.kt
│   ├── DetalleActivity.kt
│   ├── AcercaDeActivity.kt
│   └── FotoAdapter.kt
└── res/
    ├── layout/
    │   ├── activity_splash.xml
    │   ├── activity_main.xml
    │   ├── activity_detalle.xml
    │   ├── activity_acerca_de.xml
    │   └── item_foto.xml
    └── drawable/
        └── malaga1.jpg ... malaga8.jpg
```
 
---
 
## 👤 Autor
 
**Fran Rebollo**  
DAM · PMDM · 2025-2026