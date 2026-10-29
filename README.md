# Galatan Diana - Laborator SO Android
 
Proiect Android in Java, pachet `ro.so.android.galatandiana`. Un joc Snake construit pas cu pas.
 
## Laborator 2
 
- `MainActivity`: meniul, cu butoanele Start si Instructiuni.
- `GameActivity`: ecranul jocului, cu butonul de revenire la meniu.
- `InstructionsActivity`: ecranul cu regulile jocului.
Verificat in Logcat (`tag:Lab02`): metodele lifecycle apar la navigarea intre ecrane.
 
## Laborator 3
 
- `Cell`: o pozitie pe tabla (col, row).
- `GameState`: sarpele si obstacolele.
- `BoardView`: deseneaza tabla 10 x 10, sarpele si obstacolele si citeste atingerile.

 
Verificat in Logcat (`tag:Lab02`) si (`tag:Lab03`):
- `MainActivity` si `GameActivity` au acelasi PID.
- Atingerea in afara tablei afiseaza `atingere in afara tablei`.
 
