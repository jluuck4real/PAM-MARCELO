# LogcatButton — fundamentos Android

Atividade acadêmica de interface Android desenvolvida com Kotlin e Jetpack Compose. Um campo mantém o nome informado em estado local e quatro botões escrevem mensagens personalizadas em diferentes níveis do Logcat.

**Kotlin · Android · Jetpack Compose · Gradle**

## Funcionalidades

- Campo de texto com estado em `remember` e `mutableStateOf`.
- Botões para mensagens de erro, aviso, depuração e informação.
- Identificação dos registros pela tag `TesteAndroid`.
- Componentes Compose reutilizáveis para os botões e o cabeçalho.

## Captura da atividade

![Captura 1 do projeto](https://github.com/user-attachments/assets/69067864-6632-46a8-9e3d-b02c309aa91c)

## Instalação e execução

```sh
git clone https://github.com/jluuck4real/PAM-MARCELO.git
```

1. Abra a pasta **LogcatButton** no Android Studio.
2. Instale os componentes do Android SDK solicitados e use o JDK compatível com o Gradle configurado no projeto.
3. Aguarde a sincronização do Gradle.
4. Selecione um emulador ou aparelho com depuração USB e execute o módulo `app`.
5. No Logcat, filtre por `TesteAndroid`, digite um nome e acione os botões.

No PowerShell, o build pode ser iniciado dentro de `LogcatButton` com:

```powershell
.\gradlew.bat assembleDebug
```

O APK de depuração fica em `app/build/outputs/apk/debug/`. O comando requer JDK e Android SDK configurados.

## Estrutura

```text
LogcatButton/
  app/src/main/java/com/example/logcatbutton/
    MainActivity.kt   Interface, estado e eventos
    ui/theme/         Tema Compose
  app/src/main/res/   Imagens e recursos Android
  gradle/            Configuração do wrapper e versões
```

O nome digitado permanece apenas no estado da interface; o projeto não demonstra banco de dados ou autenticação. Não há publicação em loja confirmada.

**Autor:** João Lucas Gomes Mendonça · **Contexto:** atividade de Programação de Aplicativos Mobile.
