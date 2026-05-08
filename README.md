# 🎬 FilmList - Aplicativo Android em Kotlin

Aplicativo Android desenvolvido em **Kotlin** para a disciplina de **Desenvolvimento Mobile**, com o objetivo de aplicar conceitos fundamentais do desenvolvimento Android.

## 📱 Proposta do Aplicativo

O **FIlmList** é um aplicativo simples de gerenciamento de filmes, onde o usuário pode:

- Visualizar uma lista de filmes
- Adicionar novos filmes
- Favoritar filmes
- Visualizar os filmes favoritados

O projeto foi desenvolvido para demonstrar, na prática, conceitos essenciais do Android utilizando Kotlin.

---

## 🚀 Funcionalidades

- ✅ Navegação entre telas com **Bottom Navigation**
- ✅ Cadastro de filmes
- ✅ Listagem de filmes com **RecyclerView**
- ✅ Sistema de favoritos
- ✅ Uso de **Fragments**
- ✅ Demonstração do ciclo de vida de Fragment
- ✅ Interface funcional executando no Android

---

## 🛠️ Tecnologias Utilizadas

- **Kotlin**
- **Android Studio**
- **RecyclerView**
- **Fragments**
- **Bottom Navigation**
- **View Binding**
- **Material Design**

---

## 📂 Estrutura do Projeto

```text
app
├── adapter
│   └── FilmeAdapter.kt
│
├── fragments
│   ├── HomeFragment.kt
│   ├── AddMovieFragment.kt
│   └── FavoritesFragment.kt
│
├── model
│   └── Filme.kt
│
└── MainActivity.kt
```

---

## 📌 Conceitos Aplicados

### Bottom Navigation
Utilizada para navegação entre as telas do aplicativo:
- Home
- Adicionar Filme
- Favoritos

### Data Class
Foi criada a classe:

```kotlin
data class Filme(
    val titulo: String,
    val ano: Int,
    val genero: String,
    var favorito: Boolean = false
)
```

### Entidade
A entidade do sistema é **Filme**, representando os dados dos filmes cadastrados.

### RecyclerView
Utilizada para exibir dinamicamente a lista de filmes e favoritos.

### Fragment
O aplicativo utiliza múltiplos Fragments para organização das telas:

- `HomeFragment`
- `AddMovieFragment`
- `FavoritesFragment`

### Ciclo de Vida
O ciclo de vida dos Fragments foi demonstrado utilizando logs no **Logcat**, incluindo métodos como:

- `onCreate()`
- `onStart()`
- `onResume()`
- `onPause()`
- `onStop()`
- `onDestroy()`

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Abra o projeto no **Android Studio**

3. Aguarde o Gradle sincronizar

4. Execute o aplicativo em:
- Emulador Android
- Dispositivo físico

---

## 👨‍💻 Desenvolvido para

Disciplina de **Desenvolvimento Mobile**  
Projeto acadêmico desenvolvido utilizando **Android Studio**.
