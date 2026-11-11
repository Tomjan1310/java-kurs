# Java-Kurs

Dein Ordner für den ganzen Java-Kurs. Öffne in VS Code immer **diesen** Ordner (**Datei** > **Ordner öffnen**),
nicht `src` oder einen Kapitelordner.

| Ordner | Inhalt |
| --- | --- |
| `src/kapitel_01` ... `src/kapitel_21` | dein Code, ein Ordner pro Kapitel |
| `src/exkurs_...` | Exkurse des Java-Kurses |
| `src/gui_01` ... `src/gui_10` | JavaFX-Tutorial (Programme mit Oberfläche) |
| `src/spiel_01` ... `src/spiel_05` | Spielekonzepte (Spiele mit JavaFX) |
| `src/game_of_life` | Game of Life (ein Programm, das mit jedem Kapitel wächst) |
| `src/nrw/` | die NRW-Klassen für das Abitur (`List`, `Queue`, `Stack`, `DatabaseConnector`, ...) -- nicht ändern |
| `lib/` | Zusatzbibliotheken (`.jar`), z.\ B. der DuckDB-Treiber für JavaFX Kapitel 9 |
| `bin/` | übersetzte Programme, legt VS Code selbst an |
| `.vscode/` | Einstellungen für VS Code |

Die erste Zeile jeder Datei nennt ihr Paket, also ihren Ordner: Eine Datei in `src/kapitel_03` beginnt mit
`package kapitel_03;`, eine in `src/kapitel_11/schueler` mit `package kapitel_11.schueler;`.
Wie du arbeitest und speicherst, steht in Kapitel 1 (*Wo speicherst du deinen Code?*).

Copilot im Terminal: `copilot-win32-x64.zip` von <https://github.com/github/copilot-cli/releases/latest> laden,
`copilot.exe` hier neben `src` ablegen, im Terminal `.\copilot.exe` starten, beim ersten Mal `/login`. Die Datei ist
über `.gitignore` von Git ausgeschlossen (zu groß für GitHub). Mehr in Kapitel 1.
